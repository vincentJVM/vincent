expname=$1
iters=$2
samples="2"
ondemand=$3
#if [ -d $expname ]
#then
#	rm -r $expname
#fi

mkdir $expname


#sudo bash run_experiments.sh jython old $((iters+1)) $samples 2 $expname
#sudo bash run_experiments.sh pmd old $((iters+1)) $samples 2 $expname
#sudo bash run_experiments.sh xalan old $((iters+1)) $samples 2 $expname
#sudo bash run_experiments.sh sunflow new $iters $samples 2  $expname
#sudo bash run_experiments.sh luindex new $iters $samples 2 $expname
#sudo bash run_experiments.sh fop old $((iters+1)) $samples 2 $expname
#sudo bash run_experiments.sh avrora new $iters $samples 2 $expname
sudo bash run_experiments.sh lusearch new $iters $samples 2 $expname
sudo bash run_experiments.sh hsqldb old $((iters+1)) $samples 2 $expname
sudo bash run_experiments.sh sunflow new $iters $samples 2  $expname
#sudo bash run_experiments.sh xalan old $((iters+1)) $samples 2 $expname
