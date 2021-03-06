/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package org.jikesrvm.adaptive.measurements;

import java.util.Vector;

//import org.jikesrvm.energy.ProfileQueue;
import org.jikesrvm.ia32.StackframeLayoutConstants;
import org.jikesrvm.adaptive.controller.Controller;
import org.jikesrvm.adaptive.measurements.listeners.ContextListener;
import org.jikesrvm.adaptive.measurements.listeners.MethodListener;
import org.jikesrvm.adaptive.measurements.listeners.MethodEventCounterListener;
import org.jikesrvm.adaptive.measurements.listeners.NullListener;
import org.jikesrvm.adaptive.util.AOSLogging;
import org.jikesrvm.architecture.StackFrameLayout;
import org.jikesrvm.compilers.common.CompiledMethod;
import org.jikesrvm.compilers.common.CompiledMethods;
import org.jikesrvm.runtime.Magic;
import org.vmmagic.pragma.Uninterruptible;
import org.vmmagic.unboxed.Address;

/**
 * RuntimeMeasurements manages listeners, decayable objects, and
 * reportable objects.<p>
 *
 * A listener is installed by an organizer, and activated at thread
 * switch time by Thread.  Depending on the update method that the
 * listener supports, it can be either a method, context, or a null
 * listener.  Currently we have different registries for different
 * listeners.  An alternative design is to have one register with where
 * entries are tagged.<p>
 *
 * A decayable object implements the Decayable interface.
 * Anyone can register a decayable object,
 * The DecayOrganizer periodically decays all objects that have
 * been registers.<p>
 *
 * A reportable object implements the Reportable interface, and
 * is typically registered and used by the instrumentation subsystem.
 * A Reporable can be reset and reported.
 */
public abstract class RuntimeMeasurements {

  /////////////////////////////////////////////////////////////////////////
  // Support for gathering profile data on timer ticks
  /////////////////////////////////////////////////////////////////////////

  /**
   * listeners on timer ticks for methods
   */
  private static MethodListener[] timerMethodListeners = new MethodListener[0];

  /**
   * listeners on timer ticks for contexts
   */
  private static ContextListener[] timerContextListeners = new ContextListener[0];

  /**
   * listeners on timer ticks for nulls
   */
  private static NullListener[] timerNullListeners = new NullListener[0];

  //Kenan
  private static MethodEventCounterListener[] eventCounterMethodListeners;


  public static void initEventCounterMethodListener() {
	  if(eventCounterMethodListeners == null)
		  eventCounterMethodListeners = new MethodEventCounterListener[0];
  }
  /**
   * Install a method energy listener on timer ticks = new MethodEnergyListener[0];
   * @author kenan
   * @param s
   */
  public static synchronized void installEventCounterMethodListener(MethodEventCounterListener s) {
//	  eventCounterMethodListeners = new MethodEnergyListener[0];
//	  if(eventCounterMethodListeners.length == 0) {
//	  VM.sysWriteln("-----------kenan: install energy method listerner set----------");
//	  }
	  int numListeners = eventCounterMethodListeners.length;
//	  VM.sysWriteln("timerNullListeners initialize size: " + timerNullListeners.length );
//	  VM.sysWriteln("eventCounterMethodListeners initialize size: " + numListeners );
	  MethodEventCounterListener[] tmp = new MethodEventCounterListener[numListeners + 1];
	    for (int i = 0; i < numListeners; i++) {
	        tmp[i] = eventCounterMethodListeners[i];
	      }
//	  System.arraycopy(eventCounterMethodListeners, 0, tmp, 0, numListeners);
	    tmp[numListeners] = s;
	  eventCounterMethodListeners = tmp;

//	  VM.sysWriteln("after initialize size: " + eventCounterMethodListeners.length);
  }

  /**
   * Install a method listener on timer ticks
   * @param s method listener to be installed
   */
  public static synchronized void installTimerMethodListener(MethodListener s) {
    int numListeners = timerMethodListeners.length;
    MethodListener[] tmp = new MethodListener[numListeners + 1];
    for (int i = 0; i < numListeners; i++) {
      tmp[i] = timerMethodListeners[i];
    }
    tmp[numListeners] = s;
    timerMethodListeners = tmp;
  }

  /**
   * Install a context listener on timer ticks
   * @param s context listener to be installed
   */
  public static synchronized void installTimerContextListener(ContextListener s) {
    int numListeners = timerContextListeners.length;
    ContextListener[] tmp = new ContextListener[numListeners + 1];
    for (int i = 0; i < numListeners; i++) {
      tmp[i] = timerContextListeners[i];
    }
    tmp[numListeners] = s;
    timerContextListeners = tmp;
  }

