//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package hw5.task;

import java.util.HashMap;
import java.util.Map;

public class StructurePhoneBook {

public static void addNumber (String key, String value, HashMap<String, String> book ) {
    if (book.containsKey(key)){
        book.put(key, value + ", " + book.get(key));
    }
    else{
        book.put(key, value);
    }
 }
    
}
