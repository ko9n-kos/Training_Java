package com.testng.task;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public abstract class Greeting {

    public void greeting(){
        System.out.println("Привет");
    }


    public List<String> collectionReader(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        return objectMapper.readValue(Paths.get(path).toFile(), List.class);
    }

    static boolean dividesByTwo(int a){
        return (a%2==0);
    }

}
