package ru.job4j.condition;

public class Triangle {

  public static boolean isExist(double ab, double ac, double bc) {

    boolean exist = ab + ac > bc && ac + bc > ab && ab + bc > ac;

    return exist;
  }

}
