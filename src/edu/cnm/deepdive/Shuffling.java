package edu.cnm.deepdive;

import java.util.Random;

public class Shuffling {

  private static Random defaultRng;

  public static void shuffle(int[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(int[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      int temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }

  protected static Random getRandom() {
    if (defaultRng == null) {
      defaultRng = new Random();
    }
    return defaultRng;
  }

}
