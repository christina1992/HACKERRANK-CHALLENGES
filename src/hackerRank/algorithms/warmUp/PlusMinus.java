package hackerRank.algorithms.warmUp;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double negatives=0;
        double positives = 0;
        double zeros = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] == 0){
                zeros++;
            }
            if (arr[arr_i] > 0){
                positives++;
            }
            if (arr[arr_i] < 0){
                negatives++;
            }
        }
        System.out.println(positives/(double) n);
        System.out.println(negatives/(double) n);
        System.out.println(zeros/(double) n);
    }
}
