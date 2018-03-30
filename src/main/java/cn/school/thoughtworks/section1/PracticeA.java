package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //
        List<String> outputList = new ArrayList<>();
        for (int i = 0;i<collection1.size();i++) {
            String element = collection1.get(i);
            if (collection2.contains(element)) {
                outputList.add(element);
            }
        }
        return outputList;
    }
}
