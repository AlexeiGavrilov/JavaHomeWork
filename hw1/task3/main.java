//Реализовать простой калькулятор

package hw1.task3;

import java.util.Scanner;

import hw1.task3.methods.methods1;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: "); 
        String enter = scanner.next();
        int firstNumber = Integer.parseInt(enter);
        System.out.printf("Введите оператор: ");
        String operator = scanner.next();
        System.out.printf("Введите второе число: ");
        String enter2 = scanner.next();
        int secondNumber = Integer.parseInt(enter2);
        int result = methods1.chekOperator(operator, firstNumber, secondNumber);
        System.out.println(result);
        
    }

}
