//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package hw2.task;
public class Task1 {

    public static void sotredArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }

            }
            
        }

    }
        
    public static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }

    }

}
