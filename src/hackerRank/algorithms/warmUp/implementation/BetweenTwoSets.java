package hackerRank.algorithms.warmUp.implementation;

import java.util.*;

/**
 * Created by hnastevska on 4/14/2017.
 */
public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        System.out.println(between(a, b));
    }

    static int between(int[] a, int[] b) {
        int output = 0;
        Arrays.sort(b);
        Arrays.sort(a);
        int bMin = b[0];

        int  aMax = a[a.length-1];

        for (int i = aMax; i <= bMin; i++) {
            int tempA = 0, tempB = 0;
            for (int arrayA_i= 0; arrayA_i< a.length; arrayA_i++) {
                if(i % a[arrayA_i] == 0)
                    tempA++;
            }
            for (int arrayB_i= 0; arrayB_i< b.length; arrayB_i++) {
                if(b[arrayB_i] % i == 0)
                    tempB++;
            }
            if(tempA == a.length && tempB == b.length)
                output++;
            tempA = 0;
            tempB = 0;
        }
        return output;
    }
}
