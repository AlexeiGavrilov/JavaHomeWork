package hw5;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import hw5.task.RepetitionNameAndSorted;
import hw5.task.StructurePhoneBook;

public class Main {
    public static void main(String[] args) {
        /////////////////////// first task//////////////////////////
        HashMap<String, String> book = new HashMap<>();
        StructurePhoneBook.addNumber("Иванов", "+791523434", book);
        StructurePhoneBook.addNumber("Иванов", "+123", book);
        StructurePhoneBook.addNumber("Иванов", "+1789", book);
        StructurePhoneBook.addNumber("Петров", "+791523434", book);
        StructurePhoneBook.addNumber("Петров", "+700000099", book);
        StructurePhoneBook.addNumber("Сидоров", "+766666666", book);
        System.out.println(book);

        ///////////////////////// second task//////////////////////////////////
        HashMap<String, Integer> namePeople = new HashMap<>();
        TreeMap<Integer, String> sortedNamePeople = new TreeMap<>();

        String[] staff = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова",
                "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков",
                "Иван Ежов" };
        for (String person : staff) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
        Map<String, Integer> sortedName = namePeople.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedName.entrySet().forEach(System.out::println);

    }

}
