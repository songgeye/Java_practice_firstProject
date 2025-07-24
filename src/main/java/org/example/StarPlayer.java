package org.example;

public class StarPlayer extends MajorLeaguer {

  public String player1(String starPlayerName1) {
    return "ホームラン王: " + starPlayerName1;
  }

  public String player2(String starPlayerName2) {
    return "3年連続沢村賞受賞投手: " + starPlayerName2;
  }

    @Override
    public String major(String MajorLeague) {
      return "世界のスター: " + MajorLeague;
    }
}
