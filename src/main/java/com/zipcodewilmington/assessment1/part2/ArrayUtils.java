package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                count++;
            }
        }

        return count;
    }

    /**
     * @param inputArray    an array of any type of Object
     * @param valueToRemove a value to be removed from the `inputArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `inputArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] inputArray, Integer valueToRemove) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(inputArray));

        while (arrayList.contains(valueToRemove)) {

            arrayList.remove(Integer.valueOf(valueToRemove));
        }

        Integer[] answer = arrayList.toArray(new Integer[arrayList.size()]);
        return answer;
    }

    /**
     * @param inputArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object common = objectArray[0];
        int commonCount = getNumberOfOccurrences(objectArray,common);

        for(Object currentObject : objectArray) {
            int currentCount = getNumberOfOccurrences(objectArray,currentObject);
            if (currentCount > commonCount){
                common = currentObject;
                commonCount = currentCount;
            }
        }

        return common;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object common = objectArray[0];
        int commonCount = getNumberOfOccurrences(objectArray,common);

        for(Object currentObject : objectArray) {
            int currentCount = getNumberOfOccurrences(objectArray,currentObject);
            if (currentCount < commonCount){
                common = currentObject;
                commonCount = currentCount;
            }
        }

        return common;
    }

    /**
     * @param array1 an array of any type of Object
     * @param array2 an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] array1, Integer[] array2) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));

        for (int i = 0; i < array2.length; i++) {
            list1.add(array2[i]);
        }
        Integer[] answer = list1.toArray(new Integer[list1.size()]);
        return answer;

    }
}
