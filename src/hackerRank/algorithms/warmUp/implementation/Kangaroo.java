package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/12/2017.
 */
public class Kangaroo {

    static boolean calc(int x1,int v1, int x2, int v2)
    {
        int a = x1, b = x2;
        while((v1 > v2 && a < b) || (v2 > v1 && b < a) || (a==b))
        {
            if(a == b)
                return true;
            a += v1;
            b += v2;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean is = false;

        while(x1 <= 10000 && x2 <= 10000 ){

            is = calc(x1,v1,x2,v2);
            if (is){
                break;
            }
            x1 += v1;
            x2 += v2;

        }
        if (is) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
