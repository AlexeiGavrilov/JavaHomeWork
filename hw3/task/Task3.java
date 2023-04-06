/////////Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
package hw3.task;

import java.util.List;

public class Task3 {

    public static void average (List <Integer> ourList) {
        int sum =0;
        for (int i = 0; i < ourList.size(); i++) {
            sum += ourList.get(i); 
        }
        double result = (double)sum/ourList.size();
        System.out.println("Cреднее арифметическое значение = " + result);
        
}
}

    
