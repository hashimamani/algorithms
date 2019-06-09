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
public class NextPalindromicNumber {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrom(int value) {

        int n = value;

        int reverse = 0, mod = 0;

        while (n > 0) {

            mod = n % 10;

            reverse = (reverse * 10) + mod;

            n = n / 10;

        }

        if (reverse == value) {

            return true;
        }

        return false;

    }

    public static int checkNextPalindrome(int num) {

        while (true) {

            num = num + 1;

            if (isPalindrom(num)) {

                return num;
            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int num = 123456;

//        System.out.println("is palindrome: " + isPalindrom(num));
        System.out.println("next palindrom: " + checkNextPalindrome(num));

    }

}
