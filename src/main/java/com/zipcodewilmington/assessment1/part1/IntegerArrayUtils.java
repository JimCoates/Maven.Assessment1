package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer answer = 0;

        for (int i = 0; i < intArray.length; i++) {
            answer += intArray[i];
        }
        return answer;
    }


    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer answer = 1;

        for (int i = 0; i < intArray.length ; i++) {
            answer = intArray[i] * answer;
        }
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
         Integer temp = getSum(intArray)/intArray.length;

         Double answer = new Double(temp);

        return answer;
    }
}
