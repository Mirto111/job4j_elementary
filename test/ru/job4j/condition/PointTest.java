package ru.job4j.condition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {

  @Test
  public void distance() {
    Point a = new Point(0, 0);
    Point b = new Point(0, 2);
    double expected = 2;
    double out = a.distance(b);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void distance3d() {
    Point a = new Point(0, 0, 0);
    Point b = new Point(2, 1, 2);
    double expected = 3;
    double out = a.distance3d(b);
    assertEquals(expected, out, 0.01);
  }
}