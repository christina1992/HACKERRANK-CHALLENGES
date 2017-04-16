package hackerRank.algorithms.warmUp;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max = 0;
        int candlesCanBeBlown = 0;
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
            if (max < height[height_i]) {
                max = height[height_i];
            }
        }
        for (int height_i = 0; height_i < n; height_i++) {
            if (max == height[height_i]) {
                candlesCanBeBlown++;
            }
        }
        System.out.println(candlesCanBeBlown);
    }
}
