package hackerRank.algorithms.warmUp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] numbers = new long[5];
        for (int i = 0 ; i < 5; i++) {
            numbers[i] = in.nextLong();
        }

        long max = numbers[0];
        long min = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        for (int i = 0; i < 5; i++) {
            long sum = numbers[i] + numbers[(i + 5 +1) % 5]+numbers[(i + 5 +2) % 5]
                    +numbers[(i + 5 +3 )% 5];
            if (max < sum){
                max = sum;
            }
            if (min > sum){
                min = sum;
            }
        }
        System.out.println(min +" "+max);
    }
    
    
}
