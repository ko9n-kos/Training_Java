package task2;

import java.util.ArrayList;
import java.util.List;

public class Intersection extends ProcessorList {


    @Override
    public void process(List<String> list1, List<String> list2) {
        resultList = new ArrayList<>();
        for (String i : list1) {
            for (String z : list2) {
                if (i.equals(z)) {
                    resultList.add(i);
                }
            }
        }
        printResult();
    }
}


