public class PalindromeNumber {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String args[]) {
        int n = 121;
        int result = reverse(n);
        if (n == result) {
            System.out.println("Palindrome number ");
        } else {
            System.out.println("NOt a Palindrome NUmber");
        }
    }
}
