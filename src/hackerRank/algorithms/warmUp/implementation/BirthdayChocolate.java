package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/14/2017.
 */
public class BirthdayChocolate {
    static int getWays(int[] squares, int d, int m) {
        int variations = 0;
        int sum;
        for (int i = 0; i < squares.length; i++) {
            sum = 0;
            for (int j = i; j < m + i; j++) {
                if (m + i <= squares.length)
                    sum += squares[j];
            }
            if (sum == d) {
                variations++;
            }
        }
        return variations;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
