package org.example;

public class Main {

  public static void main(String[] args) {
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

    Book book = new Book("ブランディングの科学", "バイロンシャープ", 1);
    System.out.println(book.getTitle()); // staticではないものを取る時にgetterで取ってくる

    Library library = new Library();
    library.findBookByTitle("a");
    library.findAndDisplayBookByTitle("b");
    library.findAndDisplayBookByTitle("Java入門");
    library.findBookByTitle("存在しない本");
//    System.out.println(library.getBookList());
//    library.displayAllBooks();
  }
}