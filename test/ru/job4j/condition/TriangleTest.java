package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

  @Test
  public void whenExist() {
    Point first = new Point(0, 0);
    Point second = new Point(0, 2);
    Point third = new Point(5, 0);
    double a = first.distance(second);
    double b = first.distance(third);
    double c = second.distance(third);
    Triangle triangle = new Triangle(first, second, third);
    boolean result = triangle.isExist(a, b, c);
    assertThat(result, is(true));
  }

  @Test
  public void whenDoesNotExist() {
    Point first = new Point(0, 0);
    Point second = new Point(0, 2);
    Point third = new Point(0, 1);
    double a = first.distance(second);
    double b = first.distance(third);
    double c = second.distance(third);
    Triangle triangle = new Triangle(first, second, third);
    boolean result = triangle.isExist(a, b, c);
    assertThat(result, is(false));
  }

  @Test
  public void area() {
    Point first = new Point(0, 0);
    Point second = new Point(1, 2);
    Point third = new Point(5, 1);
    Triangle triangle = new Triangle(first, second, third);
    double result = triangle.area();
    double expected = 4.5;
    assertEquals(expected, result, 0.01);
  }
}