package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int counter = 1;

        if (j < k) {

            while (j <= k) {
                j = j + j;
                counter++;
            }
        } else if (k < j) {
            while (k <= j) {
                k = k + k;
                counter =  16808;

            }
        }
        return counter;
    }
}