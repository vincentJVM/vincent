#include <unistd.h>
#include <sys/types.h>
#include <sys/syscall.h>
#include <stdio.h>
#include <stdlib.h>
#include "sys.h"
#include <time.h>

#define MAX_NAME_LEN 256
#define METHOD_ENTRY_PREALLOC 512


typedef struct method_entry {
	char names[METHOD_ENTRY_PREALLOC][MAX_NAME_LEN];
	char classes[METHOD_ENTRY_PREALLOC][MAX_NAME_LEN];
	int num_entries;
	struct method_entry* next;

} method_entry;


struct method_entry *current_method_entry;
struct method_entry *head_method_entry;
int method_counter =0;
FILE *log_file;
method_entry* allocate_method_entry() {
	method_entry *temp = malloc(sizeof(struct method_entry));
	temp->num_entries=0;
	memset(temp->names,'\0',sizeof(temp->names));
	memset(temp->classes,'\0',sizeof(temp->classes));
	return temp;
}

void assign_method_entry(char* m, char* c) {
	int log_indx=current_method_entry->num_entries;
	strcpy(&current_method_entry->names[log_indx],m);
	strcpy(&current_method_entry->classes[log_indx],c);
	current_method_entry->num_entries++;
}


void print_method_name(int mid) {
    int search_index=0;
    method_entry *m_entry = head_method_entry;
    int entry_order = mid / METHOD_ENTRY_PREALLOC;
    
    while(search_index<entry_order) {
    	m_entry = m_entry->next;
	search_index++;
    }

    int entry_index = mid % METHOD_ENTRY_PREALLOC;
    fprintf(log_file,"%s.%s,",m_entry->classes[entry_index],m_entry->names[entry_index]);
}

int add_method_entry(char* method_name, char* cls) {
	if(current_method_entry->num_entries == METHOD_ENTRY_PREALLOC) {
		current_method_entry->next = allocate_method_entry();
		current_method_entry = current_method_entry->next;
	}

	assign_method_entry(method_name,cls);
	return method_counter++;
}


#define MAX_THREADS 1000

	pid_t get_tid() {
	    syscall(SYS_gettid);
	}

	int allocated_g;

	int number_of_threads;
	int num_profile_attrs;
	int pre_allocation=500;


	void check_malloc(void *address, char* message) {
	    if(!address) {
		printf("**** malloc failed %s", message);
		exit(0);
	    }
	}

	typedef struct thread_stats {
	    long long* timestamps;
	    long int* cmdids;
	    long* frequencies;
	    double *profile_attrs;
	    long log_num;
	    struct thread_stats *next;
	    int tid;
	} thread_stats;

	__thread struct thread_stats *stats;
	__thread struct thread_stats *current;
	struct thread_stats** thread_stats_g;

	extern thread_stats *allocate_thread_stats() {
	    thread_stats* lstats  = malloc(sizeof(thread_stats));
	    check_malloc(lstats,"Allocating stats object failed");
	    lstats->timestamps=malloc(sizeof(long long) * pre_allocation);
	    check_malloc(lstats->timestamps, "Allocating Timestamps");
	    lstats->cmdids=malloc(sizeof(long int)*pre_allocation);
	    check_malloc(lstats->cmdids,"Allocating CMDIDS");
	    lstats->profile_attrs=malloc(sizeof(double)*pre_allocation*num_profile_attrs);
	    check_malloc(lstats->profile_attrs,"Allocating Profile Attributes");
	    lstats->frequencies=malloc(sizeof(long)*pre_allocation);
	    check_malloc(lstats->frequencies,"Allocating frequencies");
	    lstats->next=0;
	    lstats->log_num=0;
	    return lstats;
	}


	//This method needs to be called from Jikes
	/**
	 * This method must be called in a thread-safe context.
	 * When a new thread is started in JikesRVM, a thread calls this method
	 * to initialize its data strcutures and register pointers to its data structure
	 */
	extern void register_thread_stat() {
	    stats =  allocate_thread_stats();
	    current = stats;
	    thread_stats_g[number_of_threads]=stats;
	    number_of_threads++;
	}

	void assign_log_entry(double* attrs, long int cmdid,long timestamp,long freq) {
	    //printf("[assign_log_entry] Assigning \n ");
    	    struct timespec spec;
	    clock_gettime(CLOCK_MONOTONIC,&spec);
	    long long ts = spec.tv_sec*1000000000 + spec.tv_nsec;
	    //current->timestamps[current->log_num]=ts;
	    current->timestamps[current->log_num]=timestamp;
	    current->cmdids[current->log_num]=cmdid;
	    current->frequencies[current->log_num]=freq;
	    int profile_start_indx = current->log_num*num_profile_attrs;
	    for(int attr_indx=0; attr_indx < num_profile_attrs;attr_indx++) {
		current->profile_attrs[profile_start_indx+attr_indx]=attrs[attr_indx];
	    }

	    current->tid = get_tid();
	    //current->tid = -1;
	    current->log_num++;
	    //printf("[assign_log_entry] Assigned \n");
	    //stats->log_num++;
	}


	//This method needs to be called from Jikes
	extern void add_log_entry(double* attrs, long int cmdid,long timestamp,long freq) {
	    
	    //printf("[add_log_entry] .... \n");
	    //printf("Current Log Num %d \n",current->log_num);
	    
	    if(current->log_num==pre_allocation) {
		//printf("[add_log_entry] pre_allocation exceeded. allocating new memoery \n");
		current->next=allocate_thread_stats();
		current = current->next;
	    }
	    assign_log_entry(attrs,cmdid,timestamp,freq);
}

