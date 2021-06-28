package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatZeroToFront.zeroFront;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatZeroToFrontTest {

  private int[][] frontParams = {
      {1, 0, 0, 1},
      {0, 1, 1, 0, 1},
      {1, 0},
      {0, 1},
      {1, 1, 1, 0},
      {2, 2, 2, 2},
      {0, 0, 1, 0},
      {-1, 0, 0, -1, 0},
      {0, -3, 0, -3},
      {},
      {9, 9, 0, 9, 0, 9}
  };

  private int[][] frontExpected = {
      {0, 0, 1, 1},
      {0, 0, 1, 1, 1},
      {0, 1},
      {0, 1},
      {0, 1, 1, 1},
      {2, 2, 2, 2},
      {0, 0, 0, 1},
      {0, 0, 0, -1, -1},
      {0, 0, -3, -3},
      {},
      {0, 0, 9, 9, 9, 9}

  };

  @Test
  void frontTest() {
    for (int i = 0; i < frontParams.length; i++) {
      String actual = Arrays.toString(zeroFront(frontParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(frontExpected[i]));
    }
  }

}