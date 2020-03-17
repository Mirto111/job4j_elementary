package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SortSelectedTest {

  @Test
  public void whenSortFiveNums() {
    int[] input = new int[]{3, 4, 1, 2, 5};
    int[] result = SortSelected.sort(input);
    int[] expect = new int[]{1, 2, 3, 4, 5};
    assertThat(result, is(expect));
  }

  @Test
  public void whenSortThreeNums() {
    int[] input = new int[]{5, 3, 4};
    int[] result = SortSelected.sort(input);
    int[] expect = new int[]{3, 4, 5};
    assertThat(result, is(expect));
  }

}