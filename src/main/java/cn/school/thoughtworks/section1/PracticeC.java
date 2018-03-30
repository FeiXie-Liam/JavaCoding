package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        //
        List<String> outputList = new ArrayList<>();
        List<String> c2 = collection2.get("value");
        for (int i = 0; i < collection1.size(); i++) {
            String element = collection1.get(i);
            if (c2.contains(element)) {
                outputList.add(element);
            }

        }
        return outputList;
    }
}
