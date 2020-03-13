package ru.job4j.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConverterTest {

  @Test
  public void rubleToEuro() {
    int in = 140;
    int expected = 2;
    int out = Converter.rubleToEuro(in);
    assertEquals(expected, out);
  }

  @Test
  public void rubleToDollar() {
    int in = 180;
    int expected = 3;
    int out = Converter.rubleToDollar(in);
    assertEquals(expected, out);
  }
}