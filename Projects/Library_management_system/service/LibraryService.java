package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Book;

public class LibraryService {
    private final List<Book> books; //Composition: The Library Service owns books
    //A constructor to initialize the Library
    public LibraryService(){
        books=new ArrayList<>();
    }
    //Add a new book to the Library
     public void addBook(String id, String title, String author){
        Book newBook=new Book(id, title, author);
        books.add(newBook);
        System.out.println("New book added to the library: " + newBook);
     }
     //Search for a book by title
     public Optional<Book> searchBookByTitle(String title){
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).findFirst();
     }
     //Borrow a book by ID 
     public boolean borrowBook(String bookId){
        Optional<Book> book = books.stream().filter(b -> b.getId().equals(bookId) && b.isAvailable()).findFirst();
        if (book.isPresent()) {
            book.get().setAvailable(false);
            System.out.println("Book borrowed: " + book.get());
            return true;
        }else{
            System.out.println("Book is not available or does not exist.");
            return false;
        }
     }
     //Return book by ID
     public boolean returnBook(String bookId){
        Optional<Book> book = books.stream().filter(b -> b.getId().equals(bookId) && !b.isAvailable()).findFirst();
        if (book.isPresent()) {
            book.get().setAvailable(true);
            System.out.println("Book returned: " + book.get());
            return true;
        }else{
            System.out.println("Book is not borrowed or does not exist");
            return false;
        }
     }
     //List all books in the library
     public void listAllBooks() {
        System.out.println("\n List of all books in the library: ");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }else{
            books.forEach(System.out::println);
        }
     }

}
