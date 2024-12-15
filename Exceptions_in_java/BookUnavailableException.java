package Exceptions_in_java;


// Custom exception class for unavailable books in a library (checked exception)

public class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}