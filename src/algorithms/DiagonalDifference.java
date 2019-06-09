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
public class DiagonalDifference {

    /**
     * @param args the command line arguments
     */
    static int diagonalDifference(int[][] arr) {

        int diff = 0;

        int count = 0;

        int count2 = 0;

        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            count = count + arr[i][i];

            count2 = count2 + arr[i][j];

            j--;
        }

        diff = Math.abs(count - count2);

        return diff;

    }

    public static void main(String[] args) {

        int arr[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};

        // TODO code application logic here]
        System.out.println("The diagonal difference = " + diagonalDifference(arr));
    }

}
