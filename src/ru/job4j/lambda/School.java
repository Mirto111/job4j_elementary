package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

  public List<Student> collect(List<Student> students, Predicate<Student> predict) {
    return students.stream().filter(predict).collect(Collectors.toList());
  }

  public Map<String, Student> collectInMap(List<Student> students) {
    return students.stream().collect(Collectors.toMap(Student::getSurname, st -> st));
  }

  public List<Student> levelOf(List<Student> students, int bound) {
    return students.stream()
        .flatMap(Stream::ofNullable).sorted()
        .takeWhile(sc -> sc.getScore() > bound).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Student st1 = new Student(30);
    st1.setSurname("Vasiliy");
    Student st2 = new Student(60);
    st2.setSurname("Andrey");
    List<Student> students = List.of(st1, st2);
    Map<String, Student> result = new School().collectInMap(students);
    System.out.println(result);
    List<Student> st = new School().levelOf(students, 40);
    System.out.println(st);
  }
}
