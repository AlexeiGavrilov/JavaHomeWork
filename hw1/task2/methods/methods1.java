package hw1.task2.methods;

public class methods1 {
    public static void outputPrimeNumbers(int n) {
        boolean a = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
                
            }
            if (a) System.out.println(i);
            else a = true;
        }

    }
}
