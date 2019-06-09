/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author AMANI
 */
public class SockMerchant {

    /**
     * @param args the command line arguments
     */
    static int sockMerchant(int n, int[] ar) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < ar.length; i++) {

            list.add(ar[i]);

        }

        Collections.sort(list);

        System.out.println("list =" + list);

        int counter = 0;

        for (int i = 0, j = 1; i < list.size() && j < list.size(); i++, j++) {

            if (list.get(i) == list.get(j)) {

                counter = counter + 1;

                i++;
                j++;

            }

        }

        return counter;

    }

    // TODO code application logic here
    public static void main(String[] args) {

        int ar[] = {1, 1, 5};

        System.out.println("Number of pairs = " + sockMerchant(ar.length, ar));

    }

}
