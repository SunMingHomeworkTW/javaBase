package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {

  Map<String, Integer> createUpdatedCollection(List<String> collectionA,
      Map<String, List<String>> object) {
    //实现练习要求，并改写该行代码。
    //统计集合collectionA中重复元素出现的次数
    Map<String, Integer> collection3 = new HashMap<>();
    int num;
    for (String str : collectionA) {
      if (collection3.containsKey(str)) {
        num = collection3.get(str) + 1;
      } else {
        num = 1;
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
