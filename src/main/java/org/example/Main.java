package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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