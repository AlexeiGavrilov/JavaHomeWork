package hw1.task3.methods;

public class methods1 {
    public static int chekOperator(String i, int a, int b) {
        int result = 0;
        if (i.equals("+")) {
            result = a + b;
            
        }
        if (i.equals("-")) {
            result = a - b;
           
        }
        if (i.equals("*")) {
             result =  a * b;
            
        }
        if (i.equals("/")) {
             result =  a / b;
            
        }
        return result;

    }
}
