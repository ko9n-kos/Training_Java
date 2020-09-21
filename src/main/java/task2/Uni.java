package task2;

import java.util.ArrayList;
import java.util.List;

public class Uni {
    public static void union() {
        task2 collections = new task2();
        List<String> listUnion = new ArrayList<>();
        listUnion.addAll(collections.list1);
        listUnion.addAll(collections.list2);

        System.out.println(listUnion);

    }
}
