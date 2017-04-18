package hackerRank.algorithms.warmUp.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/18/2017.
 */
public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();

        char[] c = s.toCharArray();
        int b=0,b1=0;
        for(int i=0;i<n;i++){
            if(c[i]=='U'){
                b1++;
                if(b1==0)
                    b++;
            }
            else{
                b1--;

            }
        }
        System.out.println(b);
    }

}

