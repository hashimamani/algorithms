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
public class RepeatingString {

    /**
     * @param args the command line arguments
     */
    static long repeatedString(String s, long n) {

//        if (s.length() < n) {
//
//            s = s + s;
//        } else {
//
//            s = s.substring(0, Integer.parseInt(String.valueOf(n)));
//
//            for (int i = 0; i < n; i++) {
//
//                if (s.charAt(i) == 'a') {
//
//                    count++;
//                }
//
//            }
//
//            return count;
//        }
        long count = 0;

        int len = s.length();

        long repeated = n / len;

        long remainder = n % len;

        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == 'a') {

                count++;
            }

        }

        count = count * repeated;

        for (int i = 0; i < remainder; i++) {

            if (s.charAt(i) == 'a') {

                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Count: " + repeatedString("aba", 10));

    }

}
