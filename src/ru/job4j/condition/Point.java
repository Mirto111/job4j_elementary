package ru.job4j.condition;

public class Point {

  public static double distance(int x1, int y1, int x2, int y2) {

    int dx = x2 - x1;
    int dy = y2 - y1;
    double res = Math.pow(dx, 2) + Math.pow(dy, 2);
    double rsl = Math.sqrt(res);
    return rsl;
  }

  public static void main(String[] args) {
    double result = Point.distance(0, 0, 2, 0);
    double result1 = Point.distance(2, 2, 3, 2);
    double result2 = Point.distance(3, 2, 6, 6);

    System.out.println("result (0, 0) to (2, 0) " + result);
    System.out.println("result (2, 2) to (3, 2) " + result1);
    System.out.println("result (3, 2) to (6, 6) " + result2);
  }

}
