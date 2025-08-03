package org.example;

import java.util.List;
import java.util.Optional;

public class Library {

  private List<Book> books;

  public Library(List<Book> books) {
    this.books = books;
  }

  public Optional<Book> searchByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().equals(title))
        .findFirst();
  }

  public Optional<Book> searchByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .findFirst();
  }

  public Optional<Book> searchByNumber(int number) {
    return books.stream()
        .filter(book -> book.getNumber() == number)
        .findFirst();
  }
}