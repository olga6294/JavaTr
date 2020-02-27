package csvio;

import csvprocessor.CSVLine;
import csvprocessor.CSVMapper;
import csvprocessor.CSVReader;
import csvprocessor.CSVService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class CSVMain {

    public static void main(String[] args){

        try {
            List<String> lines = CSVReader.read("src/resources/TestFile.csv");
            List<CSVLine> csvLines = CSVReader.read(lines, new CSVMapper());
            CSVService<CSVLine> csvService = new CSVService<>();

            for(CSVLine line: csvLines){
                csvService.add(line);
            }

            HashSet<CSVLine> hashSetLines = csvService.getHashSet();
            System.out.println(hashSetLines);
        }catch(FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }
}
