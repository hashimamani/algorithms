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
public class MarkAndToys {

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

    static int maximumToys(int[] prices, int k) {

        int counter = 0;

        int sum = 0;

        Arrays.sort(prices);

        int i = 0;

        while (sum < k) {

            sum = sum + prices[i];

            System.out.println("Prices[i] = " + prices[i]);

            System.out.println("sum = " + sum);

            System.out.println("counter = " + counter);

            counter++;

            i++;

        }

        return counter - 1;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] prices = {3, 7, 2, 9, 4};

        System.out.println("Maximum toys = " + maximumToys(prices, 15));

    }

}
