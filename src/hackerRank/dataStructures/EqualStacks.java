package hackerRank.dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by hnastevska on 5/3/2017.
 */
public class EqualStacks {
    public static int sum1 = 0;
    public static int sum2 = 0;
    public static int sum3 = 0;
    public static int min = Integer.MAX_VALUE;
    public static int minStack = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for (int h1_i = 0; h1_i < n1; h1_i++) {
            h1[h1_i] = in.nextInt();
            sum1 += h1[h1_i];
        }
        int h2[] = new int[n2];
        for (int h2_i = 0; h2_i < n2; h2_i++) {
            h2[h2_i] = in.nextInt();
            sum2 += h2[h2_i];
        }
        int h3[] = new int[n3];
        for (int h3_i = 0; h3_i < n3; h3_i++) {
            h3[h3_i] = in.nextInt();
            sum3 += h3[h3_i];
        }

        Deque<Integer> stack1 = makeStack(h1);
        Deque<Integer> stack2 = makeStack(h2);
        Deque<Integer> stack3 = makeStack(h3);

        while (sum1 != sum2 && sum2 != sum3 ) {
            findMin(sum1, sum2, sum3);
            removeElementFromStack(stack1, 1);
            removeElementFromStack(stack2, 2);
            removeElementFromStack(stack3, 3);

        }
        System.out.println(sum1);
    }

    private static void findMin(int sum1, int sum2, int sum3) {
        if (sum1 < min) {
            min = sum1;
            minStack = 1;
        }
        if (sum2 < min) {
            min = sum2;
            minStack = 2;
        }
        if (sum3 < min) {
            min = sum3;
            minStack = 3;
        }
    }

    public static Deque<Integer> makeStack(int[] array) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = array.length - 1; i >= 0; --i) {
            stack.push(array[i]);
        }
        return stack;
    }

    private static void removeElementFromStack(Deque<Integer> stack, int stackNumber) {
        int numToBeRemovedFromSum;
        if (!stack.isEmpty()) {
            if (stackNumber == 1 && stackNumber != minStack) {
                numToBeRemovedFromSum = stack.pop();
                sum1 -= numToBeRemovedFromSum;
            } else if (stackNumber == 2 && stackNumber != minStack) {
                numToBeRemovedFromSum = stack.pop();
                sum2 -= numToBeRemovedFromSum;
            } else if (stackNumber == 3 && stackNumber != minStack) {
                numToBeRemovedFromSum = stack.pop();
                sum3 -= numToBeRemovedFromSum;
            }
        }
    }

}

