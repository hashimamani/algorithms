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
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void mergeSort(int[] arr, int len) {

        System.out.println("MergeSort" + Arrays.toString(arr));

        if (len < 2) {

            return;
        }

        int mid = len / 2;

        int[] left = new int[mid];

        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {

            left[i] = arr[i];

        }

        for (int i = mid; i < len; i++) {

            right[i - mid] = arr[i];
        }

        mergeSort(left, mid);

        mergeSort(right, len - mid);

        merge(arr, left, right, mid, len - mid);

    }

    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {

        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {

            if (left[i] < right[j]) {

                arr[k++] = left[i++];

            } else {

                arr[k++] = right[j++];
            }

        }

        while (i < l) {

            arr[k++] = left[i++];

        }

        while (j < r) {

            arr[k++] = right[j++];

        }

        System.out.println("Merge" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {11, 2, 6, 7, 8, 3, 89, 67, 1, 22, 27, 17, 16, 12, 8, 23};

        System.out.println("---------------------------------------");

        System.out.println("Usorted Array: " + Arrays.toString(arr));

        System.out.println("---------------------------------------");

        mergeSort(arr, arr.length);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("---------------------------------------");

    }

}
