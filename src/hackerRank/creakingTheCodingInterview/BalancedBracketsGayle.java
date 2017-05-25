package hackerRank.creakingTheCodingInterview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by hnastevska on 5/1/2017.
 */
public class BalancedBracketsGayle {
    public static char[][] TOKENS = {{'(', ')'}, {'[', ']'}, {'{', '}'}};

    public static boolean isOpenTerm(char c) {
        for (char[] arr : TOKENS) {
            if (arr[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closeTerm) {
        for (char[] arr : TOKENS) {
            if (arr[0] == openTerm) {
                return arr[1] == closeTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
