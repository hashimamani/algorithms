/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author AMANI
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void maxMin(int[] arr) {

        int[] arr2 = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {

            arr2[i] = arr[j];

            i++;

        }

        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {

            arr2[j] = arr[i];

            j++;

        }

        arr = arr2;

        System.out.println("arr = " + Arrays.toString(arr));

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        maxMin(arr);
    }

}
