package csvfile;

import csvprocessor.Book;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class FileWriter {
    public static void write(List<Book> books){
        try {
            File file = new File("src/output/file.txt");
            file.createNewFile();

            String csv = books
                    .stream()
                    .map(book -> book.getId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getFormat() + "," + book.getPrice())
                    .collect(joining("\n"));

            Files.write(Paths.get("src/output/file.txt"), csv.getBytes());
        }catch(IOException ioException){
            ioException.printStackTrace();
            throw new RuntimeException("Cannot write to file");
        }
    }
}
