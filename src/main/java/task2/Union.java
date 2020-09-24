package task2;

import java.util.ArrayList;
import java.util.List;

public class Union extends ProcessorList {

    @Override
    public void process(List<String> list1, List<String> list2) {
        resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);

        printResult();
    }

}
