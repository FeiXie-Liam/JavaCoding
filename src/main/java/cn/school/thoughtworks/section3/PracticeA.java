package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> collectionB = object.get("value");
        for (int i = 0; i < collectionB.size(); i++) {
            if (collectionA.containsKey(collectionB.get(i))) {
                int num = collectionA.get(collectionB.get(i));
                collectionA.put(collectionB.get(i),num - 1);
            }
        }
        return collectionA;
    }
}