  /**
   * Install a null listener on timer ticks
   * @param s null listener to be installed
   */
  public static synchronized void installTimerNullListener(NullListener s) {
    int numListeners = timerNullListeners.length;
    NullListener[] tmp = new NullListener[numListeners + 1];
    for (int i = 0; i < numListeners; i++) {
      tmp[i] = timerNullListeners[i];
    }
    tmp[numListeners] = s;
    timerNullListeners = tmp;
  }


/**
 * Called from Thread.yieldpoint to do event counter profiling.
 * @author Kenan
 * @param whereFrom
 * @param yieldpointServiceMethodFP
 */
@Uninterruptible
public static void takeEventCounterSample(int whereFrom, Address yieldpointServiceMethodFP) {
//	VM.sysWriteln("Kenan: take event counter sample begins!");
//	    Address ypTakenInFP = Magic.getCallerFramePointer(yieldpointServiceMethodFP); // method that took yieldpoint
//	    // Get the cmid for the method in which the yieldpoint was taken.
//	    int ypTakenInCMID = Magic.getCompiledMethodID(ypTakenInFP);
//
//	    if(isOutOfBoundary(ypTakenInCMID))
//	    	return;

	    //In the first stage of AOS run, all methods are cold.
	    //After that, If the current method is considered
	    //as hot method by its execution time in previous stage.
	    // Get the cmid for that method's caller.
//		if (!ProfileQueue.isSkippableMethod(ypTakenInCMID) && ProfileQueue.longMethods[ypTakenInCMID]) {
////			VM.sysWriteln("Kenan: The method id is: " + ypTakenInCMID + " the future execution time is: " + ProfileQueue.hotMethodExeTime[ypTakenInCMID]);
//			Address ypTakenInCallerFP = Magic
//					.getCallerFramePointer(ypTakenInFP);
//			int ypTakenInCallerCMID = Magic
//					.getCompiledMethodID(ypTakenInCallerFP);
//
//			// Determine if ypTakenInCallerCMID corresponds to a real Java
//			// stackframe.
//			// If one of the following conditions is detected, set
//			// ypTakenInCallerCMID to -1
//			// Caller is out-of-line assembly (no RVMMethod object) or
//			// top-of-stack psuedo-frame
//			// Caller is a native method
//			CompiledMethod ypTakenInCM = CompiledMethods
//					.getCompiledMethod(ypTakenInCMID);
////			if(whereFrom == RVMThread.PROLOGUE)
////				VM.sysWriteln("taken event counter sample method prologue: " + ypTakenInCM.getMethod());
////			else if(whereFrom == RVMThread.EPILOGUE)
////				VM.sysWriteln("taken event counter sample method epilogue: " + ypTakenInCM.getMethod());
////			VM.sysWriteln("Kenan: The method id is: " + ypTakenInCMID +
////					" method name is: " + ypTakenInCM.getMethod() + " the future execution time is: " + ProfileQueue.hotMethodExeTime[ypTakenInCMID]);
//			if (ypTakenInCallerCMID == StackframeLayoutConstants.INVISIBLE_METHOD_ID
//					|| ypTakenInCM.getMethod().getDeclaringClass()
//							.hasBridgeFromNativeAnnotation()) {
//				ypTakenInCallerCMID = -1;
//			} else {
//				// Notify all registered listeners
//				for (MethodEventCounterListener listener : eventCounterMethodListeners) {
//					if (listener.isActive()) {
//						listener.update(ypTakenInCMID, whereFrom, ypTakenInCM);
//					}
//				}
//
//			}
//		} else {
////			VM.sysWriteln("current method is cold");
//		}
}
  /**
   * Called from Thread.yieldpoint every time it is invoked due to
   * a timer interrupt.
   *
   * @param whereFrom source of the yieldpoint (e.g. backedge)
   * @param yieldpointServiceMethodFP the frame pointer of the service
   *  method that is responsible for handling the yieldpoint
   */
  @Uninterruptible
  public static void takeTimerSample(int whereFrom, Address yieldpointServiceMethodFP) {
    // We use timer ticks as a rough approximation of time.
    // TODO: kill controller clock in favor of reportedTimerTicks
    // PNT: huh?
    Controller.controllerClock++;

    Address ypTakenInFP = Magic.getCallerFramePointer(yieldpointServiceMethodFP); // method that took yieldpoint

    // Get the cmid for the method in which the yieldpoint was taken.
    int ypTakenInCMID = Magic.getCompiledMethodID(ypTakenInFP);

    // Get the cmid for that method's caller.
    Address ypTakenInCallerFP = Magic.getCallerFramePointer(ypTakenInFP);
    int ypTakenInCallerCMID = Magic.getCompiledMethodID(ypTakenInCallerFP);

    // Determine if ypTakenInCallerCMID corresponds to a real Java stackframe.
    // If one of the following conditions is detected, set ypTakenInCallerCMID to -1
    //    Caller is out-of-line assembly (no RVMMethod object) or top-of-stack psuedo-frame
    //    Caller is a native method
    CompiledMethod ypTakenInCM = CompiledMethods.getCompiledMethod(ypTakenInCMID);
    if (ypTakenInCallerCMID == StackFrameLayout.getInvisibleMethodID() ||
        ypTakenInCM.getMethod().getDeclaringClass().hasBridgeFromNativeAnnotation()) {
      ypTakenInCallerCMID = -1;
    }

    // Notify all registered listeners
    for (NullListener aNl : timerNullListeners) {
      if (aNl.isActive()) {
        aNl.update(whereFrom);
      }
    }
    for (MethodListener aMl : timerMethodListeners) {
      if (aMl.isActive()) {
        aMl.update(ypTakenInCMID, ypTakenInCallerCMID, whereFrom);
      }
    }
    if (ypTakenInCallerCMID != -1) {
      for (ContextListener aCl : timerContextListeners) {
        if (aCl.isActive()) {
          aCl.update(ypTakenInFP, whereFrom);
        }
      }
    }
  }

