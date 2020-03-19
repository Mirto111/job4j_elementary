package ru.job4j.condition;

import static org.junit.Assert.*;

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
}