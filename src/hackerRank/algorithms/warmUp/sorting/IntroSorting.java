package hackerRank.algorithms.warmUp.sorting;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class IntroSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int element = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        int position = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == element) {
                position = i;
            }
        }
        System.out.println(position);
    }
}
