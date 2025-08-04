package org.example;

import java.util.List;

public class StudentManager {

  private List<Student> studentList;

  public StudentManager(List<Student> studentList) {
    this.studentList = studentList;
  }

  public Student search(String name) {
    return studentList.stream().filter(v -> v.getName().equals(name)).findFirst().get();
  }
}
