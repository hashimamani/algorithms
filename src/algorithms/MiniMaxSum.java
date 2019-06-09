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
public class MiniMaxSum {

    /**
     * @param args the command line arguments
     */
    static void miniMaxSum(int[] arr) {

        int j = arr.length - 1;

        long min = arr[0];

        long max = arr[j];

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] > max) {

                max = arr[i];

            }

            if (arr[j] < min) {

                min = arr[j];
            }

            j--;

        }

        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};

        miniMaxSum(arr);
    }

}
