package task2;

import java.util.ArrayList;
import java.util.List;

public class Subtraction extends ProcessorList {

    @Override
    public void process(List<String> list1, List<String> list2) {
        resultList = new ArrayList<>();
        resultList.addAll(list1);
        for (String z : list2)
            if (resultList.contains(z)) {
                resultList.remove(z);
            }
        printResult();
    }
}
