package org.example;

public class Main {

  public static void main(String[] args) {
    // 今回実装したものを一通り実践
    // GreetingとSpeakingは使わずにinterfaceと実装を組み合わせて作ってみる
    // interfaceの実装を2つ以上作る
    // extendsを使ってみる
    // 上記で作った2つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出す
    // メソッド呼び出しは親子のどちらとも呼び出してみる
    Printer printer = new Printer();

    // メジャーリーグ選手
    MajorLeaguer majorLeaguer = new MajorLeaguer();
    printer.printplayer(majorLeaguer.player1("大谷翔平"));
    printer.printplayer(majorLeaguer.player2("山本由伸"));

    // NPB選手
    NPBPlayer npbPlayer = new NPBPlayer();
    printer.printplayer(npbPlayer.player1("村上宗隆"));
    printer.printplayer(npbPlayer.player2("今井達也"));

    // スター選手
    StarPlayer starPlayer = new StarPlayer();
    printer.printplayer(starPlayer.player1("大谷翔平"));
    printer.printplayer(starPlayer.player2("山本由伸"));

    // レジェンド選手
    printer.printplayer(starPlayer.getlegendPlayer1("イチロー"));
    printer.printplayer(starPlayer.getlegendPlayer2("松井秀喜"));

    printer.printplayer(starPlayer.getgodPlayer("イチロー"));

    // NPBレジェンド選手
    OldhandPlayer oldhandPlayer = new OldhandPlayer();
    printer.printplayer(oldhandPlayer.getJapanlegendPlayer1("坂本勇人"));

    printer.printplayer(oldhandPlayer.getoldhandPlayer("松坂大輔"));
  }
}