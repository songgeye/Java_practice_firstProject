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

  public void addStudent(String studentName, int testScore) {
    Student student = new Student(studentName, testScore);
    studentList.add(student);
    System.out.println("✓ 学生を追加しました: " + student);
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

    System.out.println("✗ 指定された学生が見つかりません: + studentName");
    return false;
  }

  public boolean updateScore(String studentName, int latestScore) {
    boolean updated = studentList.stream()
        .filter(student -> student.getName().equals(studentName))
        .findFirst()
        .map(student -> {
          int firstScore = student.getScore();
          student.setScore(latestScore);
          System.out.println(
              "✓ 点数を更新しました: " + studentName + " " + firstScore + "点 →" + latestScore
                  + "点");
          return true;
        })
        .orElse(false);

    if (!updated) {
      System.out.println("✗ 指定された学生が見つかりません: " + studentName);
    }
    return updated;
  }

  public double calculateAverage() {
    if (studentList.isEmpty()) {
      System.out.println("学生が登録されていません。");
      return 0.0;
    }

    double sum = studentList.stream()
        .mapToInt(Student::getScore)
        .sum();

    double average = sum / studentList.size();
    System.out.println("平均点: " + String.format("%.2f", average) + "点");
    return average;
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

  public boolean hasStudents() {
    return !studentList.isEmpty();
  }
}