public class PalindromeString {
    public static String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "mam";
        String reverse = rev(str);

        if (str.equals(reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
