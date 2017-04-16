package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/14/2017.
 */
public class BreakingTheRecords {
    static int[] getRecord(int[] s) {
        int min = s[0];
        int max = s[0];
        int maxCounter = 0;
        int minCount = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] > max) {
                maxCounter++;
                max = s[i];
            }
            if (s[i] < min) {
                minCount++;
                min = s[i];
            }
        }
        int[] result = {maxCounter, minCount};
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}