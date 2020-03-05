package csvfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public static List<String> read(String filename){
        try {
            return Files.readAllLines(Paths.get(filename));
        }catch(IOException ioException){
            ioException.printStackTrace();
            throw new RuntimeException("Cannot open file: "+filename);
        }
    }
}
