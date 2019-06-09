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
public class SpecialPalindrome {

    /**
     * @param args the command line arguments
     */
    public static long substrCount(int n, String s) {

        int k = 2;

        for (int i = 0; i < s.length() && k <= s.length(); i++) {

            n = n + countPalindrom(k, s);

            k++;

        }

        return n;

    }

    public static int countPalindrom(int partition, String s) {

        int count = 0;

        System.out.println("partition = " + partition);

        System.out.println("------------------------------------------------- ");

        while (s.length() >= partition) {

            String n = s.substring(0, partition);

            if (isPalindrome(n)) {

                count = count + 1;

            }

            System.out.println("count =" + count);

            s = s.replaceFirst(s.charAt(0) + "", "");

            s = s.trim();

        }

        return count;

    }

    public static boolean isPalindrome(String s) {

        if (s.length() == 2) {

            if (s.charAt(0) != s.charAt(1)) {

                return false;
            } else {

                return true;
            }

        }

        if (s.length() % 2 == 0) {

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != s.charAt(0)) {

                    return false;

                }

            }

            return true;
        }

        int mid = s.length() / 2;

        System.out.println("mid = " + mid);

        for (int l = mid - 1, r = mid + 1; l >= 0 && r < s.length(); l--, r++) {

            if (s.charAt(l) != s.charAt(r)) {

                System.out.println("check1");

                return false;
            }

            if (s.charAt(l) != s.charAt(0)) {

                System.out.println("check2");

                return false;
            }

            if (s.charAt(r) != s.charAt(0)) {

                System.out.println("check3");

                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("substrCount " + substrCount(4, "aaaayteyetytetyetyttertetretetyeteueueturuytututuitiiyuyuyyuyjhfjfhgfnbcncmvjfjfjnbvnbvncvvxbdh"));

    }

}
