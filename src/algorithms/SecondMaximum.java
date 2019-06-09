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
public class SecondMaximum {

    /**
     * @param args the command line arguments
     */
    public static int findSecondMaximum(int[] arr) {

        int max = 0;

        int second_max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                second_max = max;

                max = arr[i];

            } else if (arr[i] > second_max) {

                second_max = arr[i];

            }

        }
        return second_max;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        int arr[] = {9, 2, 3, 6, 89};

        System.out.println("second max is =" + findSecondMaximum(arr));

    }

}
