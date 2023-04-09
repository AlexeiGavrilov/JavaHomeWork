package hw4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import hw4.task.Task1;

public class Main {

    /////////////////// first task//////////////////
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Normal list: " + list);
        System.out.println();
        //Collections.reverse(list);
        //System.out.println("Reverse list: " + list);
    

    //////////////////second task///////////////////////
        System.out.println("Normal list: " + list);
        Task1.enqueue(list, 10);
        System.out.println(list);
        Task1.dequeue(list);
        System.out.println(list);
        int result = Task1.first(list);
        System.out.println(result);
        System.out.println(list);


    }
}
