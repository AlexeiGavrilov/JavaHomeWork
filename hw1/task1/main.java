//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package hw1.task1;

import java.util.Scanner;

import hw1.task1.methods.methods1;


public class main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Введите выше число для вычисления: ");
      String enter = scanner.next();
      int i = Integer.parseInt(enter);
      int a = methods1.calculatingNumber(i);
      System.out.println("Произведение вашего треугольного числа = " + a);

   }

}
