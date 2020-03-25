package ru.job4j.strategy;

public class Paint {

  public void draw(Shape shape) {
    System.out.print(shape.draw());
  }

  public static void main(String[] args) {
    Paint paint = new Paint();
    Shape square = new Square();
    paint.draw(square);
    Shape triangle = new Triangle();
    paint.draw(triangle);
  }
}
