
/*
 * THIS FILE IS MACHINE_GENERATED. DO NOT EDIT.
 * See InstructionFormats.template, InstructionFormatList.dat,
 * OperatorList.dat, etc.
 */

package org.jikesrvm.compilers.opt.ir;

import org.jikesrvm.Configuration;
import org.jikesrvm.compilers.opt.ir.operand.*;

/**
 * The TrapIf InstructionFormat class.
 *
 * The header comment for {@link Instruction} contains
 * an explanation of the role of InstructionFormats in the
 * opt compiler's IR.
 */
@SuppressWarnings("unused")  // Machine generated code is never 100% clean
public final class TrapIf extends InstructionFormat {
  /**
   * InstructionFormat identification method for TrapIf.
   * @param i an instruction
   * @return <code>true</code> if the InstructionFormat of the argument
   *         instruction is TrapIf or <code>false</code>
   *         if it is not.
   */
  public static boolean conforms(Instruction i) {
    return conforms(i.operator());
  }
  /**
   * InstructionFormat identification method for TrapIf.
   * @param o an instruction
   * @return <code>true</code> if the InstructionFormat of the argument
   *         operator is TrapIf or <code>false</code>
   *         if it is not.
   */
  public static boolean conforms(Operator o) {
    return o.format == TrapIf_format;
  }

  /**
   * Get the operand called GuardResult from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called GuardResult
   */
  public static RegisterOperand getGuardResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (RegisterOperand) i.getOperand(0);
  }
  /**
   * Get the operand called GuardResult from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called GuardResult
   */
  public static RegisterOperand getClearGuardResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (RegisterOperand) i.getClearOperand(0);
  }
  /**
   * Set the operand called GuardResult in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param GuardResult the operand to store
   */
  public static void setGuardResult(Instruction i, RegisterOperand GuardResult) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    i.putOperand(0, GuardResult);
  }
  /**
   * Return the index of the operand called GuardResult
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called GuardResult
   *         in the argument instruction
   */
  public static int indexOfGuardResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return 0;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named GuardResult?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named GuardResult or <code>false</code>
   *         if it does not.
   */
  public static boolean hasGuardResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return i.getOperand(0) != null;
  }

  /**
   * Get the operand called Val1 from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Val1
   */
  public static Operand getVal1(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (Operand) i.getOperand(1);
  }
  /**
   * Get the operand called Val1 from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Val1
   */
  public static Operand getClearVal1(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (Operand) i.getClearOperand(1);
  }
  /**
   * Set the operand called Val1 in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Val1 the operand to store
   */
  public static void setVal1(Instruction i, Operand Val1) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    i.putOperand(1, Val1);
  }
  /**
   * Return the index of the operand called Val1
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Val1
   *         in the argument instruction
   */
  public static int indexOfVal1(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return 1;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Val1?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Val1 or <code>false</code>
   *         if it does not.
   */
  public static boolean hasVal1(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return i.getOperand(1) != null;
  }

  /**
   * Get the operand called Val2 from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Val2
   */
  public static Operand getVal2(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (Operand) i.getOperand(2);
  }
  /**
   * Get the operand called Val2 from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Val2
   */
  public static Operand getClearVal2(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (Operand) i.getClearOperand(2);
  }
  /**
   * Set the operand called Val2 in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Val2 the operand to store
   */
  public static void setVal2(Instruction i, Operand Val2) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    i.putOperand(2, Val2);
  }
  /**
   * Return the index of the operand called Val2
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Val2
   *         in the argument instruction
   */
  public static int indexOfVal2(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return 2;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Val2?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Val2 or <code>false</code>
   *         if it does not.
   */
  public static boolean hasVal2(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return i.getOperand(2) != null;
  }

  /**
   * Get the operand called Cond from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Cond
   */
  public static ConditionOperand getCond(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (ConditionOperand) i.getOperand(3);
  }
  /**
   * Get the operand called Cond from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Cond
   */
  public static ConditionOperand getClearCond(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (ConditionOperand) i.getClearOperand(3);
  }
  /**
   * Set the operand called Cond in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Cond the operand to store
   */
  public static void setCond(Instruction i, ConditionOperand Cond) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    i.putOperand(3, Cond);
  }
  /**
   * Return the index of the operand called Cond
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Cond
   *         in the argument instruction
   */
  public static int indexOfCond(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return 3;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Cond?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Cond or <code>false</code>
   *         if it does not.
   */
  public static boolean hasCond(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return i.getOperand(3) != null;
  }

  /**
   * Get the operand called TCode from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called TCode
   */
  public static TrapCodeOperand getTCode(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (TrapCodeOperand) i.getOperand(4);
  }
  /**
   * Get the operand called TCode from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called TCode
   */
  public static TrapCodeOperand getClearTCode(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return (TrapCodeOperand) i.getClearOperand(4);
  }
  /**
   * Set the operand called TCode in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param TCode the operand to store
   */
  public static void setTCode(Instruction i, TrapCodeOperand TCode) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    i.putOperand(4, TCode);
  }
  /**
   * Return the index of the operand called TCode
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called TCode
   *         in the argument instruction
   */
  public static int indexOfTCode(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return 4;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named TCode?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named TCode or <code>false</code>
   *         if it does not.
   */
  public static boolean hasTCode(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "TrapIf");
    return i.getOperand(4) != null;
  }


  /**
   * Create an instruction of the TrapIf instruction format.
   * @param o the instruction's operator
   * @param GuardResult the instruction's GuardResult operand
   * @param Val1 the instruction's Val1 operand
   * @param Val2 the instruction's Val2 operand
   * @param Cond the instruction's Cond operand
   * @param TCode the instruction's TCode operand
   * @return the newly created TrapIf instruction
   */
  public static Instruction create(Operator o
                   , RegisterOperand GuardResult
                   , Operand Val1
                   , Operand Val2
                   , ConditionOperand Cond
                   , TrapCodeOperand TCode
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "TrapIf");
    Instruction i = Instruction.create(o, 5);
    i.putOperand(0, GuardResult);
    i.putOperand(1, Val1);
    i.putOperand(2, Val2);
    i.putOperand(3, Cond);
    i.putOperand(4, TCode);
    return i;
  }

  /**
   * Mutate the argument instruction into an instruction of the
   * TrapIf instruction format having the specified
   * operator and operands.
   * @param i the instruction to mutate
   * @param o the instruction's operator
   * @param GuardResult the instruction's GuardResult operand
   * @param Val1 the instruction's Val1 operand
   * @param Val2 the instruction's Val2 operand
   * @param Cond the instruction's Cond operand
   * @param TCode the instruction's TCode operand
   * @return the mutated instruction
   */
  public static Instruction mutate(Instruction i, Operator o
                   , RegisterOperand GuardResult
                   , Operand Val1
                   , Operand Val2
                   , ConditionOperand Cond
                   , TrapCodeOperand TCode
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "TrapIf");
    i.changeOperatorTo(o);
    i.putOperand(0, GuardResult);
    i.putOperand(1, Val1);
    i.putOperand(2, Val2);
    i.putOperand(3, Cond);
    i.putOperand(4, TCode);
    return i;
  }
}

