public class NthFibonacci {

    public static long fibonacci(int n) {

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        long a = 0;
        long b = 1;

        for (int i = 3; i <= n; i++) {

            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            System.out.println(n + " = " + fibonacci(n));
        }
    }
} 