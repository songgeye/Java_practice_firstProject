package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) {
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