package hackerRank;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class LeftArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[(i + n + k) % n] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
