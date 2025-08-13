package org.example;

public class Student {

  private String studentName;

  private int testScore;

  public Student(String studentName, int testScore) {
    this.studentName = studentName;
    this.testScore = testScore;
  }

  public Student(String studentName) {
    this.studentName = studentName;
    this.testScore = 0;
  }

  public String getName() {
    return studentName;
  }

  public int getScore() {
    return testScore;
  }

  public void setName(String studentName) {
    if (studentName != null && !studentName.trim().isEmpty()) {
      this.studentName = studentName;
    }
  }

  public void setScore(int testScore) {
    if (testScore >= 0 && testScore <= 100) {
      this.testScore = testScore;
    }
  }
}