package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/22/2017.
 */
public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int difCatA=0;
        int difCatB=0;
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            difCatA= Math.abs(x - z);
            difCatB= Math.abs(y - z);

            if (difCatA > difCatB){
                System.out.println("Cat B");
            }else if (difCatA < difCatB){
                System.out.println("Cat A");
            }else if (difCatA == difCatB){
                System.out.println("Mouse C");
            }

        }
    }
}
