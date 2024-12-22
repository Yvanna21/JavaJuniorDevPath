// Queues, on the other hand, adhere to the First-In-First-Out (FIFO) principle, 
// where elements are added at the rear and removed from the front. 
// They are useful for scenarios such as task scheduling, breadth-first search algorithms, 
// and print queue management.

import java.util.LinkedList;
import java.util.Queue;

public class Queus {
    public static void main(String[] args) {
         //Create a queue
    Queue<Integer> queue = new LinkedList<>();

    //Add elements to the queue
    queue.add(10);
    queue.add(20);
    queue.add(30);

    //Remove an element from the queue  (FIFO)
    int frontElement = queue.remove();
    System.out.println("Element removed from queue: " + frontElement);
    
    //Access element on the front of the queue without removing it
    int peekElement = queue.peek();
    System.out.println("Element at the from of the queue: "+peekElement);
    //Check if the queue is empty
    boolean isEmpty=queue.isEmpty();
    System.out.println("Queue is empty: "+isEmpty);
    }
   
}
