package hackerRank.dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by hnastevska on 5/2/2017.
 */
public class MaximumElementStack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        Deque<Integer> maxValues = new ArrayDeque<>();

        while (queries > 0) {
            int index = in.nextInt();
            if (index == 1) {
                int item = in.nextInt();
                if (!maxValues.isEmpty()) {
                    if (item < maxValues.peek()) {
                        item = maxValues.peek();
                    }
                }
                maxValues.push(item);
            } else if (index == 2) {
                maxValues.pop();

            } else if (index == 3) {

                System.out.println(maxValues.peek());
            }
            queries--;
        }



        in.close();
    }
}
