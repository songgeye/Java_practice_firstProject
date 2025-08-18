package org.example;

import java.util.Scanner;

public class Main {

  private Scanner sc;

  public Main() {
    this.sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.InputManager();
  }

  public void InputManager() {
    System.out.print("携帯電話番号を入力してください: ");
    String inputNumber = sc.nextLine();
    if (PhoneNumberValidator.isValid(inputNumber)) {
      System.out.println(inputNumber + " は有効な携帯電話番号です。");
    } else {
      System.out.println(inputNumber + " は無効な携帯電話番号です。");
    }
    sc.close();
  }
}
