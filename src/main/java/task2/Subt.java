package task2;

import java.util.ArrayList;
import java.util.List;

public class Subt {
    public static void subtract() {
        task2 collections = new task2();
        List<String> subtractList = new ArrayList<>();
        subtractList.addAll(collections.list1);
        {
            for (String z : collections.list2) {
                if (subtractList.contains(z)) {
                    subtractList.remove(z);
                }
            }
            System.out.println(subtractList);

        }

    }
}
