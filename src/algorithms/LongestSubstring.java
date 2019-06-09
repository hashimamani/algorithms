/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashSet;

/**
 *
 * @author AMANI
 */
public class LongestSubstring {

    /**
     * @param args the command line arguments
     */
    public static int lengthOfLongestSubstring(String s) {

        HashSet map = new HashSet();

        int len = 0;

        for (int i = 0, j = 0; i < s.length() && j < s.length();) {

            if (!map.contains(s.charAt(j))) {

                map.add(s.charAt(j++));

                len = Math.max(len, j - i);

            } else {

                map.remove(s.charAt(i++));
            }

        }

        return len;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Max len = " + lengthOfLongestSubstring("pwwkew"));

        System.out.println("Max len = " + lengthOfLongestSubstring("aaaabcaaa"));
    }

}
