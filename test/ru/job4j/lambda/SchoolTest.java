package ru.job4j.lambda;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SchoolTest {

  private List<Student> students = Arrays.asList(new Student(50),
      new Student(30), new Student(65), new Student(80));

  @Test
  public void whenScoreFromZeroToFifty() {
    List<Student> result = new School().collect(students,
        st -> st.getScore() < 50 && st.getScore() >= 0);
    assertThat(result, is(Arrays.asList(new Student(30))));
  }

  @Test
  public void whenScoreFromFiftyToSeventy() {
    List<Student> result = new School().collect(students,
        st -> st.getScore() < 70 && st.getScore() >= 50);
    assertThat(result, is(Arrays.asList(new Student(50), new Student(65))));
  }

  @Test
  public void whenScoreFromSeventyToOneHundred() {
    List<Student> result = new School().collect(students,
        st -> st.getScore() < 100 && st.getScore() >= 70);
    assertThat(result, is(Arrays.asList(new Student(80))));
  }
}