package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {

  Map<String, Integer> createUpdatedCollection(List<String> collectionA,
      Map<String, List<String>> object) {
    //实现练习要求，并改写该行代码。
    //统计集合collectionA中重复元素出现的次数,有过有-就把-右边的数字也计算入个数
    Map<String, Integer> collection3 = new HashMap<>();
    int num;
    int num1;
    for (String str : collectionA) {
      if (str.indexOf("-") > 0) {
        String[] strs = str.split("-");
        str = strs[0];
        num1 = Integer.valueOf(strs[1]);
      } else {
        num1 = 1;
      }
      if (collection3.containsKey(str)) {
        num = collection3.get(str) + num1;
      } else {
        num = num1;
      }
      collection3.put(str, num);
    }

    //选出collection3跟object中value属性对应的list中的元素相同的元素,把他们的count，满3减1
    for (String str : collection3.keySet()) {
      for (List list : object.values()) {
        if (list.contains(str)) {
          collection3.replace(str, collection3.get(str) - collection3.get(str) / 3);
        }
      }
    }
    return collection3;
  }
}
