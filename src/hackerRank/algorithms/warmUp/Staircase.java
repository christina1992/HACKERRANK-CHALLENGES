package hackerRank.algorithms.warmUp;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int k = i;
            int m = 0;
            while(k< n-1){
                System.out.print(" ");
                k++;
            }
            while (m <= i) {
                System.out.print("#");
                m++;
            }
            System.out.println();
        }
    }
}
