package csvio;

import csvprocessor.CSVLine;
import csvprocessor.CSVMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader<T> {

    public static <T> List<T> read(String filename, CSVMapper<T> csvMapper) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        ArrayList<String> lines = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return csvMapper.cvsMap(lines);
    }
}
