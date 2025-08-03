package org.example;

import java.util.List;
import java.util.Optional;

public class Main {

  public static void main(String[] args) {
    List<Book> bookList = List.of(
        new Book("Java入門", "山田太郎", 1001),
        new Book("Python基礎", "田中花子", 1002),
        new Book("データベース設計", "佐藤次郎", 1003),
        new Book("Spring Boot実践", "鈴木美咲", 1004),
        new Book("React入門", "高橋健太", 1005)
    );

    Library library = new Library(bookList);

    Optional<Book> titleResult = library.searchByTitle("Java入門");
    if (titleResult.isPresent()) {
      System.out.println("タイトル検索結果: " + titleResult.get());
    }

    Optional<Book> authorResult = library.searchByAuthor("田中花子");
    if (authorResult.isPresent()) {
      System.out.println("著者検索結果: " + authorResult.get());
    }

    Optional<Book> numberResult = library.searchByNumber(1003);
    if (numberResult.isPresent()) {
      System.out.println("番号検索結果: " + numberResult.get());
    }
  }
}