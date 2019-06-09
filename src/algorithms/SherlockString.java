/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author AMANI
 */
public class SherlockString {

    /**
     * @param args the command line arguments
     */
    static String isValid(String s) {

        String sorted = sortString(s);

        List<Integer> list = new ArrayList<Integer>();

        int count = 0;

        int min = 0;
        int max = 0;

        System.out.println("sorted =" + sorted);

        list = frequencies(sorted, list);

        System.out.println("list = " + list);

        max = list.get(0);

        for (int i = 0, j = 1; i < list.size() && j < list.size(); i++, j++) {

            if (list.get(j) > list.get(i)) {

                max = list.get(j);
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < max) {

                if (max - list.get(i) > 1 && list.get(i) != 1) {

                    return "NO";
                }

                if (max - list.get(i) > 1 && list.get(i) == 1) {

                    count = count + 1;
                }

                if (max - list.get(i) == 1 && list.get(i) == 1) {

                    count = count + 1;
                }

            }

        }

        System.out.println("Max = " + max);
        System.out.println("count = " + count);

        if (count > 1) {

            return "NO";
        }

        return "YES";
    }

    public static String sortString(String inputString) {

        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public static List frequencies(String s, List<Integer> list) {

        if (s.length() < 1) {

            return list;
        }

        int count = 0;

        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(index)) {

                System.out.println("i =" + i);

                count = count + 1;
            } else {

                break;
            }

        }

        list.add(count);

        s = s.replace(s.charAt(index) + "", "");

        s = s.trim();

        System.out.println("s = " + s);

        return frequencies(s, list);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("isValid = " + isValid("xxxaabbccrry"));

    }

}
