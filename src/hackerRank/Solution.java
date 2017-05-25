package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(in.nextInt());
        }
        int tallest = heights.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        if (k < tallest) {
            System.out.println(tallest - k);
        } else {
            System.out.println(0);
        }
    }
}