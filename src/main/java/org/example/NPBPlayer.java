package org.example;

public class NPBPlayer implements NPBLeague {
  public String player1(String npbplayername1) {
    return "背番号55: " + npbplayername1;
  }

  public String player2(String npbplayername2) {
    return "背番号2: " + npbplayername2;
  }

  @Override
  public String npb(String league) {
    return league;
  }
}
