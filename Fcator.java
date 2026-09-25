public class Fcator {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("Factor number of " + num + " are :");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
