package Exceptions_in_java;



//Custom exception class for Invalid user
public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message){
        super(message);
    }
    
}