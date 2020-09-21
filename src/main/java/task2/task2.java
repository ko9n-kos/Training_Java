package task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public List<String> list1;
    public List<String> list2;

    public task2 () {

    list1 = ProcessorList.load("C:\\Users\\KonstantinSTATUTA\\IdeaProjects\\Training_Java\\src\\main\\resources\\list1.json");
    list2 = ProcessorList.load("C:\\Users\\KonstantinSTATUTA\\IdeaProjects\\Training_Java\\src\\main\\resources\\list2.json");
    }

}