package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

  @Override
  public int compare(String left, String right) {
    int size = Math.min(left.length(), right.length());
    for (int i = 0; i < size; i++) {
      int comp = Character.compare(left.charAt(i), right.charAt(i));
      if (comp != 0) {
        return comp;
      }
    }
    return left.length() - right.length();
  }
}
