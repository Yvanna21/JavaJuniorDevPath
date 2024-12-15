package Exceptions_in_java;

//Library class to hold books and users
public class Library {
    public void borrowBook(String bookTitle, String user) throws Exception {
        //Check if the book is available
        boolean isBookAvailable =false;
        if (!isBookAvailable) {
            throw new BookUnavailableException("The book' "+bookTitle+"' is not available for borroiwing.");
        }

        //check if the user is eligible to borrow
        if (user==null || user.isEmpty()) {
            throw new InvalidUserException("Invalid user. Please provide a valid user.");
        }

        //Manually throw a general Exception for demonstration 
        throw new Exception("A general exception occurred.");
    }
}
