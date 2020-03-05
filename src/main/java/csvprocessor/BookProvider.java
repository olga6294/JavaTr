package csvprocessor;

import csvfile.FileReader;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookProvider {

    private final int ID_INDEX = 0;
    private final int TITLE_INDEX = 1;
    private final int AUTHOR_INDEX = 2;
    private final int FORMAT_INDEX = 3;
    private final int PRICE_INDEX = 4;

     public List<Book> getBooks(String filename){
         try{
            return FileReader.read(filename)
                .stream()
                .map(line -> new Book(Integer.parseInt(line.split(",")[ID_INDEX]), line.split(",")[TITLE_INDEX], line.split(",")[AUTHOR_INDEX], line.split(",")[FORMAT_INDEX], Double.parseDouble(line.split(",")[PRICE_INDEX])))
                .collect(Collectors.toList());
         }catch(NumberFormatException numberFormatException){
             numberFormatException.printStackTrace();
             throw new RuntimeException();
         }
     }
}
