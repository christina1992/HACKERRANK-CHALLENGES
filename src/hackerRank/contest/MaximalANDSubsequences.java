package hackerRank.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/29/2017.
 */
public class MaximalANDSubsequences {
    static long[] solve(int n, int k, long[] a) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int m = k;
                {
                    if (m > 0) {
                        list.add(a[i] & a[j]);
                        m--;
                    }
                }
            }
        }
        long max = 0;
        long counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) == max){
                counter++;
            }
        }
        long [] arr = new long[2];
        arr[0] = max;
        arr[1] = counter % ((10*10*10*10*10*10*10*10*10)+7);
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextLong();
        }
        long[] result = solve(n, k, a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != n - 1 ? "\n" : ""));
        }
        System.out.println(" ");


    }
}
