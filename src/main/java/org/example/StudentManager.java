package org.example;

import java.util.List;
import java.util.Optional;

public class StudentManager {

  private List<Student> studentList;

  public StudentManager(List<Student> studentList) {
    this.studentList = studentList;
  }

  public Student search(String name) {
    for (Student v : studentList) {
      if (v.getName().equals(name)) {
        return Optional.of(v).get();
      }
    }
    return Optional.<Student>empty().get();
  }
}
