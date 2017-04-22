package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/17/2017.
 */
public class DrawingBook {

    static int solve(int n, int p){
        int fromFront = p/2;
        int fromBack = 0;
        if (n == p){
            return 0;
        } else {
            if (n%2 == 0){
                fromBack = (n-p)/2;
            } else {
                if (p%2 == 0){
                    fromBack = ((n-p-1)/2);
                } else {
                    fromBack = ((n-p-1)/2) + 1;
                }
            }

            if (fromFront <= fromBack){
                return fromFront;
            } else {
                return fromBack;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
