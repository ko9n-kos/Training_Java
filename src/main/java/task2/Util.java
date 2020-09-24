package task2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Util {


    public static List<String> load(String pathToFile) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        File dataFile = Paths.get(pathToFile).toFile();

        return objectMapper.readValue(dataFile, List.class);
    }
}
