package hackerRank.creakingTheCodingInterview;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by hnastevska on 5/1/2017.
 */
public class BalancedBrackets {
    private static boolean isOpenBracket(char chr) {
        return (chr == '(' || chr == '{' || chr == '[');
    }

    private static Character getClosingBracket(Character chr) {
        switch (chr) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return 'N';

        }
    }

    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        Character head;
        for (char bracket : expression.toCharArray()) {
            if (isOpenBracket(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                head = stack.peek();
                if (getClosingBracket(head) == bracket) {
                    stack.pop();
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
