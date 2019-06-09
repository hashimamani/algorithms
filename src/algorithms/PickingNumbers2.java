/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author AMANI
 */
public class PickingNumbers2 {

    /**
     * @param args the command line arguments
     */
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        System.out.println("a = " + a.toString());

        int temp = 0;

        int index = 0;

        int max = 0;

        Collections.sort(a);

        Set<Integer> set = new HashSet<>();

        for (Integer t : a) {

            set.add(t);
        }

        System.out.println("Set = " + set.toString());

        for (int i = index; i < a.size(); i++) {

            for (int k = 0; k < set.size(); k++) {

                int diff = Math.abs(set.iterator().next() - a.get(i));

                System.out.println("diff = " + diff);

                if (diff <= 1) {

//                    System.out.println("temp =" + temp);
                    temp++;
                }

            }
            if (temp > max) {

                System.out.println("max = " + max);

                max = temp;

            }

            temp = 0;

        }

        System.out.println("max = " + max);

        System.out.println("a = " + a.toString());

        return max;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

//        list.add(7);
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
        System.out.println("Max array count = " + pickingNumbers(list));
    }

}
