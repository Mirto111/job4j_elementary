package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифмитических операций
 * @author Misha Artyukhov (artyukhov@yandex.ru)
 * @since 16.03.2020
 */
public class Calculator {


  /**
   * Main
   * @param args - args
   */
  public static void main(String[] args) {
    int one = 1;
    int two = 2;
    int onePlusTwo = one + two;
    System.out.println(onePlusTwo);

    int six = 6;
    int four = 4;
    int five = 5;

    int sixDivTwo = six / two;
    int fiveMinusTwo = five - two;
    int fourTimeTwo = four * two;

    System.out.println(sixDivTwo);
    System.out.println(fiveMinusTwo);
    System.out.println(fourTimeTwo);
  }

}
