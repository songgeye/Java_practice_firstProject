package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    Map<String, String> adressMap = new HashMap<>();
    adressMap.put("井上", "hoge@gmail.com");
    adressMap.put("佐藤", "fuga@gmail.com");
    adressMap.put("田中", "aabbcc@yahoo.co.jp");
    adressMap.put("松ヶ野", "raise-tech.net");

//    List<String> adressList = new ArrayList<>();
//    for (Entry<String, String> adress : adressMap.entrySet()) { // adressMap自体はforで回せないので、entrySet()を使って回す
//      if (adress.getValue().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) { // 正規表現にマッチするものだけソート
//        adressList.add(adress.getValue());
//      }
//    }　// 上記の文を下記のストリームに変換
    List<String> adressList = adressMap.values().stream()
        .filter(s -> s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
        .collect(Collectors.toList());
    // adressMap自体はforで回せないので、entrySet()を使って回す
    // 正規表現にマッチするものだけソート

    System.out.println(adressList);

    // Listにランダムに30個以上文字列を入れる
    // その文字列のリストに対して「数字だけを抜き出す正規表現」と「文字列だけを抜き出す正規表現」を試す
    // さらにそれができたら文字を抜き出すときに英数字の大文字だけを抜き出す
    // さらにさらにそれができたら、漢字とひらがな、カタカナなどの日本語にマッチする正規表現を抜き出す
    // さらにさらにさらにそれができたら、英数字以外の文字を抜き出す正規表現
    List<String> patternList = new ArrayList<>();

    // 1-5: 英数字混合
    patternList.add("Hello123");
    patternList.add("Test456");
    patternList.add("User789");
    patternList.add("Admin2024");
    patternList.add("Pass99");

    // 6-10: 大文字のみ
    patternList.add("HELLO");
    patternList.add("WORLD");
    patternList.add("JAVA");
    patternList.add("COMPUTER");
    patternList.add("SYSTEM");

    // 11-15: 小文字のみ
    patternList.add("hello");
    patternList.add("world");
    patternList.add("programming");
    patternList.add("keyboard");
    patternList.add("mouse");

    // 16-20: 数字のみ
    patternList.add("123456");
    patternList.add("789012");
    patternList.add("555666");
    patternList.add("202412");
    patternList.add("999888");

    // 21-25: 日本語（ひらがな・カタカナ・漢字）
    patternList.add("ひらがな");
    patternList.add("カタカナ");
    patternList.add("漢字");
    patternList.add("コンピュータ");
    patternList.add("にほんご");

    // 26-30: 混合・特殊パターン
    patternList.add("user@email.com");
    patternList.add("Hello World");
    patternList.add("プログラミング学習");
    patternList.add("file_name.txt");
    patternList.add("東京タワー123");

    int index = 1;
    for (String str : patternList) {
      String pattern = analyzePattern(str);
      System.out.printf("%2d: %-25s [%s]%n", index++, str, pattern);
    }

    // 正規表現テスト
    testPatterns(patternList);
  }

    public static String analyzePattern(String str) {
      List<String> patterns = new ArrayList<>();

      if (str.matches(".*[A-Z].*")) patterns.add("大文字");
      if (str.matches(".*[a-z].*")) patterns.add("小文字");
      if (str.matches(".*\\d.*")) patterns.add("数字");
      if (str.contains("あ") || str.contains("い") || str.contains("う") ||
          str.contains("ひ") || str.contains("が") || str.contains("な") ||
          str.contains("に") || str.contains("ん")) patterns.add("ひらがな");
      if (str.contains("ア") || str.contains("カ") || str.contains("タ") ||
          str.contains("コ") || str.contains("ン")) patterns.add("カタカナ");
      if (str.contains("漢") || str.contains("字") || str.contains("東") ||
          str.contains("京") || str.contains("学") || str.contains("習")) patterns.add("漢字");
      if (str.matches(".*[@._-].*")) patterns.add("記号");

      return patterns.isEmpty() ? "その他" : String.join("+", patterns);
    }

}