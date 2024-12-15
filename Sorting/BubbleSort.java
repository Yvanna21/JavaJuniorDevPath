package Sorting;
// The bubble sort repeatedly iterates through the list, comparing adjacent elements and swapping them if they are in the wrong order.
// Compares adjacent elements, and swaps them if they are in the 1  wrong order. The pass through the list is repeated until no swaps are needed, indicating that the list is sorted. 
// The optimization using the swapped flag helps to terminate the algorithm early if the array becomes sorted before the maximum number of iterations.
// Bubble sort is not recommended for sorting large amounts of data.

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={64, 34,25,12,22,11,90};
        bubbleSort(array);
        System.out.print("Sorted array: " );
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] array){
        boolean swapped;
        int n=array.length-1;
        for (int i =n ; i > 0; i--) {
            swapped = false;
            for (int j = 0; j < i; j++){
                if (array[j]>array[j+1]) {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    swapped=true;
                }
            }
            //If no two elements were swapped by inner loop then break     
            if (!swapped) {
                break;   
            }
        }

    }
}
