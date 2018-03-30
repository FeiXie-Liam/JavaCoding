package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeB {
    public Map<String, Integer> put(Map<String, Integer> map, String str, int num) {
        if (map.containsKey(str)) {
            map.replace(str, map.get(str) + num);
        } else
            map.put(str, num);
        return map;
    }

    public Map<String, Integer> put(Map<String, Integer> map, String str) {
        if (map.containsKey(str)) {
            map.replace(str, map.get(str) + 1);
        } else
            map.put(str, 1);
        return map;
    }

    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < collection1.size(); i++) {
            String element = collection1.get(i);
            if (element.length() != 1) {
                if (element.contains("-")) {
                    int num = Integer.parseInt(element.substring(element.indexOf("-") + 1));
                    result = put(result, element.substring(0, 1), num);
                } else if (element.contains(":")) {
                    int num = Integer.parseInt(element.substring(element.indexOf(":") + 1));
                    result = put(result, element.substring(0, 1), num);
                } else if (element.contains("[")) {
                    int num = Integer.parseInt(element.substring(element.indexOf("[") + 1, element.indexOf("]")));
                    result = put(result, element.substring(0, 1), num);
                }
            }
            else {
                result = put(result, element);
            }

        }
        return result;
    }
}
