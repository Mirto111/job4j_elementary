package ru.job4j.strategy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PaintTest {

  private final PrintStream stdout = System.out;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();

  @Before
  public void loadOutput() {
    System.setOut(new PrintStream(this.out));
  }

  @After
  public void backOutput() {
    System.setOut(this.stdout);
  }

  @Test
  public void whenDrawSquare() {
    new Paint().draw(new Square());
    assertThat(
        new String(out.toByteArray()),
        is(
            new StringJoiner(System.lineSeparator())
                .add("++++")
                .add("++++")
                .add("++++")
                .add("++++")
                .toString()
        )
    );
  }

  @Test
  public void whenDrawTriangle() {
    new Paint().draw(new Triangle());
    assertThat(
        new String(out.toByteArray()),
        is(
            new StringJoiner(System.lineSeparator())
                .add("   +")
                .add("  +++")
                .add(" +++++")
                .add("+++++++")
                .toString()
        )
    );
  }
}