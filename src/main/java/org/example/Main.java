package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) {

    Map<String, String> adressMap = new HashMap<>();
    adressMap.put("井上", "hoge@gmail.com");
    adressMap.put("佐藤", "fuga@gmail.com");
    adressMap.put("田中", "aabbcc@yahoo.co.jp");
    adressMap.put("松ヶ野", "raise-tech.net");

    List<String> adressList = new ArrayList<>();
    for (Entry<String, String> adress : adressMap.entrySet()) { // adressMap自体はforで回せないので、entrySet()を使って回す
      if (adress.getValue().matches()) { // 正規表現にマッチするものだけソート
        adressList.add(adress.getValue());
      }
    }

    System.out.println(adressList);
  }
}