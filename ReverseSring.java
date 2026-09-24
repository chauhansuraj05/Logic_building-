public class ReverseSring {

    public static String rev(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        String str = "hello";

        String result = rev(str);

        System.out.println(result);
    }
}