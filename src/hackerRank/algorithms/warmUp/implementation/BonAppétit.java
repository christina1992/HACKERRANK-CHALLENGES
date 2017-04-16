package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/16/2017.
 */
public class BonAppétit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = in.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = in.nextInt();
        }
        int paiedSum = in.nextInt();
        int ingrCost = 0;
        int totalSum = 0;
        int realSum = 0;
        int realPart = 0;
        int result = 0;

        for (int i = 0; i < costs.length; i++) {
            totalSum += costs[i];
            if (index == i) {
                ingrCost = costs[i];
            }
        }
        realSum = totalSum - ingrCost;
        realPart = realSum / 2;
        result = paiedSum - realPart;
        if (result == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(result);
        }

    }
}
