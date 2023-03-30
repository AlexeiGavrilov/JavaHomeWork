package hw1.task2;

import java.util.Scanner;

import hw1.task2.methods.methods1;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите положительное число: ");
        String enter = scanner.next();
        int i = Integer.parseInt(enter);
        methods1.outputPrimeNumbers(i);
    }
}
