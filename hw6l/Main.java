import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("lenovo","grey");
        Notebook n2 = new Notebook("lenovo","black");
        Notebook n3 = new Notebook("hp","grey");
        Notebook n4 = new Notebook("mac","white");
        Notebook n5 = new Notebook("msi","red");

        

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
                case "2":
                    filterBrand(notebooks, sc);
                    break;
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

    public static void filterColor(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Notebook note: notebooks){
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("Введите интересующий цвет: ");
      
        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Отобрал подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого цвета. Попробуйте снова");
            filterColor(notebooks, scanner);
        
    }    
    }

    public static void filterBrand(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> brand = new TreeSet<>();
        for (Notebook note: notebooks){
            brand.add(note.getBrand());
        }
        System.out.println();
        System.out.println("Введите интересующий бренд: ");
      
        String oper = scanner.nextLine().toLowerCase();
        if (brand.contains(oper)) {
            System.out.println();
            System.out.println("Отобрал подходящие модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getBrand().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого бренда. Попробуйте снова");
            filterBrand(notebooks, scanner);
        
    }   
    }

}
