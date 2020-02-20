import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader<T> {

    public <T> List<T> read(String filename, CSVMapper<T> csvMapper) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        ArrayList<T> lines = new ArrayList<T>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();
        return lines;
    }
}
