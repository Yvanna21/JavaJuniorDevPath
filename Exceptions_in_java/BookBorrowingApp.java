package Exceptions_in_java;

import java.io.IOException;

public class BookBorrowingApp {
    public static void main(String[] args) {
        Library library=new Library();
        try {
            //Emulating book borrowing
            library.borrowBook("Java Programming", "Alice");

        } catch (BookUnavailableException e) {
            System.out.println("Error: "+e.getMessage());   // Checked Exception
        }catch (InvalidUserException e) {
            System.out.println("Error: "+e.getMessage()); // Unchecked Exception
        }catch (IOException e) {
            System.out.println("IO Error: "+e.getMessage()); // checked Exception
        }catch (Exception e) {
            System.out.println("General Exception: "+e.getMessage());   //Catch-all for all other exceptions
        }
    }
}
