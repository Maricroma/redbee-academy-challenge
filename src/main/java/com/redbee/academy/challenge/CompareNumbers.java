package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    
    List<Integer> numbers = new ArrayList<>();
    Integer max = 0;

    numbers.add(a);
    numbers.add(b);
    numbers.add(c);

    for (int i = 0; i < numbers.size(); i++) {
      if(numbers.get(i) != null) {
        if(numbers.get(i) > max) {
          max = numbers.get(i);
        }
      }
    }

    return max;
  }
}
