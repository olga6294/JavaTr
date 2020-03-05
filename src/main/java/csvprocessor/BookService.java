package csvprocessor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BookService {
    private final BookProvider bookProvider;
    private final BookSaver bookSaver;

    public BookService(BookProvider bookProvider, BookSaver bookSaver) {
        this.bookProvider = bookProvider;
        this.bookSaver = bookSaver;
    }

    public void process(String filename){
        Set<Book> noDuplicates = new HashSet<Book>(bookProvider.getBooks(filename));
        bookSaver.save(new ArrayList<Book>(noDuplicates));
    }
}
