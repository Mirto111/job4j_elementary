package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {

  public static void main(String[] args) {
    Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}};
    List<Integer> nums = Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
    System.out.println(nums);
  }

}
