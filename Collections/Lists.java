package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

// The code provided below demonstrates the usage of different Java collection types (ArrayList, Vector, Stack, and LinkedList) in a program

public class Lists {

    public static void main(String[] args) {
        //ArrayList
        System.out.println("Implementing ArrayList in Java");
        System.out.println();

        List<String> arrayList = new ArrayList<>();
        //Adding elements to the ArrayList
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        //Iterating over the arrayList
        System.out.println("arrayList: " );
        for (String element : arrayList) {
            System.out.println(element);  
        }
        //Accessing and modifying elements in the ArrayList
        System.out.println("Element at index 1: " +arrayList.get(1));
        arrayList.set(1, "D");
        System.out.println("arrayList: "+arrayList);
        //Removing an element from the ArrayList
        arrayList.remove("C");
        //Checking if an element is present in the ArrayList
        System.out.println("Contains B: "+arrayList.contains("B"));
        //Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        System.out.println();

        //Vector
        System.out.println("Implementing Vector in Java");
        System.out.println();
        List<Integer> vector = new Vector<>();
        //Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        //Iterating over the Vector
        System.out.println("vector: " );
        for (Integer element : vector) {
            System.out.println(element);  
        }
        //Accessing and modifying elements in the Vector
        System.out.println("Element at index 1: " + vector.get(1));
        vector.set(1, 4);
        //Removing an element from the Vector
        vector.remove(2);
        //Checking if an element is present in the Vector
        System.out.println("Contains 3: "+vector.contains(3));
        //Getting the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());

        System.out.println();

        //Stack
        System.out.println("Implementing Stack in Java");
        Stack<String>stack = new Stack<>();
        //Adding elements to the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        //Iterating over the stack
        System.out.println("\nstack: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println();

        //Linked list
        System.out.println("Implementing LinkedList in Java");
        List<Integer> linkedList = new LinkedList<>();
        //Adding elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        //Iterating over the linked list
        System.out.println("\nlinkedList: ");
        for (Integer element : linkedList) {
            System.out.println(element);
        }
        //Conversion of the LinkedList to an array
        Integer[] array = linkedList.toArray(new Integer[linkedList.size()]);
        //sorting the linked list
        Collections.sort(linkedList);
        //Combining the LinkedList
        linkedList.addAll(Arrays.asList(40,50,60));
        //Displaying the size of the linked list after combining
        System.out.println("Size of linked list after combining: "+linkedList.size());
        for (Integer element : linkedList) {
            System.out.println(element);
        }

    }
}