package org.example;

import java.util.List;

public class Main {

  private static final String NAME = "Kengo Matsugano"; // 定数

  public static void main(String[] args) {
    // Java 命名規則
    // 日本語、英語、アンダーバーとか色々な文字列が使える
    // 先頭文字に数字は使えない
    // 文字数制限はない
    // 大文字と小文字は区別される

    // Pascal
    // 先頭は大文字、一般的な英語の書き方と同じ
    // Main, Greeting
    //
    // Camel
    // 先頭は小文字、言葉の区切りから大文字
    // sayHello, numberSecond

    // フィールド名、変数名
    // 名詞
    // number, message, name, xxList

    // メソッド名
    // 動詞
    // say, greet, print, printMessage
    // getXX, setXX, countXX

    // 定数
    // フィールドとの違いは固定値であること、絶対に変更しないこと
    // 全て大文字、Snakeケースを使う場合もある
    // FULL_NAME

    // 真偽値、booleanを使う時の名前
    // isXX, hasXX
    // isNumber, isEmpty, isNull

    // 命名の仕方
    // 適当な名前をつけないこと、誰かに使われることを想定する
    // 誰にも使われない、誰にも見せないものであれば適当でもいい
    // 長くなってもいい、でも名前はコンパクトが一番、短く正確に伝わるのが理想
    // 正確であることが大事、短くするのは後
    // a, b, cのような適当な名前はなるべくつけない
    //
    // 課題
    // 図書管理システムの作成
    // 書籍(Book)を管理する情報(タイトル、著者、番号)を持つオブジェクト(クラス)を作成し、格納する
    // 図書館(Library)みたいなものを作って、そこにBookをListで持つようなものを保持する
    // mainメソッドからこのLibraryクラスに対して検索ができるようにする、Libraryクラスは書籍検索の機能を持つ
    // タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる
    // それをmainメソッドから実行して、実行結果をコンソールに出力する

//    Book book = new Book("ブランディングの科学", "バイロンシャープ", 1);
//    book.setTitle("ブランディングの科学2"); // タイトルを上書き、ただあまり上書きを勝手にしないので使わない
//    上書きしたいのであればもう一回インスタンス生成する

    Book book1 = new Book("ブランディングの科学", "バイロンシャープ", 1);
    Book book2 = new Book("ブランディングの科学", "バイロンシャープ", 2);
    System.out.println(book1.getTitle()); // staticではないものを取る時にgetterで取ってくる

    List<Book> bookList = List.of(book1, book2);
//    System.out.println(bookList); // このまま出力するとList<Book>が何の型なのかプログラム側がわからない
  }
}