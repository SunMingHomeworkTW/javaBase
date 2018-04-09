package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {

  Map<String, Integer> countSameElements(List<String> collection1) {
    //实现练习要求，并改写该行代码。
    Map<String, Integer> sameElementsNum = new HashMap<>();
    int num;
    int num1;
    for (String str : collection1) {
      if (str.indexOf("-") > 0) {
        String[] strs = str.split("-");
        str = strs[0];
        num1 = Integer.valueOf(strs[1]);
      } else {
        num1 = 1;
      }
      if (sameElementsNum.containsKey(str)) {
        num = sameElementsNum.get(str) + num1;
      } else {
        num = num1;
      }
      sameElementsNum.put(str, num);
    }
    return sameElementsNum;
  }
}
