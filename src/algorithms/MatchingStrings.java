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
public class MatchingStrings {

    /**
     * @param args the command line arguments
     */
    static int[] matchingStrings(String[] strings, String[] queries) {

        int ar[] = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            for (int j = 0; j < strings.length; j++) {

                if (strings[j] == queries[i]) {

                    ar[i] = ar[i] + 1;

                    System.out.println("ar[i] = " + ar[i]);
                }

            }

        }

        return ar;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String as[] = {"aba", "baba", "aba", "xzxb"};
        String aq[] = {"aba", "xzxb", "ab"};

        System.out.println("Count of repetitions = " + Arrays.toString(matchingStrings(as, aq)));
    }

}
