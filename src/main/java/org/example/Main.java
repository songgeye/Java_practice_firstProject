package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    System.out.println("入力例:");
    System.out.print("1番目の数字を入力してください: ");
    Scanner sc = new Scanner(System.in);

    int calcNum = sc.nextInt();
    System.out.println("演算子を入力してください (+, -, *, /): ");
  }
}