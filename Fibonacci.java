public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int a = 0, b = 1;
        for (int i = 0; i <= num; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
