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
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static int binarySearch(int[] arr, int x) {

        return binarySearchRecurse(arr, x, 0, arr.length);

    }

    public static int binarySearchRecurse(int[] arr, int x, int begin, int end) {

        int mid = (begin + end) / 2;

        if (arr[mid] == x) {

            return mid;
        }

        if (end - begin > 1) {

            if (x > arr[mid]) {

                return binarySearchRecurse(arr, x, mid, end);

            } else {

                return binarySearchRecurse(arr, x, begin, mid);
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int arr[] = {1, 3, 2, 0};

        System.out.println("Binary search = " + binarySearch(arr, 2));
    }

}
