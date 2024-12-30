package model ;

public class Book {

    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable =available;
    }

    //Constructor
    public Book(String id, String title, String author){
        this.id = id;
        this.title  = title;
        this.author = author;
        setAvailable(true);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book {id=" + id + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "}";
    }

    
    


}