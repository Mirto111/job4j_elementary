package ru.job4j.poly;

public class Bus implements Transport {

  @Override
  public void ride() {
    System.out.println("Автобус поехал");
  }

  @Override
  public void passengers(int amount) {
    System.out.println("Количестов пассажиров - " + amount);
  }

  @Override
  public float fillUp(int fuel) {
    float price = 5.15f;
    return fuel * price;
  }
}
