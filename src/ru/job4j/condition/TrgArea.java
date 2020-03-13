package ru.job4j.condition;

public class TrgArea {

  public static double area(double a, double b, double c) {

    double p = (a + b + c) / 2;
    double pa = p - a;
    double pb = p - b;
    double pc = p - c;
    double pp = p * pa * pb * pc;
    double s = Math.sqrt(pp);

    return s;
  }

  public static void main(String[] args) {
    double rsl = TrgArea.area(2, 2, 2);
    System.out.println("area (2, 2, 2) = " + rsl);
  }

}
