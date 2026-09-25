public class NthFibonacci2 {
    public static int fibonacci(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int num = 5;
        int result = fibonacci(num);
        System.out.println(" Nth Fibonacci :" + result);
    }
}
