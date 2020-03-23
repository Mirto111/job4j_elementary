package ru.job4j.pojo;

public class Library {

  public static void main(String[] args) {
    Book stihi = new Book("Cтихи", 30);
    Book skazki = new Book("Сказки", 65);
    Book basni = new Book("Басни", 50);
    Book cleancode = new Book("Clean code", 10);

    Book[] books = new Book[4];
    books[0] = stihi;
    books[1] = skazki;
    books[2] = basni;
    books[3] = cleancode;
    for (Book b : books) {
      System.out.println(b.getName() + " - " + b.getPages());
    }

    Book temp = books[0];
    books[0] = books[3];
    books[3] = temp;
    for (Book b : books) {
      System.out.println(b.getName() + " - " + b.getPages());
    }
    for (Book b : books) {
      if ("Clean code".equals(b.getName())) {
        System.out.println(b.getName() + " - " + b.getPages());
      }
    }
  }

}
