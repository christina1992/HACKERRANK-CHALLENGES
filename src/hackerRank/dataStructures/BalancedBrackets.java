package hackerRank.dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by hnastevska on 5/3/2017.
 */
public class BalancedBrackets {

    static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isOpenTerm(Character c) {
        for (char[] tokens : TOKENS) {
            if (tokens[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static char getOpenTerm(char closedTerm) {
        for (char[] tokens : TOKENS) {
            if (tokens[1] == closedTerm) {
                return tokens[0];
            }
        }
        return ' ';
    }

    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if (last == getOpenTerm(c)){
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
