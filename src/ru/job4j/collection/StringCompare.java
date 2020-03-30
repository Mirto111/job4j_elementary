package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

  @Override
  public int compare(String left, String right) {
    char[]leftChars = left.toCharArray();
    char[]rightChars = right.toCharArray();
    int size = leftChars.length < rightChars.length ? leftChars.length : rightChars.length;
    for (int i = 0; i < size; i++) {
      int comp = Character.compare(leftChars[i], rightChars[i]);
      if (comp != 0) {
        return comp;
      }
    }
    return leftChars.length - rightChars.length;
  }
}
