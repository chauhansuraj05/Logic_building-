public class ArmstrongNumber {
    public static boolean isArmStrong(int num) {
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmStrong(num)) {
            System.out.println("Number is ArmStrong");
        } else {
            System.out.println("Number is Not ArmStrong");
        }
    }
}
