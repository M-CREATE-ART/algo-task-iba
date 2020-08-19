package app;

import java.util.Scanner;

public class PrintApp {

    static String print(String s1, String s2, String s3) {
        return !s1.equals("") ? s1 : !s2.equals("") ? s2 : !s3.equals("") ?
                s3.substring(s3.length() - 3) : "Nothing to print";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println(print(s1, s2, s3));
    }
}
