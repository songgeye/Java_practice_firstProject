package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) { // upperNumberにすることもできる
            sum += i;
        }
        System.out.println(sum);

//        固定長(作った時点で固定、追加ができない。文字列の長さが固定、配列の要素が固定の場合を除き、操作しにくいのであまり使わない)
        String[] studentsNames = new String[]{"松ヶ野", "井上", "佐藤", "加藤", "田中"};
        String[] studentsNames2 = new String[]{studentsNames[0], studentsNames[1], studentsNames[2], studentsNames[3], studentsNames[4], "岡田"}; // addみたいな追加する方法がない

//        intはnew intとはできない
//        int students = {1, 2, 3, 4, 5};

//        じゃあどうするか
//        List<>を使って定義する
//        インターフェースは定義をするだけで処理は書いていない
//        実際にはArrayList<>に定義がされている
//        List<String> studentNameList = new ArrayList<>(); // int入れられないからラッパー型Integerにする必要がある
//        studentNameList.add("岡田"); // このように追加もできる

        System.out.println(studentsNames); // 配列はそのまま表示するとただの配列要素しか出てこない
//        実行結果 = [Ljava.lang.String;@6d06d69c

        System.out.println(Arrays.toString(studentsNames)); // 配列を呼び出すためにはこのようにtoStringを使う

//        配列をそのままリストに変換することができる
//        List<String> studentNameList = Arrays.asList(studentsNames); //list要素に変換する
//        System.out.println(studentNameList);

        List<String> studentNameList = List.of("松ヶ野", "井上", "佐藤", "加藤", "田中"); // 上記の配列と同じように扱える
        System.out.println(studentNameList);

//        Map<Integer, String> studentNameMap = new HashMap<>(); // Map<K, V> K = Key, V = Value
//        Map<Integer, String> studentNameMap = Map.of(1, "松ヶ野", 2, "井上", 3, "佐藤", 4, "加藤", 5, "田中"); // 連続する複数のKeyとValueを登録できる
//        System.out.println(studentNameMap);

        Map<Integer, List<String>> studentNameMap = Map.of(1, List.of("松ヶ野", "健吾"), 2, List.of("井上", "広大")); // Valueにリストを入れることもできるが、このような書き方はしない。
        System.out.println(studentNameMap);
//        実行結果 = {2=[井上, 広大], 1=[松ヶ野, 健吾]}

//        リストの数だけ、配列の数だけループを回すときに使うのが拡張For文
//        for(String name : studentNameList) {
//            System.out.println(name);
//        }

//        繰り返している中で分岐したい場合に下記のような処理をするが、ネスト構文は読みにくくなるのでできる限り避ける
//        そのためには最初にリストから除外しておくという考え方も持っておくこと
        for (String name : studentNameList) {
            if (name.equals("松ヶ野")) {
                System.out.println(name);
            }
        }

//        Switch / Case
//        出力された結果によって表示を変えたい場合
        int number = 10;
        if(number == 1) {
            System.out.println(1);
        } else if (number == 2) {
            System.out.println(2);
        } else {
            System.out.println(10);
        }

        int number2 = 10;
      switch (number2) { // ここには数値化文字列を入れる
        case 1 -> System.out.println(1);
        case 2 -> System.out.println(2);
        default -> System.out.println(10);
      }

//        生徒名みたいな文字列のリストを作成する。
//        リストの数は10個以上。
//        リストに入っている文字数が3(5に変更)文字以上のものを表示する。
//        このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。

//        生徒と番号の組みわせのMapを作成（例：(1,"松ヶ野"))
//        Mapの要素は10個以上。
//        Mapの中の番号が偶数のものをMapから削除する。
//        上記の処理を行う繰り返し処理の実装
//        削除した状態のものを出力して表示

        List<String> playerNameList = List.of("大谷翔平", "ムーキー・ベッツ", "フレディ・フリーマン", "テオスカー・ヘルナンデス", "ウィル・スミス", "マイケル・コンフォート", "マックス・マンシー", "アンディ・パヘス", "トミー・エドマン", "キケ・ヘルナンデス", "山本由伸");
        for(String name : playerNameList) {
            if(name.length() >=5) {
                System.out.println(name);
            }
        }

//        Map<Integer, List<String>> playerNameMap = Map.of(
//            1, List.of("大谷翔平"),
//            2, List.of("ムーキー・ベッツ"),
//            3, List.of("フレディ・フリーマン"),
//            4, List.of("テオスカー・ヘルナンデス"),
//            5, List.of("ウィル・スミス"),
//            6, List.of("マックス・マンシー"),
//            7, List.of("アンディ・パヘス"),
//            8, List.of("トミー・エドマン"),
//            9, List.of("キケ・ヘルナンデス"),
//            10, List.of("山本由伸"));
//        for (Integer bLineup : playerNameMap.keySet()) {
//            if (bLineup % 2 != 0) {  // 奇数の打順
//                System.out.println(bLineup + ": " + playerNameMap.get(bLineup));
//            }
//        }

        Map<Integer, List<String>> playerNameMap2 = new LinkedHashMap<>();
        playerNameMap2.put(1, List.of("大谷翔平"));
        playerNameMap2.put(2, List.of("ムーキー・ベッツ"));
        playerNameMap2.put(3, List.of("フレディ・フリーマン"));
        playerNameMap2.put(4, List.of("テオスカー・ヘルナンデス"));
        playerNameMap2.put(5, List.of("ウィル・スミス"));
        playerNameMap2.put(6, List.of("マックス・マンシー"));
        playerNameMap2.put(7, List.of("アンディ・パヘス"));
        playerNameMap2.put(8, List.of("トミー・エドマン"));
        playerNameMap2.put(9, List.of("キケ・ヘルナンデス"));
        playerNameMap2.put(10, List.of("山本由伸"));

        // 奇数のキーのみ表示（順序保証）
        for (Integer bLineup2 : playerNameMap2.keySet()) {
            if (bLineup2 % 2 != 0) {
                System.out.println(bLineup2 + ": " + playerNameMap2.get(bLineup2));
            }
        }
    }
}