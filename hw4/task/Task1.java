//Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

package hw4.task;

import java.util.LinkedList;

public class Task1 {
    public static void enqueue(LinkedList<Integer> list, int value) {
        list.addLast(value);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int value = list.get(0);
        list.remove(0);
        return value;
    }

    public static int first(LinkedList<Integer> list) {
        int value = list.get(0);
        return value;
    }

}
