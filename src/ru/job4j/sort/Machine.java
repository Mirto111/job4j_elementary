package ru.job4j.sort;

import java.util.Arrays;

public class Machine {

  private final int[] COINS = {10, 5, 2, 1};

  public int[] change(int money, int price) {
    int[] rsl = new int[100];
    int sdacha = money - price;
    int size = 0;
    if (sdacha > 0) {
      for (int i = 0; i < COINS.length; i++) {
        while (sdacha - COINS[i] >= 0) {
          sdacha = sdacha - COINS[i];
          rsl[size] = COINS[i];
          size++;
        }
      }
    }
    return Arrays.copyOf(rsl, size);
  }

}
