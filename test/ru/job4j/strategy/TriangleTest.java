package ru.job4j.strategy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.StringJoiner;
import org.junit.Test;

public class TriangleTest {

  @Test
  public void whenDrawTriangle() {
    Shape shape = new Triangle();
    String result = shape.draw();
    StringJoiner expected = new StringJoiner(System.lineSeparator());
    expected.add("   +");
    expected.add("  +++");
    expected.add(" +++++");
    expected.add("+++++++");
    assertThat(result, is(expected.toString()));
  }
}