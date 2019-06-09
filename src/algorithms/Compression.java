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
public class Compression {

    /**
     * @param args the command line arguments
     */
    public static String compress(String x) {

        String compressed = "";

        int i = 0;

        Character init = x.charAt(i);

        return recurseCompression(i, compressed, init, x);

    }

    public static String recurseCompression(int i, String compressed, Character curr, String x) {

        int counter = 0;

        while (i < x.length()) {

            if (x.charAt(i) == curr) {

                counter++;

                compressed = x.charAt(i) + "" + counter;

                i++;

            } else {

                return compressed + recurseCompression(i, compressed, x.charAt(i), x);
            }

        }

        return compressed;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Compressed string = " + compress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbcdeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"));
    }

}
