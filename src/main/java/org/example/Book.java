package org.example;

public class Book {

  private String title;
  private String author;
  private int number;

  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Book{title='" + title + "', author='" + author + "', number=" + number + "}";
  }
}