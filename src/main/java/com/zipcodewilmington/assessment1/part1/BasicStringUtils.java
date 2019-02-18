package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1) ;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String answer = "";

        for(int i = str.length() - 1; i >=0; i--) {
            answer += str.charAt(i);
        }
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reverse = reverse(str);
        String answer = camelCase(reverse);

        return answer;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder temp = new StringBuilder(str);

        temp.deleteCharAt(0);
        temp.deleteCharAt(str.length()-2);

        String answer = temp.toString();


        return answer;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] temp = str.toCharArray();



        for (int i = 0; i < temp.length; i++) {

            char letter = temp[i];

            if(Character.isUpperCase(letter)){
                temp[i] = Character.toLowerCase(letter);
            } else {
                temp[i] = Character.toUpperCase(letter);
            }
        }

        String answer = new String(temp);

        return answer;
    }
}
