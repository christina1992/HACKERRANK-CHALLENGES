package hackerRank.algorithms.warmUp.strings;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/10/2017.
 */
public class CamelCaseWordCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter=0;
        char[] bla = s.toCharArray();
        if (bla != null){
            counter++;
        }
        for (int i = 0; i < bla.length; i++) {
            if (Character.isUpperCase(bla[i])){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
