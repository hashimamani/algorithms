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
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String palindrome) {

        int len = palindrome.length();

        int forward = 0;

        int backward = len - 1;

        while (backward > forward) {

            char forwardChar = palindrome.charAt(forward++);

            char backwardChar = palindrome.charAt(backward--);

            if (forwardChar != backwardChar) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        boolean check = isPalindrome("bobbob");

        System.out.println("isPalindrome : " + check);

    }

}
