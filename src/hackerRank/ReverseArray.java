package hackerRank;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[(n - 1 - arr_i) % n] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
