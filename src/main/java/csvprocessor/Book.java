package csvprocessor;

public class Book {

    private int id;
    private String title;
    private String author;
    private String format;
    private double price;

    public Book(int id, String title, String author, String format, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.format = format;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object){
        if(!(this instanceof Book))
            return false;
        if(this.id == ((Book)object).id)
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return id;
    }
}
