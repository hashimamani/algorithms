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
public class MergeSortAlgorihm {

    public static void mergeSort(int[] arr, int len) {

        System.out.println("arr = " + Arrays.toString(arr));

        if (len < 2) {

            return;
        }

        int mid = len / 2;

        System.out.println("mid = " + mid);

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

        merge(left, right, mid, len - mid, arr);

    }

    public static void merge(int left[], int right[], int l, int r, int[] arr) {

        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {

            if (left[i] < right[j]) {

                arr[k] = left[i];

                i++;

            } else {

                arr[k] = right[j];

                j++;

            }

            k++;

        }

        while (i < l) {

            arr[k] = left[i];

            k++;
            i++;
        }

        while (j < r) {

            arr[k] = right[j];

            k++;
            j++;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {2, 5, 3, 1, 7, 9, 5, 4};

        mergeSort(arr, arr.length);

        System.out.println("sorted array = " + Arrays.toString(arr));
    }

}
