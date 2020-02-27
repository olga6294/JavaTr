package csvio;

import csvprocessor.CSVLine;
import csvprocessor.CSVMapper;
import csvprocessor.CSVService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class CSVMain {

    public static void main(String[] args){

        try {
            List<String> lines = CSVReader.read("src/resources/SalesJan2009.csv");
            List<CSVLine> csvLines = CSVReader.read(lines, new CSVMapper());
            CSVService<CSVLine> csvService = new CSVService<>();

            for(CSVLine line: csvLines){
                csvService.add(line);
            }
        }catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
