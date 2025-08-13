package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  private Scanner scanner;
  private StudentManager studentManager;
//  List<Student> studentList = new ArrayList<>();

  public Main() {
    this.scanner = new Scanner(System.in);
    this.studentManager = new StudentManager();
//    this.studentManager = new StudentManager(studentList);
  }

  public static void main(String[] args) {

    Main main = new Main();
    main.showMenu();
  }

  // メインメニューを表示
  public void showMenu() {
    int choice;

    do {
      System.out.println("    学生管理システム");
      System.out.println("1. 学生を追加");
      System.out.println("2. 学生を削除");
      System.out.println("3. 点数を更新");
      System.out.println("4. 平均点を計算");
      System.out.println("5. 全学生の情報を表示");
      System.out.println("6. 終了");
      System.out.print("選択してください (1-6): ");

      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> addStudentMenu();
        case 2 -> removeStudentMenu();
        case 3 -> System.out.println("プログラムを終了します。");
        case 4 -> displayAllStudentsMenu();
        default -> System.out.println("✗ 無効な選択です。1-6の数字を入力してください。");
      }
    } while (choice != 4);
  }

  private void addStudentMenu() {
    System.out.println("学生を追加");
    String studentName = scanner.nextLine();
    studentManager.addStudent(studentName);
  }

  private void removeStudentMenu() {
    System.out.println("学生を削除");

    if (!studentManager.hasStudents()) {
      System.out.println("削除できる学生がいません。");
      return;
    }
  }

  private void displayAllStudentsMenu() {
    System.out.println("\n--- 全学生の情報 ---");
    studentManager.displayAllStudents();
  }
}