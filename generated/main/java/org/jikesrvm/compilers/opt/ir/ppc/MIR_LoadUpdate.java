
/*
 * THIS FILE IS MACHINE_GENERATED. DO NOT EDIT.
 * See InstructionFormats.template, InstructionFormatList.dat,
 * OperatorList.dat, etc.
 */

package org.jikesrvm.compilers.opt.ir.ppc;

import org.jikesrvm.Configuration;
import org.jikesrvm.compilers.opt.ir.operand.ppc.PowerPCConditionOperand;
import org.jikesrvm.compilers.opt.ir.operand.ppc.PowerPCTrapOperand;
import org.jikesrvm.compilers.opt.ir.operand.*;
import org.jikesrvm.compilers.opt.ir.Instruction;
import org.jikesrvm.compilers.opt.ir.Operator;

/**
 * The MIR_LoadUpdate InstructionFormat class.
 *
 * The header comment for {@link Instruction} contains
 * an explanation of the role of InstructionFormats in the
 * opt compiler's IR.
 */
@SuppressWarnings("unused")  // Machine generated code is never 100% clean
public final class MIR_LoadUpdate extends ArchInstructionFormat {
  /**
   * InstructionFormat identification method for MIR_LoadUpdate.
   * @param i an instruction
   * @return <code>true</code> if the InstructionFormat of the argument
   *         instruction is MIR_LoadUpdate or <code>false</code>
   *         if it is not.
   */
  public static boolean conforms(Instruction i) {
    return conforms(i.operator());
  }
  /**
   * InstructionFormat identification method for MIR_LoadUpdate.
   * @param o an instruction
   * @return <code>true</code> if the InstructionFormat of the argument
   *         operator is MIR_LoadUpdate or <code>false</code>
   *         if it is not.
   */
  public static boolean conforms(Operator o) {
    return o.format == MIR_LoadUpdate_format;
  }

