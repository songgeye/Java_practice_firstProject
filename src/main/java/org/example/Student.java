package org.example;

public class Student {

  private String studentName;

  private int testScore;

  public Student(String studentName, int testScore) {
    this.studentName = studentName;
    this.testScore = testScore;
  }

  public String getName() {
    return studentName;
  }

  public int getScore() {
    return testScore;
  }

  public void setScore(int testScore) {
    if (testScore >= 0 && testScore <= 100) {
      this.testScore = testScore;
    }
  }
}