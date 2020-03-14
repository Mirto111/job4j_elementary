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

}