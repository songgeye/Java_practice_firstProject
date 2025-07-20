package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      numberList.stream().mapToInt(number -> number) // 連続する要素はstream()に変換できる
          .filter(number -> number <= 5) // このnumber部分の変数は一致していなければならない
          .forEach(System.out::println); // メソッド参照

      numberList.stream()
          .limit(3)
          .forEach(System.out::println);

      List<String> studentList = List.of("inoue", "tanaka", "matsugano", "matsugano");
      System.out.println(
        studentList.stream()
            .map(String::toUpperCase) // 中に入っている要素を特定の要素に変換する
            .sorted()
//            .distinct() // 重複除外
//            .toList() // 別のリストに変換
//            .collect(Collectors.joining(",")) // リストを一つの文字列に変換
//            .anyMatch(v -> v.startsWith("M")) // 要素の存在を判定
            .filter(v -> v.startsWith("M"))
            .findFirst() // 最初の要素を出力
      ); // 最初に見つけた要素だけを出力する

      // 今回紹介したものを一通り実装
      // 文字列のリストを作成
      // 要素数は10個
      // その文字列に対して、文字数が2以上のものを抽出して、文字列に変換。区切りはカンマ。
      List<String> stingList = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
      System.out.println(stingList);

      // 数値のリストを作成
      // その数値の中の奇数のものだけを抽出して、平均値を出す
      // その平均値を出力
    }
}