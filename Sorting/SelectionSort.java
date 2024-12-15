package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements at i and minIndex
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
