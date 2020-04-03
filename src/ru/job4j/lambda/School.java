package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

  public List<Student> collect(List<Student> students, Predicate<Student> predict) {
    return students.stream().filter(predict).collect(Collectors.toList());
  }

  public Map<String, Student> collectInMap(List<Student> students) {
    return students.stream().collect(Collectors.toMap(Student::getSurname, st -> st));
  }

  public static void main(String[] args) {
    Student st1 = new Student(30);
    st1.setSurname("Vasiliy");
    Student st2 = new Student(60);
    st2.setSurname("Andrey");
    List<Student> students = List.of(st1, st2);
    Map<String, Student> result = new School().collectInMap(students);
    System.out.println(result);
  }
}
