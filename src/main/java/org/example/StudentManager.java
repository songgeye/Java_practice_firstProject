package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

  private List<Student> studentList;

  public StudentManager() {
    this.studentList = new ArrayList<>();
  }

//  public StudentManager(List<Student> studentList) {
//    this.studentList = studentList;
//  }

  public void addStudent(String studentName) {
    Student student = new Student(studentName);
    studentList.add(student);
  }
}
