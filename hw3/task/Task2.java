// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package hw3.task;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void evenNumbersDelet(List<Integer> ourList ) {
        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i) % 2 == 0 ){
                ourList.remove(ourList.get(i));
                i--;
            }
            
        }
        
        
    }
}
