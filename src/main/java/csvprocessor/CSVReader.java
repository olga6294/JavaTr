package csvprocessor;

import csvprocessor.CSVLine;
import csvprocessor.CSVMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader<T> {

    public static List<CSVLine> read(List<String> lines, CSVMapper csvMapper){
        List<CSVLine> lineObjects = csvMapper.cvsMap(lines);
        return lineObjects;
    }

    public static List<String> read(String filename) throws FileNotFoundException, IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = null;
        List<String> lines = new ArrayList<String>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines;
    }
}
