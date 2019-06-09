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
public class FrrequencyQueries {

    /**
     * @param args the command line arguments
     */
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (List l : queries) {

            System.out.println("query = " + l.get(0));

            System.out.println("data = " + l.get(1));

            int query = (int) l.get(0);

            int data = (int) l.get(1);

            switch (query) {

                case 1:

                    if (map.containsKey(data)) {

                        map.put(data, map.get(data) + 1);

                    } else {

                        map.put(data, 1);
                    }

                    break;

                case 2:

                    if (map.containsKey(data)) {

                        map.put(data, map.get(data) - 1);

                    }

                    break;

                case 3:

                    System.out.println("Entered");

                    System.out.println("result size = " + list.size());

                    int sum = 0;

                    for (HashMap.Entry<Integer, Integer> m : map.entrySet()) {

                        if (m.getValue() == data) {

                            sum = sum + 1;

                            break;
                        }

                    }

                    result.add(sum);

                    System.out.println("result = " + result.toString());

                    break;

                default:
                    break;
            }

            System.out.println("Map = " + map.toString());

        }

        return result;

    }

    public static void main(String[] args) {

        ArrayList<List<Integer>> i = new ArrayList<List<Integer>>();

        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        List<Integer> z = new ArrayList<Integer>();
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> c = new ArrayList<Integer>();
        List<Integer> d = new ArrayList<Integer>();
        List<Integer> e = new ArrayList<Integer>();

        x.add(1);
        x.add(5);

        y.add(1);
        y.add(6);

        z.add(3);
        z.add(2);

        a.add(1);
        a.add(10);

        b.add(1);
        b.add(10);

        c.add(1);
        c.add(6);

        d.add(2);
        d.add(5);

        e.add(3);
        e.add(2);

        i.add(x);
        i.add(y);
        i.add(z);
        i.add(a);
        i.add(b);
        i.add(c);
        i.add(d);
        i.add(e);

        System.out.println("array = " + freqQuery(i).toString());

    }

}
