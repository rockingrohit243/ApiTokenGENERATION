package com.fromdbto.csvfile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class CsvFileApplication {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = SpringApplication.run(CsvFileApplication.class, args);
        DataWriter dataWriter = context.getBean(DataWriter.class);
        dataWriter.writeDataToCsv();
        context.close();
    }
}
