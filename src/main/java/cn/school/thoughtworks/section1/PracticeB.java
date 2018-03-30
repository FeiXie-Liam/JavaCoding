package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //
        List<String> outputList = new ArrayList<>();
        for (int i = 0;i<collection1.size();i++) {
            String element = collection1.get(i);
            for(int j = 0;j<collection2.size();++j) {
                if (collection2.get(j).contains(element)) {
                    outputList.add(element);
                }
            }

        }
        return outputList;
    }
}
