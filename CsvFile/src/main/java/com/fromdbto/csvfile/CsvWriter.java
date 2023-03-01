package com.fromdbto.csvfile;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class CsvWriter {

    public static void writeDataToCsv(List<MyData> data, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        for (MyData d : data) {
            csvPrinter.printRecord(d.getId(), d.getDescription(), d.getTitle());
        }
        csvPrinter.flush();
        csvPrinter.close();
        writer.close();
    }
}
