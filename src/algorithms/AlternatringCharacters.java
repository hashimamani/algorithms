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
public class AlternatringCharacters {

    /**
     * @param args the command line arguments
     */
    static int alternatingCharacters(String s) {

        int counter = 0;

        for (int i = 0, j = 1; i < s.length() && j < s.length(); i++, j++) {

            if (s.charAt(i) == s.charAt(j)) {

                counter++;
            }

        }

        return counter;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Number of deletions = " + alternatingCharacters("ABABABAB"));
    }

}
