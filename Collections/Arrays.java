package Collections;

// In Java, arrays are not considered part of the Java Collections Framework; 
// they are fundamental data structures with fixed sizes and homogeneous elements, 
// unlike Java collections that offer dynamic resizing, heterogeneous elements, 
// and built-in methods for manipulation.

public class Arrays {
    public static void main(String[] args) {
        //Array 
        String[] array = new String[3];
        //Ading elements to the array
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        //Iterate through the array
        System.out.println("Array: " );
        for (String element : array) {
            System.out.println(element);   
        }
        //Accessing and modifying elements in the array
        System.out.println("Element at index 1: "+array[1]);
        array[1]="D";
        //Removing an element from the array
        array[2]=null;
        //Checking if an element is present in the array
        boolean containsB=false;
        for (String element : array) {
            if (element!=null &&  element.equals("B")) {
                containsB=true;
                break;
            }
        }
        System.out.println("Contains B: "+containsB);
        //Getting the size of the array
        System.out.println("Size of the array: "+array.length);
    }
}
