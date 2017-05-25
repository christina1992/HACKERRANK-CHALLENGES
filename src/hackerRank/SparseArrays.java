package hackerRank;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class SparseArrays {
    static String[] missingWords(String s, String t) {
        String[] splitS = s.split(" ");
        String[] splitT = s.split(" ");
        String[] finalArray = new String[Math.abs(s.length() - t.length())];

        for (int j = 0; j < splitS.length; j++) {
            for (int i = 0; i < splitT.length; i++) {
                if (splitS[j] != splitT[i]) {
                    finalArray[j] = splitS[j];
                }
            }
        }
        return finalArray;
    }
    static int[] findMax(int N, int[] numbers) {

        int sum = Integer.MIN_VALUE;
        int s = 0;
        int[]  nums = new int[2];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                s = numbers[i]+numbers[j];
                if (sum < s){
                    sum = s;
                    if (i < j){
                        nums[0]= i;
                        nums[1]=j;
                    }else{
                        nums[0]= j;
                        nums[1]=i;
                    }

                }
            }

        }


        return nums;
    }
    public static void main(String[] args) throws IOException {
        int[]k={1,2,3,4,5};
        int[] kk = findMax(5, k);

        for (int i = 0; i < kk.length; i++) {
            System.out.println(kk[i]);
        }
    }

    }


