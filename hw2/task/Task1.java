//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package hw2.task;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task1 {

    public static void sotredArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }

            }

        }

    }

    public static void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);

        }

    }

    // 2. Дана строка json:
    // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    // {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    // {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    // Написать метод, который распарсит этот текст и, используя StringBuilder,
    // создаст строки вида:
    // Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
    // Студент Иванов получил 5 по предмету Математика.
    // Студент Петрова получил 4 по предмету Информатика.
    // Студент Краснов получил 5 по предмету Физика.
    public static String[] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size += 1;
        }
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;

    }

    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line5.split(",");
        String [] arrayName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(arrayName[i]);
            result.append(arrData[1]);
            }
        return result;






}
}
