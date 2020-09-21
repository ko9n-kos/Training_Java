package task2;

import java.util.ArrayList;
import java.util.List;

public class Inter {
    public static void intersection() {
        task2 collections = new task2();
        List<String> listIntersection = new ArrayList<>();
        for (String i : collections.list1) {
            for (String z : collections.list2) {
                if (i.equals(z)) {
                    listIntersection.add(i);


                }
            }
        }
        System.out.println(listIntersection);
    }
}
