package app;

public class ReversNameApp {

    public static void main(String[] args) {
        String text = "maryam";

        System.out.println(reverse(text));
    }

    public static String reverse(String src) {
        StringBuilder sb = new StringBuilder();

        for (int i = src.length() - 1; i >= 0; i--) {
            sb.append(src.charAt(i));
        }

        return sb.toString();
    }
}