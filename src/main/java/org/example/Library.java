package org.example;

import java.util.List;
import java.util.Optional;

public class Library {

  private List<Book> books = List.of(
      new Book("Java入門", "John", 1),
      new Book("Python基礎", "Michael", 2)
  );

//  public void displayAllBooks() {
//    System.out.println("=== 図書一覧 ===");
//    List<String> books = getBookList();
//    books.stream()
//        .filter(book -> !book.isEmpty())
//        .map(book -> "- " + book)
//        .forEach(System.out::println);
//  }

  // タイトルで検索（1冊見つける）
  // ヒント：Stream APIの何を使う？
  // Optional<Book>を扱うことになりそう...
  public Optional<Book> findBookByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().equals(title))
        .findFirst();
  }

  public Optional<Book> findAndDisplayBookByTitle(String title) {
    Optional<Book> result = findBookByTitle(title);  // 既存メソッドを再利用
    result.ifPresent(System.out::println);
    return result;
  }

//  // タイトルで検索（複数見つける）
//  public List<Book> findBooksByTitle(String title) {
//    // ヒント：filter()が使えそう
//  }
//
//  // 著者名で検索
//  public List<Book> findBooksByAuthor(String author) {
//    // ヒント：getAuthor()と比較
//  }
}
