package hackerRank.algorithms.warmUp;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class CompareTheTriplets {
    static String solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int alicePoints = 0;
        int bobPoints = 0;
        if (a0 > b0 || a1 > b1 || a2 > b2) {
            alicePoints++;
        }else if (a0< b0 || a1 < b1 || a2 < b2){
            bobPoints++;
        }
        return alicePoints + " "+ bobPoints;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        String result = solve(a0, a1, a2, b0, b1, b2);
        System.out.println(result);
    }
}
