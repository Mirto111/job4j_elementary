package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("parsentev@yandex.ru", "Petr Arsentev");
    map.put("ivanov@yandex.ru", "Sergey Ivanov");
    map.put("petrov@yandex.ru", "Anton Petrov");

    for (String key : map.keySet()) {
      String value = map.get(key);
      System.out.println(key + " = " + value);
    }
  }

}
