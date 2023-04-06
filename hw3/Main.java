package hw3;

import hw3.task.Task1;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 12, 3, 5, 16, 76, 1672, 0};
        if (array.length > 2) {
            array = Task1.mergeSort(array);
        }
        
        Task1.printArray(array);
        
    }

}
