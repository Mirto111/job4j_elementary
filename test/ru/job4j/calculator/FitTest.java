package ru.job4j.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FitTest {

  @Test
  public void manWeight() {
    double in = 170;
    double expected = 80.5;
    double out = Fit.manWeight(in);
    assertEquals(expected, out, 0.01);
  }

  @Test
  public void womanWeight() {
    double in = 162;
    double expected = 59.8;
    double out = Fit.womanWeight(in);
    assertEquals(expected, out, 0.01);
  }
}