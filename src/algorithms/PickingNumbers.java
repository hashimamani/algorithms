/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author AMANI
 */
public class PickingNumbers {

    public static int count(List<Integer> a, int count, HashMap<String, Integer> pairs) {

        System.out.println("a = " + a.toString());

        List<Integer> b = new ArrayList<Integer>();

        int temp = 0;

        String pair = "";

        int j = a.size() - 1;

        if (a.size() < 2) {

            return count;
        }

        for (int i = 0; i < a.size() - 1; i++) {

            if (Math.abs(a.get(j) - a.get(i)) == 0 || Math.abs(a.get(j) - a.get(i)) == 1) {

                if (a.get(j) > a.get(i)) {

                    pair = a.get(i) + "" + a.get(j);

                } else {

                    pair = a.get(j) + "" + a.get(i);
                }

                if (!b.contains(a.get(i))) {

                    b.add(a.get(i));
                }

                if (!b.contains(a.get(i))) {

                    b.add(a.get(j));

                }

                if (!pairs.containsKey(pair)) {

                    pairs.put(pair, 1);

                    System.out.println("pairs = " + pairs.toString());

                } else {

                    pairs.put(pair, pairs.get(pair) + 1);

                    System.out.println("pairs = " + pairs.toString());
                }

                temp = pairs.get(pair);

            }

        }

        int i = 0;

        System.out.println("B = " + b.toString());

        System.out.println("A = " + a.toString());

        if (temp > count) {

            count = temp;

        }

        a.remove(j);

        return count;
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        HashMap<String, Integer> pairs = new HashMap<String, Integer>();

        int count = 0;

        return count(a, count, pairs);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add(1);
        a.add(2);

        System.out.println("Count = " + pickingNumbers(a));

    }

}
