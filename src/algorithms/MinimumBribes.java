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
public class MinimumBribes {

    static void minimumBribes(int[] q) {

        int counter = 0;

        int check = 1;

        while (check > 0) {

            check = 0;

            for (int i = 0, j = 1; i < q.length && j < q.length; i++, j++) {

                if (q[i] - (i + 1) > 2) {

                    System.out.println("Too chaotic");

                    return;
                }

                if (q[i] > q[j]) {

                    int temp = q[i];

                    q[i] = q[j];

                    q[j] = temp;

                    counter++;

                }

                if (q[i] != j) {

                    check++;
                }

            }

        }

        System.out.println(counter);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] y = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] z = {2, 1, 5, 3, 4};
        int[] b = {2, 1, 5, 3, 4};
        int[] x = {2, 1, 5, 3, 4};

        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};

        minimumBribes(z);

    }

}
