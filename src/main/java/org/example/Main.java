package org.example;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    List<Student> studentList = IntStream.range(0, 10)
        .mapToObj(i -> new Student(UUID.randomUUID().toString(), "松ヶ野" + i)).toList();
    StudentManager manager = new StudentManager(studentList);

    Student student = manager.search("松ヶ野3");
    System.out.println(student.getName());
  }
}