package org.example;

import java.util.Scanner;

public class Main {

  private Scanner scanner;
  private StudentManager studentManager;

  public Main() {
    this.scanner = new Scanner(System.in);
    this.studentManager = new StudentManager();
  }

  public static void main(String[] args) {

    System.out.println("入力例:");
  }
}
