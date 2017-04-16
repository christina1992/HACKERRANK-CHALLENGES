package hackerRank.algorithms.warmUp;

import java.util.Scanner;

/**
 * Created by hnastevska on 4/9/2017.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String[] str = time.split(":");
        char[] helper = str[2].toCharArray();
        char pORa = helper[helper.length - 2];
        helper[helper.length-1] = ' ';
        helper[helper.length-2] = ' ';

        str[2] = String.valueOf(helper);
        str[2] = str[2].replaceAll("\\s","");
        String first = String.valueOf(Integer.parseInt(str[0])+12);
        if (Integer.parseInt(str[0])== 12){
            if (pORa == 'P'){
                first = "12";
            }else if (pORa == 'A'){
               first = "00";
            }
        }else {
            if (pORa == 'P'){
                first = String.valueOf(Integer.parseInt(str[0])+12);
            }else if (pORa == 'A'){
                first = str[0];
            }
        }


        System.out.println(first+":"+str[1]+":"+str[2]);


    }
}
