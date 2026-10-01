public class PerfactNumber {

    public static boolean isPerfact(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }

        }

        return sum == num;
    }

    public static void main(String[] args) {

        int num = 6;
        if (isPerfact(num)) {
            System.out.println("Number is Perfact Number ");
        } else {
            System.out.println("Not a Perfact number");
        }
    }
}