  /**
   * Get the operand called Result from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Result
   */
  public static RegisterOperand getResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (RegisterOperand) i.getOperand(0);
  }
  /**
   * Get the operand called Result from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Result
   */
  public static RegisterOperand getClearResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (RegisterOperand) i.getClearOperand(0);
  }
  /**
   * Set the operand called Result in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Result the operand to store
   */
  public static void setResult(Instruction i, RegisterOperand Result) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    i.putOperand(0, Result);
  }
  /**
   * Return the index of the operand called Result
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Result
   *         in the argument instruction
   */
  public static int indexOfResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return 0;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Result?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Result or <code>false</code>
   *         if it does not.
   */
  public static boolean hasResult(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return i.getOperand(0) != null;
  }

  /**
   * Get the operand called Address from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Address
   */
  public static RegisterOperand getAddress(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (RegisterOperand) i.getOperand(1);
  }
  /**
   * Get the operand called Address from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Address
   */
  public static RegisterOperand getClearAddress(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (RegisterOperand) i.getClearOperand(1);
  }
  /**
   * Set the operand called Address in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Address the operand to store
   */
  public static void setAddress(Instruction i, RegisterOperand Address) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    i.putOperand(1, Address);
  }
  /**
   * Return the index of the operand called Address
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Address
   *         in the argument instruction
   */
  public static int indexOfAddress(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return 1;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Address?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Address or <code>false</code>
   *         if it does not.
   */
  public static boolean hasAddress(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return i.getOperand(1) != null;
  }

  /**
   * Get the operand called Offset from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Offset
   */
  public static Operand getOffset(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (Operand) i.getOperand(2);
  }
  /**
   * Get the operand called Offset from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Offset
   */
  public static Operand getClearOffset(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (Operand) i.getClearOperand(2);
  }
  /**
   * Set the operand called Offset in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Offset the operand to store
   */
  public static void setOffset(Instruction i, Operand Offset) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    i.putOperand(2, Offset);
  }
  /**
   * Return the index of the operand called Offset
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Offset
   *         in the argument instruction
   */
  public static int indexOfOffset(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return 2;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Offset?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Offset or <code>false</code>
   *         if it does not.
   */
  public static boolean hasOffset(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return i.getOperand(2) != null;
  }

  /**
   * Get the operand called Location from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Location
   */
  public static LocationOperand getLocation(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (LocationOperand) i.getOperand(3);
  }
  /**
   * Get the operand called Location from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Location
   */
  public static LocationOperand getClearLocation(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (LocationOperand) i.getClearOperand(3);
  }
  /**
   * Set the operand called Location in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Location the operand to store
   */
  public static void setLocation(Instruction i, LocationOperand Location) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    i.putOperand(3, Location);
  }
  /**
   * Return the index of the operand called Location
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Location
   *         in the argument instruction
   */
  public static int indexOfLocation(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return 3;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Location?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Location or <code>false</code>
   *         if it does not.
   */
  public static boolean hasLocation(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return i.getOperand(3) != null;
  }

  /**
   * Get the operand called Guard from the
   * argument instruction. Note that the returned operand
   * will still point to its containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Guard
   */
  public static Operand getGuard(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (Operand) i.getOperand(4);
  }
  /**
   * Get the operand called Guard from the argument
   * instruction clearing its instruction pointer. The returned
   * operand will not point to any containing instruction.
   * @param i the instruction to fetch the operand from
   * @return the operand called Guard
   */
  public static Operand getClearGuard(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return (Operand) i.getClearOperand(4);
  }
  /**
   * Set the operand called Guard in the argument
   * instruction to the argument operand. The operand will
   * now point to the argument instruction as its containing
   * instruction.
   * @param i the instruction in which to store the operand
   * @param Guard the operand to store
   */
  public static void setGuard(Instruction i, Operand Guard) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    i.putOperand(4, Guard);
  }
  /**
   * Return the index of the operand called Guard
   * in the argument instruction.
   * @param i the instruction to access.
   * @return the index of the operand called Guard
   *         in the argument instruction
   */
  public static int indexOfGuard(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return 4;
  }
  /**
   * Does the argument instruction have a non-null
   * operand named Guard?
   * @param i the instruction to access.
   * @return <code>true</code> if the instruction has an non-null
   *         operand named Guard or <code>false</code>
   *         if it does not.
   */
  public static boolean hasGuard(Instruction i) {
    if (Configuration.ExtremeAssertions && !conforms(i)) fail(i, "MIR_LoadUpdate");
    return i.getOperand(4) != null;
  }


  /**
   * Create an instruction of the MIR_LoadUpdate instruction format.
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Location the instruction's Location operand
   * @param Guard the instruction's Guard operand
   * @return the newly created MIR_LoadUpdate instruction
   */
  public static Instruction create(Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , LocationOperand Location
                   , Operand Guard
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    Instruction i = Instruction.create(o, 5);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, Location);
    i.putOperand(4, Guard);
    return i;
  }

  /**
   * Mutate the argument instruction into an instruction of the
   * MIR_LoadUpdate instruction format having the specified
   * operator and operands.
   * @param i the instruction to mutate
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Location the instruction's Location operand
   * @param Guard the instruction's Guard operand
   * @return the mutated instruction
   */
  public static Instruction mutate(Instruction i, Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , LocationOperand Location
                   , Operand Guard
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    i.changeOperatorTo(o);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, Location);
    i.putOperand(4, Guard);
    return i;
  }
  /**
   * Create an instruction of the MIR_LoadUpdate instruction format.
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Location the instruction's Location operand
   * @return the newly created MIR_LoadUpdate instruction
   */
  public static Instruction create(Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , LocationOperand Location
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    Instruction i = Instruction.create(o, 5);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, Location);
    return i;
  }

  /**
   * Mutate the argument instruction into an instruction of the
   * MIR_LoadUpdate instruction format having the specified
   * operator and operands.
   * @param i the instruction to mutate
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Location the instruction's Location operand
   * @return the mutated instruction
   */
  public static Instruction mutate(Instruction i, Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , LocationOperand Location
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    i.changeOperatorTo(o);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, Location);
    i.putOperand(4, null);
    return i;
  }
  /**
   * Create an instruction of the MIR_LoadUpdate instruction format.
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Guard the instruction's Guard operand
   * @return the newly created MIR_LoadUpdate instruction
   */
  public static Instruction create(Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , Operand Guard
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    Instruction i = Instruction.create(o, 5);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(4, Guard);
    return i;
  }

  /**
   * Mutate the argument instruction into an instruction of the
   * MIR_LoadUpdate instruction format having the specified
   * operator and operands.
   * @param i the instruction to mutate
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @param Guard the instruction's Guard operand
   * @return the mutated instruction
   */
  public static Instruction mutate(Instruction i, Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                   , Operand Guard
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    i.changeOperatorTo(o);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, null);
    i.putOperand(4, Guard);
    return i;
  }
  /**
   * Create an instruction of the MIR_LoadUpdate instruction format.
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @return the newly created MIR_LoadUpdate instruction
   */
  public static Instruction create(Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    Instruction i = Instruction.create(o, 5);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    return i;
  }

  /**
   * Mutate the argument instruction into an instruction of the
   * MIR_LoadUpdate instruction format having the specified
   * operator and operands.
   * @param i the instruction to mutate
   * @param o the instruction's operator
   * @param Result the instruction's Result operand
   * @param Address the instruction's Address operand
   * @param Offset the instruction's Offset operand
   * @return the mutated instruction
   */
  public static Instruction mutate(Instruction i, Operator o
                   , RegisterOperand Result
                   , RegisterOperand Address
                   , Operand Offset
                )
  {
    if (Configuration.ExtremeAssertions && !conforms(o)) fail(o, "MIR_LoadUpdate");
    i.changeOperatorTo(o);
    i.putOperand(0, Result);
    i.putOperand(1, Address);
    i.putOperand(2, Offset);
    i.putOperand(3, null);
    i.putOperand(4, null);
    return i;
  }
}

