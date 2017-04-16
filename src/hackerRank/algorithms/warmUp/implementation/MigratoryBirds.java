package hackerRank.algorithms.warmUp.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/16/2017.
 */
public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
        }
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        for (int i = 0; i < types.length; i++) {
            if (types[i] == 1) {
                c1++;

            }
            if (types[i] == 2) {
                c2++;
            }
            if (types[i] == 3) {
                c3++;
            }
            if (types[i] == 4) {
                c4++;
            }
            if (types[i] == 5) {
                c5++;
            }
        }
        Helper c1Helper = new Helper(c1, 1);
        Helper c2Helper = new Helper(c2, 2);
        Helper c3Helper = new Helper(c3, 3);
        Helper c4Helper = new Helper(c4, 4);
        Helper c5Helper = new Helper(c5, 5);

        List<Helper> birdsCounters = new ArrayList<>();
        birdsCounters.add(c1Helper);
        birdsCounters.add(c2Helper);
        birdsCounters.add(c3Helper);
        birdsCounters.add(c4Helper);
        birdsCounters.add(c5Helper);
        int max = 0;
        Helper object = null;
        for (int i = 0; i < birdsCounters.size(); i++) {
            if (max < birdsCounters.get(i).getMax()) {
                max = birdsCounters.get(i).getMax();
                object = birdsCounters.get(i);
            }
        }

        System.out.println(max + " " + object.getNumber());
    }

    static class Helper {
        int max;
        int number;

        Helper(int max, int number) {
            this.max = max;
            this.number = number;
        }

        public int getMax() {
            return max;
        }

        public int getNumber() {
            return number;
        }
    }
}
