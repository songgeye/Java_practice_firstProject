package org.example;

public class Main {

  public static void main(String[] args) {
    Greeting greeting = new Greeting();
    String message = greeting.sayHello("Kengo Matsugano");

    Printer printer = new Printer();
//    printer.printMessage(greeting.sayHello("Kengo Matsugano"));
    printer.printMessage(message);

//    Speaking speaking = new Greeting(); // Speakingというインターフェースの中にGreetingという実体を入れることができる
//    // ただあくまでインターフェース内で書かれていることしか見れない

//    List<String> list = new ArrayList<>(); // List<>もインターフェース
//    // ArrayList<>()の機能ではなく、List<>の機能を使っている
//    List<String> list2 = new LinkedList<>();
//    // List<>やinterfaceでもらえる方が好きに選べるのでありがたい

    // 継承より委譲
    // 継承で作ると複雑になることで問題になりやすい
    // バグを生みやすいので継承を現場では好んで使わない

    // 今回実装したものを一通り実践
    // GreetingとSpeakingは使わずにinterfaceと実装を組み合わせて作ってみる
    // interfaceの実装を2つ以上作る
    // extendsを使ってみる
    // 上記で作った2つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出す
    // メソッド呼び出しは親子のどちらとも呼び出してみる
    MajorLeaguer majorLeaguer = new MajorLeaguer();
    String majorLeaguername1 = majorLeaguer.player1("大谷翔平");
    String majorLeaguername2 = majorLeaguer.player2("山本由伸");

    NPBPlayer npbPlayer = new NPBPlayer();
    String npbplayername1 = npbPlayer.player1("村上宗隆");
    String npbplayername2 = npbPlayer.player2("牧秀悟");

    StarPlayer starPlayer = new StarPlayer();
    String starPlayerName1 = starPlayer.player1("大谷翔平");
    String starPlayerName2 = starPlayer.player2("山本由伸");

    Printer printerSports = new Printer();
    printerSports.printplayer(majorLeaguername1);
    printerSports.printplayer(majorLeaguername2);
    printerSports.printplayer(npbplayername1);
    printerSports.printplayer(npbplayername2);
    printerSports.printplayer(starPlayerName1);
    printerSports.printplayer(starPlayerName2);
  }
}
// メソッドを呼び出す時はstaticが必要