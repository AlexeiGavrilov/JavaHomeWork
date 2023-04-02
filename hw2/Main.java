package hw2;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;

import hw2.task.Log;
import hw2.task.Task1;


public class Main {
    
    private static final java.util.logging.Logger LOG = Log.log(Main.class.getName());
    public static void main(String[] args) {
        int [] array = {0, 4, 2, 5, 3, 17, 8};
        LOG.info("Исходный массив: " + Arrays.toString(array));
        Task1.sotredArray(array);
        LOG.info("Отсортированный массив: " + Arrays.toString(array));
        Task1.printArray(array);
    }
    
}