extern void print_logs() {
    printf("[print_counters_g] .... Number of threads is %d \n", number_of_threads);
    log_file=fopen("kenan.csv","a");
    char* stats_log="";
    for(int thread_idx=0;thread_idx<number_of_threads;thread_idx++) {
        thread_stats* thread_stat = thread_stats_g[thread_idx];
        while(thread_stat) {
            int log_indx = 0;
            for(log_indx=0;log_indx < thread_stat->log_num;log_indx++) {
                fprintf(log_file,"%ld,",thread_stat->frequencies[log_indx]);	
		fprintf(log_file,"%ld,",thread_stat->timestamps[log_indx]);
                print_method_name(thread_stat->cmdids[log_indx]);
		fprintf(log_file,"%d,",thread_stat->tid);
                fprintf(log_file,"%ld,", thread_stat->cmdids[log_indx]);
                int profile_indx = log_indx*num_profile_attrs;
                for(int profile_attr = 0; profile_attr < num_profile_attrs; profile_attr++) {
                    int profile_attr_indx =  profile_indx + profile_attr;
                    fprintf(log_file,"%f,",thread_stat->profile_attrs[profile_attr_indx]);
                }
                fprintf(log_file,"%s","\n");
            }
            thread_stat = thread_stat->next;
        }
    }

}

extern void init_log_queue(int p_pre_allocation, int profile_attrs) {
	current_method_entry = allocate_method_entry();
	head_method_entry = current_method_entry;
	num_profile_attrs = profile_attrs;
	pre_allocation = p_pre_allocation*1000;
	thread_stats_g = malloc(sizeof(void*)*MAX_THREADS);
	check_malloc(thread_stats_g,"Allocationg Thread Pointers");
}


/*int main() {
    printf("Verifying log-queue implementation on one thread before porting to JikeRVM \n");
    init_log_queue(250,5);
    printf("Successfully allocated %d pointers\n", MAX_THREADS);
    register_thread_stat();

    for (int i=0;i<505;i++) {
        double *pr = malloc(sizeof(double)*5);
        pr[0]=i*1.0;
        pr[1]=i*1.0;
        pr[2]=i*1.0;
        pr[3]=i*1.0;
        pr[4]=i*1.0;
        add_log_entry(pr,i,i);
    }


    printf("Successfully Added Log Entries \n");
    print_logs();

    return 0;
}*/
