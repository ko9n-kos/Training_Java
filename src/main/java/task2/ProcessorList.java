package task2;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcessorList {

    protected List<String> resultList = new ArrayList<>();

    public void printResult() {
        System.out.println(resultList);
    }

    public abstract void process(List<String> list1, List<String> list2);

}


