package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

  @Test
  public void whenExist() {
    boolean result = Triangle.isExist(2.0, 2.0, 2.0);
    assertThat(result, is(true));
  }

  @Test
  public void whenDoesNotExist() {
    boolean result = Triangle.isExist(2.0, 2.0, 6.0);
    assertThat(result, is(false));
  }

}