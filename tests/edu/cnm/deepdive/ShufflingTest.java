package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class ShufflingTest {

  @Test
  void shuffleCheckData() {
    int[] expected = new int[1000];
    for (int i = 0; i < expected.length; i++){
      expected[i] = i;
    }
    int[] actual = Arrays.copyOf(expected, expected.length);
    Shuffling.shuffle(actual);
    assertFalse(Arrays.equals(expected, actual), "Highly Unlikely");
    Arrays.sort(actual);
    assertArrayEquals(expected, actual);
  }

  /**
   * Assumes a Fisher-Yates shuffle that iterates from last to first element, and uses
   * {@link java.util.Random#nextInt(int)}.
   */
  @Test
  void shuffleDegenerateRng() {
    Random rng = new DegenerateRandom();
    int[] expected = new int[1000];
    for (int i = 0; i < expected.length; i++){
      expected[i] = i;
    }
    int[] actual = Arrays.copyOf(expected, expected.length);
    Shuffling.shuffle(actual, rng);
    assertArrayEquals(expected, actual);
  }

  private class DegenerateRandom extends Random {

    @Override
    public int nextInt(int bound) {
      return bound -1;
    }
  }
}