package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hnastevska on 4/8/2017.
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> queriesOne = new ArrayList<>();
        List<String> queriesTwo = new ArrayList<>();
        List<Integer> occurrences = new ArrayList<>();

        int counter = 0;
        int num1 = in.nextInt();
        in.nextLine();
        for (int i = 0; i < num1; i++) {
            queriesOne.add(in.nextLine());
        }
        int num2 = in.nextInt();
        in.nextLine();
        for (int i = 0; i < num2; i++) {
            queriesTwo.add(in.nextLine());
        }


        for (String word : queriesTwo) {
            for (String word2 : queriesOne) {
                if (word2.equals(word)) {
                    counter++;
                }
            }

            occurrences.add(counter);
            counter = 0;
        }

        occurrences.stream().forEach(s -> System.out.println(s));

    }
}
