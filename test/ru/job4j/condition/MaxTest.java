package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MaxTest {

  @Test
  public void whenMax1To2Then2() {
    int result = Max.max(1, 2);
    assertThat(result, is(2));
  }

  @Test
  public void whenMax2To3To5Then5() {
    int result = Max.max(2, 3, 5);
    assertThat(result, is(5));
  }

  @Test
  public void whenMax1To2To5To4Then5() {
    int result = Max.max(1, 2, 5, 4);
    assertThat(result, is(5));
  }
}