package org.example;

public class Greeting implements Speaking { // Speakingの中身で定義されていることを全て実装しなければならない
  public String sayHello (String name) {
    return "Hello, " + name + "!";
  }

  @Override
  public String say(String message) { // 引数は変えてもいいが定義元と合わせることが多い
    return message;
  }
}
