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
import org.jikesrvm.compilers.baseline.EdgeCounts;
import org.vmmagic.pragma.NoOptCompile;

public class EdgeCountTests {

  @NoOptCompile
  public static void main(String[] args) {
    final int EDGE_COUNT = Integer.MAX_VALUE;

    // Edge counts for this loop should be
    // 2147483648

    int p = 0;
    for (int i = 0; i < EDGE_COUNT; i++) {
      if (p > EDGE_COUNT) {
        p++;
      } else {
        p--;
      }
    }

    // Edge counts for this loop should be
    // 4294967296 if the platform supports
    // full 32-bit edge counters

    int q = 0;
    for (int o = 0; o < 2; o++) {
      for (int i = 0; i < EDGE_COUNT; i++) {
        if (q == 0) {
          // do nothing
        } else {
          q--;
        }
      }
    }

    EdgeCounts.dumpCountsToStream(System.out);
  }

}
