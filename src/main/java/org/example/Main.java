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

    Main main = new Main();
    main.showMenu();
  }

  // メインメニューを表示
  public void showMenu() {
    int choice;

    do {
      System.out.println("入力例:");
      System.out.println("1. 学生を追加");
      System.out.println("2. 学生を削除");
      System.out.println("3. 点数を更新");
      System.out.println("4. 平均点を計算");
      System.out.println("5. 全学生の情報を表示");
      System.out.println("6. 終了");
      System.out.print("選択してください: ");

      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> addStudentMenu();
        case 2 -> removeStudentMenu();
        case 3 -> updatescoreMenu();
        case 4 -> calculateAverageMenu();
        case 5 -> displayAllStudentsMenu();
        case 6 -> System.out.println("プログラムを終了します。");
        default -> System.out.println("✗ 無効な選択です。1-6の数字を入力してください。");
      }
    } while (choice != 6);
  }

  // 1. 学生を追加
  private void addStudentMenu() {
    System.out.print("学生名を入力: ");
    String studentName = scanner.nextLine();

    System.out.print("点数を入力: ");
    int testScore = scanner.nextInt();
    scanner.nextLine();
    studentManager.addStudent(studentName, testScore);
  }

  // 2. 学生を削除
  private void removeStudentMenu() {
    System.out.println("学生を削除");

    if (!studentManager.hasStudents()) {
      System.out.println("削除できる学生がいません。");
      return;
    }

    studentManager.displayAllStudents();
    System.out.print("削除する学生名を入力: ");
    String studentName = scanner.nextLine();

    studentManager.removeStudent(studentName);
  }

  // 3. 点数を更新
  private void updatescoreMenu() {
    System.out.println("点数を更新");

    if (!studentManager.hasStudents()) {
      System.out.println("更新できる学生がいません。");
      return;
    }

    studentManager.displayAllStudents();
    System.out.println("学生名を入力");
    String studentName = scanner.nextLine();

    System.out.println("新しい点数を入力: ");
    int latestScore = scanner.nextInt();
    scanner.nextLine();

    studentManager.updateScore(studentName, latestScore);
  }


  // 4. 平均点を計算
  private void calculateAverageMenu() {
    System.out.println("平均点を計算");

    if (!studentManager.hasStudents()) {
      System.out.println("計算できる学生がいません。");
      return;
    }

    studentManager.calculateAverage();
  }

  // 5. 全学生の情報を表示
  private void displayAllStudentsMenu() {
    System.out.println("--- 全学生の情報 ---");

    studentManager.displayAllStudents();
  }
}
