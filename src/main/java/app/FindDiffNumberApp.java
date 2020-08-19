package app;

import java.util.Arrays;

public class FindDiffNumberApp {

    private static final int[] A = {3, 5, 28, 6, 18};
    private static final int[] B = {3, 18, 31, 28, 6, 5};

    static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    static int subs(int a, int b) {
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        System.out.println(subs(sum(A), sum(B)));

    }
}
