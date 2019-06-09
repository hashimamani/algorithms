/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;

/**
 *
 * @author AMANI
 */
public class CountTheIslands {

    /**
     * @param args the command line arguments
     */
    public static int countIslands(int[][] ar) {

        int count = 0;

        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < ar[i].length; j++) {

                if (ar[i][j] == 1) {

                    str.add("" + i + j);

                }
            }

        }

        return traverse(ar, str, 0, count);

    }

    public static int traverse(int[][] ar, ArrayList<String> str, int j, int count) {

        int next[] = {0, 1};

        int vertical[] = {1, 0};

        int backward_diagonal[] = {1, -1};

        int diagonal[] = {1, 1};

        for (int i = j; i < str.size(); i++) {

            int len = str.get(i).length() / 2;

            int left = Integer.parseInt(str.get(i).substring(0, len));

            int right = Integer.parseInt(str.get(i).substring(len));

            System.out.println("left = " + left);

            System.out.println("right = " + right);

            System.out.println("----------------------");

            if (str.contains(left + "" + (right + next[1]))) {

                System.out.println(left + "" + (right + next[1]));

                j = str.indexOf(left + "" + (right + next[1]));

                System.out.println("J = " + j);

            }
        }

        System.out.println("str = " + str.toString());

        return traverse(ar, str, j, count);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[][] ar = {{1, 1, 0, 0, 0}, {0, 1, 0, 0, 1}, {1, 0, 0, 1, 1}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}};

        countIslands(ar);
    }

}
