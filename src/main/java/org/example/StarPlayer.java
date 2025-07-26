package org.example;

public class StarPlayer extends MajorLeaguer {

  public String player1(String starPlayerName1) {
    return "ホームラン王: " + starPlayerName1;
  }

  public String player2(String starPlayerName2) {
    return "3年連続沢村賞受賞投手: " + starPlayerName2;
  }

  public String getlegendPlayer1(String legendPlayerName1) {
    return super.player1(legendPlayerName1);
  }

  public String getlegendPlayer2(String legendPlayerName2) {
    return super.player2(legendPlayerName2);
  }

  // 親クラスのmajor()を呼び出すメソッド
  public String getgodPlayer(String league) {
    return "野球の神: " + super.major(league);
  }
}
