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
      System.out.println("\"1. 学生を追加\"");

      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> addStudentMenu();
      }
    } while (choice != 6);

  }

  private void addStudentMenu() {
    System.out.println("学生を追加");
    String studentName = scanner.nextLine();
    studentManager.addStudent(studentName);
  }
}
