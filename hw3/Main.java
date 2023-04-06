package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import hw3.task.Task1;
import hw3.task.Task2;
import hw3.task.Task3;

public class Main {
    public static void main(String[] args) {
        ///////////////first task///////////////////Реализовать алгоритм сортировки слиянием
        int[] array = new int[] { 1, 12, 3, 88, 16, 10, 1672,};
        Task1.printArray(array);
        System.out.println();
        if (array.length > 2) {
            array = Task1.mergeSort(array);
        }
        
        Task1.printArray(array);
        System.out.println();
        //////////////second task///////////////// Пусть дан произвольный список целых чисел, удалить из него чётные числа

        List <Integer> ourList = new ArrayList<>();
        Random random = new Random();
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        ourList.add(random.nextInt(17));
        System.out.println(ourList);
        Task2.evenNumbersDelet(ourList);
        System.out.println(ourList);
        System.out.println();


        //////////////////third task///////////////////////Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

        List <Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(17);
        listOfNumbers.add(12);
        listOfNumbers.add(4);
        listOfNumbers.add(9);
        System.out.println(listOfNumbers);
        System.out.println("Максимальное значение = " + Collections.max(listOfNumbers));
        System.out.println("Минимальное значение = " + Collections.min(listOfNumbers));
        Task3.average(listOfNumbers);

        






        
    }

}
