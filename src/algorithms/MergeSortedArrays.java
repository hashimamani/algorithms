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
public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int arr[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                arr[k++] = arr1[i++];

            } else {

                arr[k++] = arr2[j++];

            }

        }

        while (i < arr1.length) {

            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {

            arr[k++] = arr2[j++];
        }

        return arr;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr1 = {1, 3, 4, 5};

        int[] arr2 = {2, 6, 7, 8};

        int arr[] = mergeArrays(arr1, arr2);

        System.out.println("Sorted arrays = " + Arrays.toString(arr));
    }

}