  /////////////////////////////////////////////////////////////////////////
  // Support for gathering profile data on CBS samples
  /////////////////////////////////////////////////////////////////////////

  /**
   * method listeners that trigger on CBS Method yieldpoints
   */
  private static MethodListener[] cbsMethodListeners = new MethodListener[0];

  /**
   * context listeners that trigger on CBS call yieldpoints
   */
  private static ContextListener[] cbsContextListeners = new ContextListener[0];

  /**
   * Install a method listener on CBS ticks
   * @param s method listener to be installed
   */
  public static synchronized void installCBSMethodListener(MethodListener s) {
    int numListeners = cbsMethodListeners.length;
    MethodListener[] tmp = new MethodListener[numListeners + 1];
    for (int i = 0; i < numListeners; i++) {
      tmp[i] = cbsMethodListeners[i];
    }
    tmp[numListeners] = s;
    cbsMethodListeners = tmp;
  }

  /**
   * Install a context listener on CBS ticks
   * @param s context listener to be installed
   */
  public static synchronized void installCBSContextListener(ContextListener s) {
    int numListeners = cbsContextListeners.length;
    ContextListener[] tmp = new ContextListener[numListeners + 1];
    for (int i = 0; i < numListeners; i++) {
      tmp[i] = cbsContextListeners[i];
    }
    tmp[numListeners] = s;
    cbsContextListeners = tmp;
  }

  /**
   * Called from Thread.yieldpoint when it is time to take a CBS method sample.
   *
   * @param whereFrom source of the yieldpoint (e.g. backedge)
   * @param yieldpointServiceMethodFP the frame pointer of the service
   *  method that is responsible for handling the yieldpoint
   */
  @Uninterruptible
  public static void takeCBSMethodSample(int whereFrom, Address yieldpointServiceMethodFP) {
    Address ypTakenInFP = Magic.getCallerFramePointer(yieldpointServiceMethodFP); // method that took yieldpoint

    // Get the cmid for the method in which the yieldpoint was taken.
    int ypTakenInCMID = Magic.getCompiledMethodID(ypTakenInFP);

    // Get the cmid for that method's caller.
    Address ypTakenInCallerFP = Magic.getCallerFramePointer(ypTakenInFP);
    int ypTakenInCallerCMID = Magic.getCompiledMethodID(ypTakenInCallerFP);

    // Determine if ypTakenInCallerCMID corresponds to a real Java stackframe.
    // If one of the following conditions is detected, set ypTakenInCallerCMID to -1
    //    Caller is out-of-line assembly (no RVMMethod object) or top-of-stack psuedo-frame
    //    Caller is a native method
    CompiledMethod ypTakenInCM = CompiledMethods.getCompiledMethod(ypTakenInCMID);
    if (ypTakenInCallerCMID == StackFrameLayout.getInvisibleMethodID() ||
        ypTakenInCM.getMethod().getDeclaringClass().hasBridgeFromNativeAnnotation()) {
      ypTakenInCallerCMID = -1;
    }

    // Notify all registered listeners
    for (MethodListener methodListener : cbsMethodListeners) {
      if (methodListener.isActive()) {
        methodListener.update(ypTakenInCMID, ypTakenInCallerCMID, whereFrom);
      }
    }
  }

