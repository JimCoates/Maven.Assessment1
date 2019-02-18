package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input){

        Integer counter = 0;
        Integer i = 0;




        while( i < input.length()) {

            if (input.equals(BasicStringUtils.reverse(input))) {
                counter++;
                i++;
            } else {
                int k = 1%input.length();
                input = input.substring(k) + input.substring(0,k);
                i++;
                System.out.println(input);
            }
        }

        return counter;
    }
}
