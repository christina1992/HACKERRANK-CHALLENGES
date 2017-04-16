package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/16/2017.
 */
public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int sum = 0;
        int counter=0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < j){
                    sum = a[i]+a[j];
                    if (sum % k == 0){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
