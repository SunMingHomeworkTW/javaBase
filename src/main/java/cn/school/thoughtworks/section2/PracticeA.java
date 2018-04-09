package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {

  Map<String, Integer> countSameElements(List<String> collection1) {
    //实现练习要求，并改写该行代码。
    Map<String, Integer> sameElementsNum = new HashMap<>();
    int num;
    for (String str : collection1) {
      if (sameElementsNum.containsKey(str)) {
        num = sameElementsNum.get(str) + 1;
      } else {
        num = 1;
      }
      sameElementsNum.put(str, num);
    }
    return sameElementsNum;
  }
}
