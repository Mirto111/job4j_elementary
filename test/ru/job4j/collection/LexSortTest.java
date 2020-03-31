package ru.job4j.collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class LexSortTest {

  @Test
  public void sortNum1and2and10() {
    String[] input = {
        "10. Task. омпаратор сравнивает строки, а не номера. ",
        "1. Task.",
        "2. Task."
    };
    String[] out = {
        "1. Task.",
        "2. Task.",
        "10. Task. омпаратор сравнивает строки, а не номера. "
    };
    Arrays.sort(input, new LexSort());
    assertThat(input, is(out));
  }

}