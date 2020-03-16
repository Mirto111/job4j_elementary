package ru.job4j.condition;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class MultiMaxTest {

  @Test
  public void whenSecondMax() {
    MultiMax check = new MultiMax();
    int result = check.max(1, 4, 2);
    assertThat(result, is(4));
  }

  @Test
  public void whenFirstMax() {
    MultiMax check = new MultiMax();
    int result = check.max(5, 4, 2);
    assertThat(result, is(5));
  }

  @Test
  public void whenThirdMax() {
    MultiMax check = new MultiMax();
    int result = check.max(1, 4, 5);
    assertThat(result, is(5));
  }

  @Test
  public void whenAllEqual() {
    MultiMax check = new MultiMax();
    int result = check.max(1, 1, 1);
    assertThat(result, is(1));
  }

}