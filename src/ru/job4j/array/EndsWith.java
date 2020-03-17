package ru.job4j.array;

public class EndsWith {

  public static boolean endsWith(char[] word, char[] post) {
    boolean result = true;
    if (post.length > word.length) {
      return false;
    }

    for (int i = 0; i < post.length; i++) {
      if (post[i] != word[word.length - post.length + i]) {
        result = false;
        break;
      }
    }
    return result;
  }

}
