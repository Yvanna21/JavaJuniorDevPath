// Stacks are data structures that follow the Last-In-First-Out (LIFO) principle, 
// where elements are inserted and removed from the top of the stack.
// They are commonly used for tasks like function call management, 
// expression evaluation, and undo mechanisms.

import java.util.Stack; 

public class Stacks {
    public static void main(String[] args) {
        //Create a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //Remove an element from the stack
        int topElement = stack.pop();
        System.out.println("Element removed from the stack: " + topElement);

        //Access the element at the to of the stack without removing it
        int peekElement=stack.peek();
        System.out.println("Element at the to of the stack: " + peekElement); 

        //Check if the stack is empty
        boolean isEmpty =stack.isEmpty();
        System.out.println("Stack is empty: " + isEmpty);
    }
}