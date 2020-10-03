package com.gmail;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sskorol.core.DataSupplier;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class GmailDP {

    protected final String pathToFile = "src/test/resources/Emails";

    @DataSupplier(name = "emailsProvider")
    public List<String> emailProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<String> emails = objectMapper.readValue(Paths.get(pathToFile).toFile(), List.class);
        return emails;
    }






//    @DataProvider(name = "emailsProvider")
//    public Object[][] emailProvider() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//        List<String> emails = objectMapper.readValue(Paths.get(pathToFile).toFile(), List.class);
//        Object[][] ob = new Object [emails.size()][1];
//        for(int i =0; i < emails.size(); i++){
//        ob[i][0]= emails.get(i);
//        }
//        return ob;
//    }

}
