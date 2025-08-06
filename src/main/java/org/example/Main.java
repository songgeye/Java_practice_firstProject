package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("入力例:");

    System.out.print("1番目の数字を入力してください: ");
    int firstInt = sc.nextInt();

    System.out.print("演算子を入力してください (+, -, *, /): ");
    String operator = sc.next();

    System.out.print("2番目の数字を入力してください: ");
    int secondInt = sc.nextInt();

    int result = 0;
    switch (operator) {
      case "+" -> result = firstInt + secondInt;
      case "-" -> result = firstInt - secondInt;
      case "*" -> result = firstInt * secondInt;
      case "/" -> result = firstInt / secondInt;

    }
    System.out.println("期待される出力例:");
    System.out.print("計算結果: " + result);
  }
}