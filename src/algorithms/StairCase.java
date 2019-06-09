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
public class StairCase {

    /**
     * @param args the command line arguments
     */
    static void staircase(int n) {

        String space = " ";

        String repeated = "";

        String hash = "#";

        n = n + 1;

        int j = n - 1;

        for (int i = 0; i < n - 1; i++) {

            System.out.println(repeated(space, j - 1) + repeated(hash, i + 1));

            j--;

        }

    }

    static String repeated(String str, int n) {

        String repeated = "";

        for (int i = 0; i < n; i++) {

            repeated += str;

        }

        return repeated;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        staircase(7);
    }

}
