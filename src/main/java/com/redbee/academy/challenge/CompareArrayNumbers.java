package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    
    List<Integer> masterList = new ArrayList<>();
    List<Integer> bigList = a;
    List<Integer> smallList = b;

    if(a.size() < b.size()) {
      bigList = b;
      smallList = a;
    } 

    for (int i = 0; i < bigList.size(); i++) {
      if(i < smallList.size()) {
        if(bigList.get(i) > smallList.get(i)) {
          masterList.add(bigList.get(i));
        } else {
          masterList.add(smallList.get(i));
        }
      } else {
        masterList.add(bigList.get(i));
      }

    }

    return masterList;
  }



}
