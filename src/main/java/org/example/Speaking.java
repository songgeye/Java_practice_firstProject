package org.example;

public interface Speaking { // インターフェースは処理の詳細(中身)を書いてはいけない
  public String say (String message); // インスタンス生成ができない(実体を持たない = 中身がない)
}
