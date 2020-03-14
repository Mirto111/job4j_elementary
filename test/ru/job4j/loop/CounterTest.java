package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CounterTest {

  @Test
  public void whenSumEvenNumbersFromOneToTenThenThirty() {
    int rsl = Counter.sumByEven(1, 10);
    int expected = 30;
    assertThat(rsl, is(expected));
  }

  @Test
  public void whenSumEvenNumbersFromFiveToFifteenThenFifty() {
    int rsl = Counter.sumByEven(5, 15);
    int expected = 50;
    assertThat(rsl, is(expected));
  }

  @Test
  public void sum() {
    int rsl = Counter.sum(0, 10);
    int expected = 55;
    assertThat(rsl, is(expected));
  }
}