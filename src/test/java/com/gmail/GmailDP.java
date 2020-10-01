package com.gmail;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class GmailDP {



    @DataProvider(name = "emailsProvider")
    public Object[][] emailProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<String> emails = objectMapper.readValue(Paths.get("src/test/resources/Emails").toFile(), List.class);
        return new Object[][]{{emails}};
    }



//    @DataSupplier(name = "emailsProvider")
//    public Object[] emailsProvider() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//        List<String> emails = objectMapper.readValue(Paths.get("src/test/resources/Emails").toFile(), List.class);
//        Object[] data = new Object[emails.size()][];
//        for (int i = 0; i < emails.size() - 1; i++) {
//            data[i] = emails.get(i);
//
//        }
//        return  data;
//    }

//    @DataSupplier(name = "emailsProvider")
//    public List<String> emailProvider() throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
//        List<String> emails = objectMapper.readValue(Paths.get("src/test/resources/Emails").toFile(), List.class);
//        return emails;
//    }



//    @DataProvider(name = "emailsProvider")
//    public static Object[][] emailsProvider(){
//        return new Object[][] {{"test1@gmail.com"}, {"test2@gmail.com"}, {"test3@gmail.com"}};
//    }




}
