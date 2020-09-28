package com.testng.task;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListAssertion extends Greeting {


    @BeforeClass
    public void sayHello(){
        greeting();
    }


    @Test (enabled = true)
    @Parameters({"path1", "path2"})
    public void assertion(String path1, String path2) throws IOException{
        List<String>name1= collectionReader(path1);
        List<String>name2= collectionReader(path2);
        Assert.assertEquals(name1, name2);
    }

    @Test (enabled = true)
    @Parameters({"path1", "path2"})
    public void subtraction(String path1, String path2) throws IOException{
        List<String>name1= collectionReader(path1);
        List<String>name2= collectionReader(path2);
        List<String>resultList = new ArrayList<>();
        resultList.addAll(name1);
        for (String z : name2)
            if (!resultList.contains(z)) {
                resultList.add(z);
            }
        System.out.println(resultList);
    }


}
