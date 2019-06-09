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
public class MinimumSwaps {

    /**
     * @param args the command line arguments
     */
    static int minimumSwaps(int[] arr) {

        int counter = 0;

        for (int i = 0, j = 1; i < arr.length && j < arr.length;) {

            if (arr[i] != j) {

                int temp = arr[i];

                arr[i] = arr[temp - 1];

                arr[temp - 1] = temp;

                counter++;

            } else {
                i++;
                j++;
            }

        }

        return counter;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {2, 1, 5, 3, 4};

        System.out.println("Minimum swaps = " + minimumSwaps(arr));

    }

}
