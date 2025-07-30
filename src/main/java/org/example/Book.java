package org.example;

public class Book {

  String title;

  String author;

  int isbn;

  public Book(String title, String author, int isbn) {
    this.title = title; // thisは自分自身、thisがないとどれかわからなくなる
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getIsbn() {
    return isbn;
  }
}
