package hackerRank.algorithms.warmUp.implementation;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/10/2017.
 */
public class GradingStudents {

    static int solve(int grade) {

        if (grade < 38) {
            return grade;
        } else {
            int one = grade + 1;
            int two = grade + 2;
            if (one % 5 == 0) {
                return grade + 1;
            } else if (two % 5 == 0) {
                return grade + 2;
            } else {
                return grade;
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
            int result = solve(grades[grades_i]);
            System.out.println(result);
        }

    }
}