  /**
   * Called from Thread.yieldpoint when it is time to take a CBS call sample.
   *
   * @param whereFrom source of the yieldpoint (e.g. backedge)
   * @param yieldpointServiceMethodFP the frame pointer of the service
   *  method that is responsible for handling the yieldpoint
   */
  @Uninterruptible
  public static void takeCBSCallSample(int whereFrom, Address yieldpointServiceMethodFP) {
    Address ypTakenInFP = Magic.getCallerFramePointer(yieldpointServiceMethodFP); // method that took yieldpoint

    // Get the cmid for the method in which the yieldpoint was taken.
    int ypTakenInCMID = Magic.getCompiledMethodID(ypTakenInFP);

    // Get the cmid for that method's caller.
    Address ypTakenInCallerFP = Magic.getCallerFramePointer(ypTakenInFP);
    int ypTakenInCallerCMID = Magic.getCompiledMethodID(ypTakenInCallerFP);

    // Determine if ypTakenInCallerCMID corresponds to a real Java stackframe.
    // If one of the following conditions is detected, set ypTakenInCallerCMID to -1
    //    Caller is out-of-line assembly (no RVMMethod object) or top-of-stack psuedo-frame
    //    Caller is a native method
    CompiledMethod ypTakenInCM = CompiledMethods.getCompiledMethod(ypTakenInCMID);
    if (ypTakenInCallerCMID == StackFrameLayout.getInvisibleMethodID() ||
        ypTakenInCM.getMethod().getDeclaringClass().hasBridgeFromNativeAnnotation()) {
      // drop sample
    } else {
      // Notify all registered listeners
      for (ContextListener listener : cbsContextListeners) {
        if (listener.isActive()) {
          listener.update(ypTakenInFP, whereFrom);
        }
      }
    }
  }

  /////////////////////////////////////////////////////////////////////////
  // Support for decay
  /////////////////////////////////////////////////////////////////////////

  /**
   * The currently registered decayable objects
   */
  static final Vector<Decayable> decayObjects = new Vector<Decayable>();

  /**
   * Counts the number of decay events
   */
  static int decayEventCounter = 0;

  /**
   *  Registers an object that should be decayed.
   *  The passed object will have its decay method called when the
   *  decaying thread decides it is time for the system to decay.
   *
   *  @param obj the object to decay
   */
  public static void registerDecayableObject(Decayable obj) {
    decayObjects.add(obj);
  }

  /**
   * Decays all registered decayable objects.
   */
  public static void decayDecayableObjects() {
    decayEventCounter++;
    AOSLogging.logger.decayingCounters();

    for (Decayable obj : decayObjects) {
      obj.decay();
    }
  }

  /////////////////////////////////////////////////////////////////////////
  // Support for reportable objects
  /////////////////////////////////////////////////////////////////////////

  /**
   * The currently registered reportable objects
   */
  static Vector<Reportable> reportObjects = new Vector<Reportable>();

  /**
   * Registers an object that wants to have its report method called
   * whenever RuntimeMeasurements.report is called.
   *
   * @param obj the object to report about
   */
  public static void registerReportableObject(Reportable obj) {
    reportObjects.add(obj);
  }

  /**
   * Calls {@link Reportable#reset()} on all registered reportable
   * objects.
   */
  public static void resetReportableObjects() {
    for (Reportable obj : reportObjects) {
      obj.reset();
    }
  }

  /**
   * Calls {@link Reportable#report()} on all registered reportable
   * objects.
   */
  private static void reportReportableObjects() {
    for (Reportable obj : reportObjects) {
      obj.report();
    }
  }

  /**
   * Reports the current state of runtime measurements.
   */
  public static void report() {
    reportReportableObjects();

    AOSLogging.logger.decayStatistics(decayEventCounter);
  }

  /**
   * Stop the runtime measurement subsystem
   */
  public static synchronized void stop() {
    timerMethodListeners = new MethodListener[0];
    timerContextListeners = new ContextListener[0];
    timerNullListeners = new NullListener[0];

    cbsMethodListeners = new MethodListener[0];
    cbsContextListeners = new ContextListener[0];
  }

  /**
   * Called when the VM is booting
   */
  public static void boot() { }
}

