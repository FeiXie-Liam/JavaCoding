package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();

        for (int i = 0; i < collection1.size(); i++) {
            String element = collection1.get(i);
            if (result.containsKey(element)) {
                result.replace(element, result.get(element) + 1);
            }
            else
                result.put(element, 1);
        }
        return result;
    }
}
