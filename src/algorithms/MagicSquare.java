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
public class MagicSquare {

    static int formingMagicSquare(int[][] s) {

        int sum = 0;

        int count = 0;

        int diagA = 0;

        int diagB = 0;

        int diff = 0;

        int magic_number = s.length * ((s.length * s.length) + 1) / 2;

        for (int i = 0, j = 0; i < s.length; i++, j++) {

            diagA = diagA + s[i][j];

            System.out.println("DiagA =" + diagA);

        }

        for (int i = 0, j = s.length - 1; i < s.length; i++, j--) {

            diagB = diagB + s[i][j];

            System.out.println("DiagB =" + diagB);

        }

        diff = Math.abs(magic_number * 2 - (diagA + diagB));

        for (int i = 0; i < s.length; i++) {

            for (int j = 0; j < s[i].length; j++) {

                count = count + s[i][j];

            }

            System.out.println("Count = " + count);

            sum = sum + (magic_number - count);

            count = 0;

        }

        sum = sum + diff;

        return sum;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] sqr = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};

        System.out.println("minimum sum = " + formingMagicSquare(sqr));
    }

}
