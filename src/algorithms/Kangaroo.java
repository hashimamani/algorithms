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
public class Kangaroo {

    /**
     * @param args the command line arguments
     */
    static String kangaroo(int x1, int v1, int x2, int v2) {

        if (x1 > x2 && v1 > v2) {

            return "NO";
        }

        if (x2 > x1 && v2 > v1) {

            return "NO";
        }

        while (x1 < x2) {

            x1 = x1 + v1;
            x2 = x2 + v2;

            if (x1 == x2) {

                return "YES";

            }

        }

        return "NO";

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Kangaroo = " + kangaroo(21, 6, 47, 3));
    }

}
