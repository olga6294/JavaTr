import csvprocessor.BookProvider;
import csvprocessor.BookSaver;
import csvprocessor.BookService;

public class Bootstrap {
    public static void main(String[] args){
        BookProvider bookProvider = new BookProvider();
        BookSaver bookSaver = new BookSaver();

        BookService bookService = new BookService(bookProvider, bookSaver);
        bookService.process("src/resources/booklist.csv");
    }
}
