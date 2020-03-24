package ru.job4j.io;

import java.util.Scanner;

public class Matches {

  public static void main(String[] args) {

    int matches = 11;
    Scanner input = new Scanner(System.in);
    System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек."
        + "  Выигрывает тот, кто забрал последние спички.");
    boolean select = true;
    while (matches > 0) {
      String player = select ? "Первый" : "Второй";
      System.out.print(player + " игрок берет спички  ");
      int size = Integer.valueOf(input.nextLine());
      matches -= size;
      System.out.println("Осталось " + matches + " cпичек");
      select = !select;
    }
  }

}
