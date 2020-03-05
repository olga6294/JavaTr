package csvprocessor;

import csvfile.FileWriter;
import java.util.List;

public class BookSaver {

    public void save(List<Book> books){
        FileWriter.write(books);
    }
}
