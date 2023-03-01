package com.fromdbto.csvfile;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataWriter {

    @Autowired
    private DataDao dataDao;

    public void writeDataToCsv() throws IOException {
        List<MyData> data = dataDao.getAllData();
        CsvWriter.writeDataToCsv(data, "Rohit.csv");
    }
}

