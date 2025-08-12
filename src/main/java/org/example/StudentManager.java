package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

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

  public boolean removeStudent(String studentName) {
//    for (int i = 0; i < studentList.size(); i++) {
//      if (studentList.get(i).getName().equals(name)) {
//        Student removed = studentList.remove(i);
//        System.out.println("✓ 学生を削除しました: " + removed);
//        return true;
//      }
//    }
//    System.out.println("✗ 指定された学生が見つかりません: " + name);
//    return false;

    Optional<Student> targetStudent = studentList.stream()
        .filter(studentList -> studentList.getName().equals(studentName))
        .findFirst();

    if (targetStudent.isPresent()) {
      studentList.removeIf(student -> student.getName().equals(studentName));
      System.out.println("✓ 学生を削除しました: " + targetStudent.get());
      return true;
    }

    System.out.println("✗ 指定された学生が見つかりません: + name");
    return false;
  }

  public void displayAllStudents() {
    if (studentList.isEmpty()) {
      System.out.println("登録されている学生がいません。");
      return;
    }

    IntStream.range(0, studentList.size()).mapToObj(i -> {
          return (i + 1) + ". " + studentList.get(i);
        })
        .forEach(System.out::println);
    System.out.println("総学生数: " + studentList.size() + "人");
  }

  public int getStudentCount() {
    return studentList.size();
  }

  public Student getStudent(int index) {
    if (index >= 0 && index < studentList.size()) {
      return studentList.get(index);
    }
    return null;
  }

  public boolean hasStudents() {
    return !studentList.isEmpty();
  }
}
