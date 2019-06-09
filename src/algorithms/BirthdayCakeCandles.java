/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author AMANI
 */
public class BirthdayCakeCandles {

    /**
     * @param args the command line arguments
     */
    static int birthdayCakeCandles(int[] ar) {

        int count = 0;

        int max = ar[0];

        int temp = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == max) {

                count++;

            }

            if (ar[i] > max) {

                temp = ar[i];

                max = ar[i];

            }

        }

        return count;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] ar = {3, 2, 1, 3, 3, 3, 1, 1, 2, 1, 1, 1, 1};

        System.out.println("birthdayCakeCandles = " + birthdayCakeCandles(ar));

    }

}
