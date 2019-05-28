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

  public static void shuffle(byte[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(byte[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      byte temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }

  public static void shuffle(short[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(short[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      short temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }

  public static void shuffle(long[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(long[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      long temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }

  public static void shuffle(char[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(char[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      char temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }
  public static void shuffle(float[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(float[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      float temp = data[i];
      data[i] = data[source];
      data[source] = temp;
    }
  }

  public static void shuffle(double[] data) {
    Random rng = getRandom();
    shuffle(data, rng);
  }

  public static void shuffle(double[] data, Random rng) {
    for (int i = data.length - 1; i > 0; i--) {
      int source = rng.nextInt(i + 1);
      double temp = data[i];
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
