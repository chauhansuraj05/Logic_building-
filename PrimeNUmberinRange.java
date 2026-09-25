public class PrimeNUmberinRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        for (int num = start; num <= end; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
