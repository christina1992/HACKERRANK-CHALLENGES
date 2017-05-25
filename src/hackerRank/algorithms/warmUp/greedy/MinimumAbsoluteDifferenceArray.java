package hackerRank.algorithms.warmUp.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/23/2017.
 */
public class MinimumAbsoluteDifferenceArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return;
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();

        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (min > Math.abs(a[i] - a[i + 1])) min = Math.abs(a[i] - a[i + 1]);
        }
        System.out.println(min);
    }
}
