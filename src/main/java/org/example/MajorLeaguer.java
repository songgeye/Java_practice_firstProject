package org.example;

public class MajorLeaguer implements MajorLeague {
  public String player1 (String majorLeaguername1) {
    return majorLeaguername1;
  }

  public String player2 (String majorLeaguername2) {
    return majorLeaguername2;
  }

  @Override
  public String major(String league) {
    return league;
  }
}