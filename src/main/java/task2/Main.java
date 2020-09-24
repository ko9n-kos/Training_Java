package task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list1 = Util.load("C:\\Users\\KonstantinSTATUTA\\IdeaProjects\\Training_Java\\src\\main\\resources\\list1.json");
        List<String> list2 = Util.load("C:\\Users\\KonstantinSTATUTA\\IdeaProjects\\Training_Java\\src\\main\\resources\\list2.json");

        List<ProcessorList> processList = Arrays.asList(new Intersection(), new Union(), new Difference(), new Subtraction());
        for (ProcessorList p : processList) {
            p.process(list1, list2);
        }
    }
}








