package ru.job4j.condition;

public class MultiMax {

  public int max(int first, int second, int third) {

    int maxFromTwo = first > second ? first : second;
    int result = maxFromTwo > third ? maxFromTwo : third;

    return result;
  }

}
