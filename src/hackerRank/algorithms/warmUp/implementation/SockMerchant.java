package hackerRank.algorithms.warmUp.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/17/2017.
 */
public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int finalPairs=0;
        for (int i = 0; i < n; i++) {
            if (numbers.get(c[i])!= null){
                numbers.put(c[i], numbers.get(c[i])+1);
            }else{
                numbers.put(c[i], 1);
            }


        }
        Collection<Integer> keys = numbers.keySet();
        int tmp = 1;
        for (Integer key : keys) {
            Integer kk = numbers.get(key);
            if (kk >= 2){
                tmp = kk/2;
                finalPairs+=tmp;
            }
        }
        System.out.println(finalPairs);
    }



}
