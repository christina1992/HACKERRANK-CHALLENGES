package hackerRank.contest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/28/2017.
 */
public class ZigzagArray {
    static int minimumDeletions(int[] a) {
        if (a.length == 3 && a[0] < a[1] && a[1] < a[2] || a.length == 3 && a[0] > a[1] && a[1] > a[2]) return 1;
        int counter = 0;
        for (int i = 0; i < a.length - 3; i++) {
            if (a[i] < a[i + 1] && a[i + 1] < a[i + 2]) {

                counter++;

            }
        }
        for (int i = 0; i < a.length - 3; i++) {
            if (a[i] > a[i + 1] && a[i + 1] > a[i + 2]) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
        System.out.println(1 % ((10*10*10*10*10*10*10*10*10)+7));
    }
}
