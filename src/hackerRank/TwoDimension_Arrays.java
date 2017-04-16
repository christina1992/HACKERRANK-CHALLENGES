package hackerRank;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class TwoDimension_Arrays {

    public static int returnSum(int i, int j, int[][] arr) {
        int sum = 0;
        sum = arr[i][j]+
                arr[i][j+1]+
                arr[i][j+2]+
                arr[i+1][j+1]+
                arr[i+2][j]+
                arr[i+2][j+1]+
                arr[i+2][j+2];
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int max = -6666;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int sum1 = returnSum(i, 0, arr);
            if (sum1 > max) {
                max = sum1;
            }
            int sum2 = returnSum(i, 1, arr);
            if (sum2 > max) {
                max = sum2;
            }
            int sum3 = returnSum(i, 2, arr);
            if (sum3 > max) {
                max = sum3;
            }
            int sum4 = returnSum(i, 3, arr);
            if (sum4 > max) {
                max = sum4;
            }

        }

        System.out.println(max);
    }
}
