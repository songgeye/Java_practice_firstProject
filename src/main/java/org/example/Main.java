package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {
    // 入出力処理 = ファイルの操作のことを刺すことが多い

    // エラー = どうしようもないもの

    // 例外 = 制御できるもの
    // 検査例外、非検査例外(Error)

    // throwsはエラーを投げるだけ

    // try (ファイルを開く(try with resources))) { // とりあえず実行
    // 上記でファイルを開くを入れておくとここで入れる必要がない
    // tryのみだとthrowsが必要
//    try {
//      Path path = Path.of("JavaCourse.txt"); // ファイルの場所を指定しただけ
//      Files.writeString(path, "Javaコース楽しすぎる！！",
//          StandardOpenOption.APPEND); // StandardOpenOptionのデフォはCREATE
//      System.out.println(Files.readString(path)); // ファイルの中身を読み込む
//    } catch (IOException e) {
//       e.printStackTrace(); // 例外の内容をコンソールに表示する
//      // キャッチしたエラーの処理
//      // ここで処理をするとエラーはなかったことになる
//      System.out.println("例外が発生した");
//    }
//      finally {
//        // ファイル閉じる
//      }

    // 入出力処理を実際に実装して、作ったファイルに文章を追加する
    // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う
    // catchしたなかでさらにファイルに書き込もうとして例外になった場合、どうなるのかを確認
    Path path = null;
    try {
      path = Path.of("JavaPractice.txt");
      Files.writeString(path, "例外処理の課題をやってます", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("最初の例外をキャッチしました");
      try {
        Files.writeString(path, "例外処理の課題をやってます", StandardOpenOption.APPEND);
        System.out.println(Files.readString(path));
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}