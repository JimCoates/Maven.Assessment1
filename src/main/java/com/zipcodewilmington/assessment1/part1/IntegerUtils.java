package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer answer = 0;

        for (int i = 0; i <= n; i++) {
            answer += i;

        }
        return answer;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer answer = 1;

        for (int i = 1; i <= n ; i++) {
            answer = answer * i;
        }

        return answer;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String temp = val.toString();
        String tempstring = "";

        for (int i = temp.length()-1; i >= 0 ; i--) {
            tempstring += temp.charAt(i);
        }

        Integer answer = Integer.valueOf(tempstring);

        return answer;
    }
}
