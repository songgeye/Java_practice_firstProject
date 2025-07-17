package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        String name = "MatsuganoKengo";

//        BigDecimal = 高精度な小数計算を行うためのクラス
        BigDecimal number1 = BigDecimal.ZERO;
        BigDecimal number2 = BigDecimal.valueOf(10);
        BigDecimal number3 = BigDecimal.valueOf(100);

        System.out.println(number2.add(number3));

        int age = 100;

        double number4= 100.23;
        boolean bool = true;

        Integer number5 = 10;
        Double number6 = 100.2;
        Boolean bool2 = true;

        String fullName = "";
        System.out.println(fullName.length());

//        DateとCalendarは使うべきではない(代わりにしよするのは以下)
        LocalDateTime date = LocalDateTime.now(); // ここでいう日本の時間
        ZonedDateTime date2 = ZonedDateTime.now(); // 指定したゾーンの時間(グローバルに対応する場合に使用)

        int a = 10;
        int b = 100;
        int c = 20;

        if (a > b) {
            System.out.println("aはbより大きい");
        } else if(a > c) {
            System.out.println("aはbより小さくてcより大きい");
        } else {
            System.out.println("aはbより小さくてcよりも小さい");
        }

//        ネスト構造 (意味は上と同じ ※但し基本的に使わないようにすること)
        if (a > b) {
            System.out.println("aはbより大きい");
        } else {
            if (a > c) {
                System.out.println("aはbより小さくてcより大きい");
            } else
              System.out.println("aはbより小さくてcよりも小さい");
        }

        // 条件式を使った課題
        // 文字列型を使って、変数を2つ用意する。その変数には苗字と名前を入れる。
        // 条件は苗字の文字数が2文字以上の場合、かつ名前の文字数が2文字以上の場合はtrue
        // 条件がtrueの場合はその名前を表示する。
        // falseの場合は「条件に一致しませんでした。」と表示する。

        String surName = "松ヶ野";
        String givenName = "健吾";

        if (surName.length() >= 2 == true || givenName.length() >= 2) {
            System.out.println(surName + givenName);
        } else {
            System.out.println("条件に一致しませんでした。");
        }
    }
}