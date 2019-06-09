/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author AMANI
 */
public class LinkedListQuizes {

    /**
     * @param args the command line arguments
     *
     */
    public static void findMid(LinkedList<Integer> list) {

        int head = list.get(0);

        int counter = 0;

        for (int i = 0; i < list.size(); i++) {

            if (i % 2 != 0) {

                counter = counter + 1;

            }
        }

        head = list.get(counter);

        System.out.println("value at middle of list = " + head);

    }

    public static void sum(LinkedList<Integer> list, int num) {

    }

    public static void deleteElementsOfSum0(LinkedList<Integer> list) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++) {

            int diff = 0 - list.get(i);

            if (map.containsKey(diff + "")) {

                list.remove(i);

                list.remove(map.get(diff + "") - 1);
            } else {

                map.put(list.get(i) + "", i + 1);
            }

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);

        list.add(-6);
        list.add(7);
        list.add(-7);
        list.add(2);
        list.add(3);

        list.add(6);

        list.add(4);
        list.add(5);

        System.out.println("list = " + list);

        deleteElementsOfSum0(list);

        System.out.println("list = " + list.toString());

    }

}
