package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {

  Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA,
      Map<String, List<String>> object) {
    //实现练习要求，并改写该行代码。
    for (String str : collectionA.keySet()) {
      for (List list : object.values()) {
        if (list.contains(str)) {
          collectionA.replace(str, collectionA.get(str) - collectionA.get(str) / 3);
        }
      }
    }
    return collectionA;
  }
}
