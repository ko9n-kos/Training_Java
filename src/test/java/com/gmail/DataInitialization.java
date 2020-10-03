package com.gmail;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.collection.Array;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class DataInitialization {

    private static final String pathToData = "src/test/resources/TestData.JSON";

    public static TestData initialization() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TestData data = objectMapper.readValue(new File(pathToData), TestData.class);

        return data;

    }

}
