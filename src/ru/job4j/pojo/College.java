package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

  public static void main(String[] args) {
    Student student = new Student();
    student.setFirstname("Василий");
    student.setMiddlename("Петрович");
    student.setSurname("Иванов");
    student.setGroup(10115);
    student.setAdmission(LocalDate.of(2019, 9, 1));

    System.out.print(student.getFirstname());
    System.out.print(student.getMiddlename());
    System.out.print(student.getSurname());
    System.out.println();
    System.out.println(student.getGroup());
    System.out.println(student.getAdmission());
  }

}
