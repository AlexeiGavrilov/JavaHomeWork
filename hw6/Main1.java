package hw6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;



public class Main {
    
   
    public static void main(String[] args) {

        Notebook n1 = new Notebook("Lenovo","Grey");
        Notebook n2 = new Notebook("Lenovo","Black");
        Notebook n3 = new Notebook("HP","Grey");
        Notebook n4 = new Notebook("Mac","White");
        Notebook n5 = new Notebook("MSI","Red");

        

        HashSet<Notebook> notebooks = new HashSet<Notebook>(Arrays.asList(n1,n2,n3,n4,n5));

        Scanner sc = new Scanner(System.in);
        boolean filter = true;
        while (filter) {
            System.out.println("Выбрать по цвету, введите - 1\n" +
                    "Выбрать по бренду, введите - 2\n" +
                    "Для выхода, введите - 0");
       
            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    filterColor(notebooks, sc);
                    break;
                // case "2":
                //     FilterBrand(notebooks, sc);
                //     break;
                case "0":
                    System.out.println("До новых встреч!");
                    filter = false;
                    break;
                default:
                    System.out.println("Введена неправильная операция");
                    System.out.println();
                    break;
            }
        }


    }

    public static void filterColor(HashSet<Laptop> notebooks, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Laptop note: notebooks){
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий цвет: ");
      
        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Отобрала подходящие модели по вашему запросу: ");
            System.out.println();
            for (Laptop note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого цвета. Попробуйте снова");
            filterColor(notebooks, scanner);
        }
        
    }


}