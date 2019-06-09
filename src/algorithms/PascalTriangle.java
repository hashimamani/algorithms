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
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static int[] nthRow(int row) {

        if (row == 0) {

            int result[] = {1};

            return result;
        }

        if (row == 1) {

            int result[] = {1, 1};

            return result;
        }

        int[] prev = {1, 1};

        for (int r = 2; r <= row; r++) {

            int next[] = new int[r + 1];

            next[0] = 1;

            for (int i = 1; i < r; i++) {

                next[i] = prev[i - 1] + prev[i];
            }

            next[r] = 1;

            prev = next;

        }

        return prev;

    }

    public static void printPascalSquare(int rows) {

        for (int i = 0; i < rows; i++) {

            System.out.println("Nth square = " + Arrays.toString(nthRow(i)));

        }
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("buffering");
        sb.replace(2, 7, "BUFFER");
        sb.delete(2, 4);
        String s = sb.substring(1, 5);
        System.out.println(s);

    }

}
