package ru.job4j.converter;

public class Converter {

  public static int rubleToEuro(int value) {
    int rsl = value / 70;
    return rsl;
  }

  public static int rubleToDollar(int value) {
    int rsl = value / 60; // формула перевода рублей в доллоры.
    return rsl;
  }

  public static void main(String[] args) {

    int in = 140;
    int expected = 2;
    int out = rubleToEuro(in);
    boolean passed = expected == out;
    System.out.println("140 rubles are 2. Test result : " + passed);

    in = 240;
    expected = 4;
    out = rubleToDollar(in);
    passed = expected == out;
    System.out.println("240 rubles are 4. Test result : " + passed);

  }

}
