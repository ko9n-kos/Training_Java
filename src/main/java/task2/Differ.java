package task2;

import java.util.ArrayList;
import java.util.List;

public class Differ {
    public static void symmetricDifference() {
        task2 collections = new task2();
        List<String> symmetricDifference = new ArrayList<>();
        symmetricDifference.addAll(collections.list1);
        {
            for (String z : collections.list2) {
                if (!symmetricDifference.contains(z)) {
                    symmetricDifference.add(z);
                }
            }
            System.out.println(symmetricDifference);


        }
    }
}
