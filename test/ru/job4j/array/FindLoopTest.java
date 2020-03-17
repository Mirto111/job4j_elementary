package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindLoopTest {

  @Test
  public void whenArrayHas5Then0() {
    FindLoop find = new FindLoop();
    int[] input = new int[]{5, 10, 3};
    int value = 5;
    int result = find.indexOf(input, value);
    int expect = 0;
    assertThat(result, is(expect));
  }

  @Test
  public void whenArrayDoesNotHaveElement() {
    FindLoop find = new FindLoop();
    int[] input = new int[]{5, 10, 3, 4};
    int value = 6;
    int result = find.indexOf(input, value);
    int expect = -1;
    assertThat(result, is(expect));
  }

}