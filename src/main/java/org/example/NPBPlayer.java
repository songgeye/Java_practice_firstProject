package org.example;

public class NPBPlayer implements NPBLeague {
  public String player1(String npbplayername1) {
    return npbplayername1;
  }

  public String player2(String npbplayername2) {
    return npbplayername2;
  }

  @Override
  public String npb(String league) {
    return league;
  }
}
