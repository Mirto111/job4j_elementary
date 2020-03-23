package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {

  private String firstname;
  private String surname;
  private String middlename;
  private int group;
  private LocalDate admission;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public void setMiddlename(String middlename) {
    this.middlename = middlename;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public LocalDate getAdmission() {
    return admission;
  }

  public void setAdmission(LocalDate admission) {
    this.admission = admission;
  }
}
