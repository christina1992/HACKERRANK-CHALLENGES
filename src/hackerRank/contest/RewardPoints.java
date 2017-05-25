package hackerRank.contest;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/28/2017.
 */
public class RewardPoints {
    static int getPoints(int month1, int month2, int month3) {
        int sumMonth1, sumMonth2, sumMonth3, sum = 0;
        if (month1 >= 0 && month1 <= 50 && month2 >= 0 && month2 <= 50 && month3 >= 0 && month3 <= 50) {
            sumMonth1 = month1 * 10;
            sumMonth2 = month2 * 10;
            sumMonth3 = month3 * 10;
            if (sumMonth1 > 100) {
                sumMonth1 = 100;
            }
            if (sumMonth2 > 100) {
                sumMonth2 = 100;
            }
            if (sumMonth3 > 100) {
                sumMonth3 = 100;
            }
            sum = sumMonth1 + sumMonth2 + sumMonth3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        int pointsEarned = getPoints(month1, month2, month3);
        System.out.println(pointsEarned);
    }
}
