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
public class NextPower2 {

    /**
     * @param args the command line arguments
     */
    public static int getNextPowerOfTwo(int value) {

        int i = value + 1;
        int j = value - 1;

        while (i > value) {

            if (isPowerOfTwo(i)) {

                return i;
            }

        }

        return 1;

    }

    public static boolean isPowerOfTwo(int value) {

        if (Math.log(value) % Math.log(2) != 0) {

            return false;

        }

        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("is power of two: " + Math.log(16));
    }

}
