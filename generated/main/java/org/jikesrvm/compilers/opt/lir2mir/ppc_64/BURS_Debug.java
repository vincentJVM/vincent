package org.jikesrvm.compilers.opt.lir2mir.ppc_64; 
public class BURS_Debug {
  /** For a given rule number the string version of the rule it corresponds to */
  public static final String[] string = {
    /* 0 */ null,
    /* 1 */"stm: r",
    /* 2 */"r: czr",
    /* 3 */"r: rs",
    /* 4 */"r: rz",
    /* 5 */"rs: rp",
    /* 6 */"rz: rp",
    /* 7 */"any: r",
    /* 8 */"r: REGISTER",
    /* 9 */"any: NULL",
    /* 10 */"any: ADDRESS_CONSTANT",
    /* 11 */"any: INT_CONSTANT",
    /* 12 */"any: LONG_CONSTANT",
    /* 13 */"stm: RESOLVE",
    /* 14 */"stm: IG_PATCH_POINT",
    /* 15 */"stm: UNINT_BEGIN",
    /* 16 */"stm: UNINT_END",
    /* 17 */"stm: YIELDPOINT_PROLOGUE",
    /* 18 */"stm: YIELDPOINT_EPILOGUE",
    /* 19 */"stm: YIELDPOINT_BACKEDGE",
    /* 20 */"r: FRAMESIZE",
    /* 21 */"stm: NOP",
    /* 22 */"r: GUARD_MOVE",
    /* 23 */"r: GUARD_COMBINE",
    /* 24 */"r: GET_CAUGHT_EXCEPTION",
    /* 25 */"stm: FENCE",
    /* 26 */"stm: WRITE_FLOOR",
    /* 27 */"stm: READ_CEILING",
    /* 28 */"stm: ILLEGAL_INSTRUCTION",
    /* 29 */"stm: TRAP",
    /* 30 */"rs: REF_MOVE(INT_CONSTANT)",
    /* 31 */"rs: REF_MOVE(INT_CONSTANT)",
    /* 32 */"rs: REF_MOVE(INT_CONSTANT)",
    /* 33 */"stm: GOTO",
    /* 34 */"stm: RETURN(NULL)",
    /* 35 */"r: GET_TIME_BASE",
    /* 36 */"stm: IR_PROLOGUE",
    /* 37 */"r: REF_MOVE(ADDRESS_CONSTANT)",
    /* 38 */"r: REF_MOVE(LONG_CONSTANT)",
    /* 39 */"any: OTHER_OPERAND(any,any)",
    /* 40 */"stm: TRAP_IF(r,r)",
    /* 41 */"r: BOOLEAN_CMP_INT(r,r)",
    /* 42 */"boolcmp: BOOLEAN_CMP_INT(r,r)",
    /* 43 */"r: BOOLEAN_CMP_ADDR(r,r)",
    /* 44 */"boolcmp: BOOLEAN_CMP_ADDR(r,r)",
    /* 45 */"r: REF_ADD(r,r)",
    /* 46 */"r: REF_SUB(r,r)",
    /* 47 */"r: INT_MUL(r,r)",
    /* 48 */"r: INT_DIV(r,r)",
    /* 49 */"r: INT_REM(r,r)",
    /* 50 */"rz: INT_SHL(r,r)",
    /* 51 */"rs: INT_SHR(r,r)",
    /* 52 */"rz: INT_USHR(r,r)",
    /* 53 */"r: REF_AND(r,r)",
    /* 54 */"r: REF_OR(r,r)",
    /* 55 */"r: REF_XOR(r,r)",
    /* 56 */"r: FLOAT_ADD(r,r)",
    /* 57 */"r: DOUBLE_ADD(r,r)",
    /* 58 */"r: FLOAT_MUL(r,r)",
    /* 59 */"r: DOUBLE_MUL(r,r)",
    /* 60 */"r: FLOAT_SUB(r,r)",
    /* 61 */"r: DOUBLE_SUB(r,r)",
    /* 62 */"r: FLOAT_DIV(r,r)",
    /* 63 */"r: DOUBLE_DIV(r,r)",
    /* 64 */"rs: BYTE_LOAD(r,r)",
    /* 65 */"rp: UBYTE_LOAD(r,r)",
    /* 66 */"rs: SHORT_LOAD(r,r)",
    /* 67 */"rp: USHORT_LOAD(r,r)",
    /* 68 */"r: FLOAT_LOAD(r,r)",
    /* 69 */"r: DOUBLE_LOAD(r,r)",
    /* 70 */"rs: INT_LOAD(r,r)",
    /* 71 */"stm: INT_IFCMP(r,r)",
    /* 72 */"stm: INT_IFCMP2(r,r)",
    /* 73 */"stm: FLOAT_IFCMP(r,r)",
    /* 74 */"stm: DOUBLE_IFCMP(r,r)",
    /* 75 */"stm: FLOAT_CMPL(r,r)",
    /* 76 */"stm: FLOAT_CMPG(r,r)",
    /* 77 */"stm: DOUBLE_CMPL(r,r)",
    /* 78 */"stm: DOUBLE_CMPG(r,r)",
    /* 79 */"r: CALL(r,any)",
    /* 80 */"r: SYSCALL(r,any)",
    /* 81 */"r: OTHER_OPERAND(r,r)",
    /* 82 */"r: YIELDPOINT_OSR(any,any)",
    /* 83 */"r: PREPARE_INT(r,r)",
    /* 84 */"r: PREPARE_LONG(r,r)",
    /* 85 */"r: ATTEMPT_INT(r,r)",
    /* 86 */"r: ATTEMPT_LONG(r,r)",
    /* 87 */"r: LONG_MUL(r,r)",
    /* 88 */"r: LONG_DIV(r,r)",
    /* 89 */"r: LONG_REM(r,r)",
    /* 90 */"r: LONG_SHL(r,r)",
    /* 91 */"r: LONG_SHR(r,r)",
    /* 92 */"r: LONG_USHR(r,r)",
    /* 93 */"r: LONG_CMP(r,r)",
    /* 94 */"stm: LONG_IFCMP(r,r)",
    /* 95 */"r: LONG_LOAD(r,r)",
    /* 96 */"r: PREPARE_ADDR(r,r)",
    /* 97 */"r: ATTEMPT_ADDR(r,r)",
    /* 98 */"stm: LOWTABLESWITCH(r)",
    /* 99 */"stm: NULL_CHECK(r)",
    /* 100 */"stm: SET_CAUGHT_EXCEPTION(r)",
    /* 101 */"stm: DCBF(r)",
    /* 102 */"stm: DCBST(r)",
    /* 103 */"stm: DCBT(r)",
    /* 104 */"stm: DCBTST(r)",
    /* 105 */"stm: DCBZ(r)",
    /* 106 */"stm: DCBZL(r)",
    /* 107 */"stm: ICBI(r)",
    /* 108 */"stm: TRAP_IF(r,INT_CONSTANT)",
    /* 109 */"stm: TRAP_IF(r,LONG_CONSTANT)",
    /* 110 */"r: BOOLEAN_NOT(r)",
    /* 111 */"r: BOOLEAN_CMP_INT(r,INT_CONSTANT)",
    /* 112 */"boolcmp: BOOLEAN_CMP_INT(r,INT_CONSTANT)",
    /* 113 */"r: BOOLEAN_CMP_ADDR(r,INT_CONSTANT)",
    /* 114 */"boolcmp: BOOLEAN_CMP_ADDR(r,INT_CONSTANT)",
    /* 115 */"boolcmp: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 116 */"boolcmp: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 117 */"boolcmp: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 118 */"boolcmp: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 119 */"r: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 120 */"r: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 121 */"r: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 122 */"r: BOOLEAN_CMP_INT(boolcmp,INT_CONSTANT)",
    /* 123 */"r: REF_ADD(r,INT_CONSTANT)",
    /* 124 */"r: REF_ADD(r,REF_MOVE(INT_CONSTANT))",
    /* 125 */"r: REF_ADD(r,REF_MOVE(INT_CONSTANT))",
    /* 126 */"r: INT_MUL(r,INT_CONSTANT)",
    /* 127 */"r: INT_DIV(r,REF_MOVE(INT_CONSTANT))",
    /* 128 */"r: INT_REM(r,REF_MOVE(INT_CONSTANT))",
    /* 129 */"r: REF_NEG(r)",
    /* 130 */"rz: INT_SHL(r,INT_CONSTANT)",
    /* 131 */"rs: INT_SHR(r,INT_CONSTANT)",
    /* 132 */"rp: INT_USHR(r,INT_CONSTANT)",
    /* 133 */"czr: REF_AND(r,INT_CONSTANT)",
    /* 134 */"rp: REF_AND(r,INT_CONSTANT)",
    /* 135 */"r: REF_OR(r,INT_CONSTANT)",
    /* 136 */"r: REF_XOR(r,INT_CONSTANT)",
    /* 137 */"r: REF_NOT(r)",
    /* 138 */"r: FLOAT_NEG(r)",
    /* 139 */"r: DOUBLE_NEG(r)",
    /* 140 */"r: FLOAT_SQRT(r)",
    /* 141 */"r: DOUBLE_SQRT(r)",
    /* 142 */"rs: INT_2BYTE(r)",
    /* 143 */"rp: INT_2USHORT(r)",
    /* 144 */"rs: INT_2SHORT(r)",
    /* 145 */"r: INT_2FLOAT(r)",
    /* 146 */"r: INT_2DOUBLE(r)",
    /* 147 */"r: FLOAT_2INT(r)",
    /* 148 */"r: FLOAT_2DOUBLE(r)",
    /* 149 */"r: DOUBLE_2INT(r)",
    /* 150 */"r: DOUBLE_2FLOAT(r)",
    /* 151 */"r: FLOAT_AS_INT_BITS(r)",
    /* 152 */"r: INT_BITS_AS_FLOAT(r)",
    /* 153 */"r: REF_MOVE(r)",
    /* 154 */"r: FLOAT_MOVE(r)",
    /* 155 */"r: DOUBLE_MOVE(r)",
    /* 156 */"rs: BYTE_LOAD(r,INT_CONSTANT)",
    /* 157 */"rp: UBYTE_LOAD(r,INT_CONSTANT)",
    /* 158 */"rs: SHORT_LOAD(r,INT_CONSTANT)",
    /* 159 */"rp: USHORT_LOAD(r,INT_CONSTANT)",
    /* 160 */"r: FLOAT_LOAD(r,INT_CONSTANT)",
    /* 161 */"r: FLOAT_LOAD(r,REF_MOVE(ADDRESS_CONSTANT))",
    /* 162 */"r: DOUBLE_LOAD(r,INT_CONSTANT)",
    /* 163 */"r: DOUBLE_LOAD(r,REF_MOVE(ADDRESS_CONSTANT))",
    /* 164 */"rs: INT_LOAD(r,INT_CONSTANT)",
    /* 165 */"rs: INT_LOAD(r,REF_MOVE(ADDRESS_CONSTANT))",
    /* 166 */"stm: INT_IFCMP(r,INT_CONSTANT)",
    /* 167 */"stm: INT_IFCMP(boolcmp,INT_CONSTANT)",
    /* 168 */"stm: INT_IFCMP(boolcmp,INT_CONSTANT)",
    /* 169 */"stm: INT_IFCMP(boolcmp,INT_CONSTANT)",
    /* 170 */"stm: INT_IFCMP(boolcmp,INT_CONSTANT)",
    /* 171 */"stm: INT_IFCMP2(r,INT_CONSTANT)",
    /* 172 */"stm: RETURN(r)",
    /* 173 */"r: LONG_MUL(r,INT_CONSTANT)",
    /* 174 */"r: LONG_DIV(r,REF_MOVE(INT_CONSTANT))",
    /* 175 */"r: LONG_REM(r,REF_MOVE(INT_CONSTANT))",
    /* 176 */"r: LONG_SHL(r,INT_CONSTANT)",
    /* 177 */"r: LONG_SHR(r,INT_CONSTANT)",
    /* 178 */"r: LONG_USHR(r,INT_CONSTANT)",
    /* 179 */"rs: INT_2LONG(r)",
    /* 180 */"rs: INT_2LONG(rs)",
    /* 181 */"r: LONG_2INT(r)",
    /* 182 */"r: FLOAT_2LONG(r)",
    /* 183 */"r: DOUBLE_2LONG(r)",
    /* 184 */"r: DOUBLE_AS_LONG_BITS(r)",
    /* 185 */"r: LONG_BITS_AS_DOUBLE(r)",
    /* 186 */"stm: LONG_IFCMP(r,INT_CONSTANT)",
    /* 187 */"stm: LONG_IFCMP(r,LONG_CONSTANT)",
    /* 188 */"rz: INT_2ADDRZerExt(rz)",
    /* 189 */"rz: INT_2ADDRZerExt(r)",
    /* 190 */"r: LONG_LOAD(r,INT_CONSTANT)",
    /* 191 */"r: LONG_LOAD(r,REF_MOVE(ADDRESS_CONSTANT))",
    /* 192 */"r: REF_SUB(INT_CONSTANT,r)",
    /* 193 */"r: CALL(BRANCH_TARGET,any)",
    /* 194 */"rz: INT_SHL(INT_USHR(r,INT_CONSTANT),INT_CONSTANT)",
    /* 195 */"rp: INT_SHR(REF_AND(r,INT_CONSTANT),INT_CONSTANT)",
    /* 196 */"rp: INT_USHR(REF_AND(r,INT_CONSTANT),INT_CONSTANT)",
    /* 197 */"rp: INT_USHR(REF_AND(r,REF_MOVE(INT_CONSTANT)),INT_CONSTANT)",
    /* 198 */"rp: INT_USHR(INT_SHL(r,INT_CONSTANT),INT_CONSTANT)",
    /* 199 */"rp: REF_AND(INT_USHR(r,INT_CONSTANT),INT_CONSTANT)",
    /* 200 */"rp: REF_AND(INT_USHR(r,INT_CONSTANT),REF_MOVE(INT_CONSTANT))",
    /* 201 */"rp: REF_AND(BYTE_LOAD(r,INT_CONSTANT),INT_CONSTANT)",
    /* 202 */"rs: INT_LOAD(REF_ADD(r,INT_CONSTANT),INT_CONSTANT)",
    /* 203 */"stm: INT_IFCMP(INT_2BYTE(r),INT_CONSTANT)",
    /* 204 */"stm: INT_IFCMP(INT_2SHORT(r),INT_CONSTANT)",
    /* 205 */"stm: INT_IFCMP(INT_USHR(r,INT_CONSTANT),INT_CONSTANT)",
    /* 206 */"stm: INT_IFCMP(INT_SHL(r,INT_CONSTANT),INT_CONSTANT)",
    /* 207 */"stm: INT_IFCMP(INT_SHR(r,INT_CONSTANT),INT_CONSTANT)",
    /* 208 */"stm: INT_IFCMP(REF_AND(r,INT_CONSTANT),INT_CONSTANT)",
    /* 209 */"r: LONG_SHL(LONG_USHR(r,INT_CONSTANT),INT_CONSTANT)",
    /* 210 */"r: LONG_USHR(LONG_SHL(r,INT_CONSTANT),INT_CONSTANT)",
    /* 211 */"rz: INT_2ADDRZerExt(INT_LOAD(r,INT_CONSTANT))",
    /* 212 */"r: LONG_LOAD(REF_ADD(r,INT_CONSTANT),INT_CONSTANT)",
    /* 213 */"r: REF_AND(REF_NOT(r),REF_NOT(r))",
    /* 214 */"r: REF_OR(REF_NOT(r),REF_NOT(r))",
    /* 215 */"stm: BYTE_STORE(INT_2BYTE(r),OTHER_OPERAND(r,INT_CONSTANT))",
    /* 216 */"stm: SHORT_STORE(INT_2SHORT(r),OTHER_OPERAND(r,INT_CONSTANT))",
    /* 217 */"stm: SHORT_STORE(INT_2USHORT(r),OTHER_OPERAND(r,INT_CONSTANT))",
    /* 218 */"r: REF_AND(r,REF_NOT(r))",
    /* 219 */"r: REF_OR(r,REF_NOT(r))",
    /* 220 */"stm: BYTE_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 221 */"stm: SHORT_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 222 */"stm: INT_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 223 */"stm: INT_STORE(r,OTHER_OPERAND(r,REF_MOVE(ADDRESS_CONSTANT)))",
    /* 224 */"stm: FLOAT_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 225 */"stm: FLOAT_STORE(r,OTHER_OPERAND(r,REF_MOVE(ADDRESS_CONSTANT)))",
    /* 226 */"stm: DOUBLE_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 227 */"stm: DOUBLE_STORE(r,OTHER_OPERAND(r,REF_MOVE(ADDRESS_CONSTANT)))",
    /* 228 */"stm: LONG_STORE(r,OTHER_OPERAND(r,INT_CONSTANT))",
    /* 229 */"stm: LONG_STORE(r,OTHER_OPERAND(r,REF_MOVE(ADDRESS_CONSTANT)))",
    /* 230 */"r: REF_NOT(REF_OR(r,r))",
    /* 231 */"r: REF_NOT(REF_AND(r,r))",
    /* 232 */"r: REF_NOT(REF_XOR(r,r))",
    /* 233 */"rp: REF_AND(BYTE_LOAD(r,r),INT_CONSTANT)",
    /* 234 */"rs: INT_LOAD(REF_ADD(r,r),INT_CONSTANT)",
    /* 235 */"stm: INT_IFCMP(INT_USHR(r,r),INT_CONSTANT)",
    /* 236 */"stm: INT_IFCMP(INT_SHL(r,r),INT_CONSTANT)",
    /* 237 */"stm: INT_IFCMP(INT_SHR(r,r),INT_CONSTANT)",
    /* 238 */"stm: INT_IFCMP(ATTEMPT_INT(r,r),INT_CONSTANT)",
    /* 239 */"stm: INT_IFCMP(ATTEMPT_ADDR(r,r),INT_CONSTANT)",
    /* 240 */"rz: INT_2ADDRZerExt(INT_LOAD(r,r))",
    /* 241 */"r: LONG_LOAD(REF_ADD(r,r),INT_CONSTANT)",
    /* 242 */"r: FLOAT_ADD(FLOAT_MUL(r,r),r)",
    /* 243 */"r: DOUBLE_ADD(DOUBLE_MUL(r,r),r)",
    /* 244 */"r: FLOAT_SUB(FLOAT_MUL(r,r),r)",
    /* 245 */"r: DOUBLE_SUB(DOUBLE_MUL(r,r),r)",
    /* 246 */"r: FLOAT_ADD(r,FLOAT_MUL(r,r))",
    /* 247 */"r: DOUBLE_ADD(r,DOUBLE_MUL(r,r))",
    /* 248 */"stm: BYTE_STORE(r,OTHER_OPERAND(r,r))",
    /* 249 */"stm: SHORT_STORE(r,OTHER_OPERAND(r,r))",
    /* 250 */"stm: INT_STORE(r,OTHER_OPERAND(r,r))",
    /* 251 */"stm: FLOAT_STORE(r,OTHER_OPERAND(r,r))",
    /* 252 */"stm: DOUBLE_STORE(r,OTHER_OPERAND(r,r))",
    /* 253 */"stm: LONG_STORE(r,OTHER_OPERAND(r,r))",
    /* 254 */"r: FLOAT_NEG(FLOAT_ADD(FLOAT_MUL(r,r),r))",
    /* 255 */"r: DOUBLE_NEG(DOUBLE_ADD(DOUBLE_MUL(r,r),r))",
    /* 256 */"r: FLOAT_NEG(FLOAT_SUB(FLOAT_MUL(r,r),r))",
    /* 257 */"r: DOUBLE_NEG(DOUBLE_SUB(DOUBLE_MUL(r,r),r))",
    /* 258 */"r: FLOAT_NEG(FLOAT_ADD(r,FLOAT_MUL(r,r)))",
    /* 259 */"r: DOUBLE_NEG(DOUBLE_ADD(r,DOUBLE_MUL(r,r)))",
    /* 260 */"stm: BYTE_STORE(INT_2BYTE(r),OTHER_OPERAND(r,r))",
    /* 261 */"stm: SHORT_STORE(INT_2SHORT(r),OTHER_OPERAND(r,r))",
    /* 262 */"stm: SHORT_STORE(INT_2USHORT(r),OTHER_OPERAND(r,r))",
    /* 263 */"stm: INT_STORE(r,OTHER_OPERAND(REF_ADD(r,INT_CONSTANT),INT_CONSTANT))",
    /* 264 */"stm: LONG_STORE(r,OTHER_OPERAND(REF_ADD(r,INT_CONSTANT),INT_CONSTANT))",
    /* 265 */"rz: INT_2ADDRZerExt(INT_LOAD(REF_ADD(r,INT_CONSTANT),INT_CONSTANT))",
  };

}
