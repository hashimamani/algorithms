/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.BFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author AMANI
 */
public class BFSTraversal {

    /**
     * @param args the command line arguments
     */
    private int V;

    private static LinkedList<Integer> adj[];

    public BFSTraversal(int v) {

        this.V = v;

        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {

            adj[i] = new LinkedList();

        }

    }

    public static void addEdge(int u, int v) {

        adj[u].add(v);
    }

    public static void BFS(int s) {

        HashMap<Integer, Integer> level = new HashMap<Integer, Integer>();

        HashMap<Integer, Integer> parent = new HashMap<Integer, Integer>();

        ArrayList<Integer> frontier = new ArrayList<Integer>();

        level.put(s, 0);

        parent.put(s, null);

        int i = 1;

        frontier.add(s);

        while (!frontier.isEmpty()) {

            System.out.println("level = " + level.toString());

            System.out.println("parent = " + parent.toString());

            ArrayList<Integer> next = new ArrayList<Integer>();

            for (int u : frontier) {

                System.out.println("s =" + u);

                for (int v : adj[u]) {

                    if (!level.containsKey(v)) {

                        level.put(v, i);

                        parent.put(v, u);

                        next.add(v);
                    }

                }
            }

            frontier = next;

            i++;

        }

    }

    public static void DFSVisit(int s, HashMap<Integer, Integer> parent) {

        System.out.println("parent = " + parent.toString());

        System.out.println("s= " + s);

        for (int v : adj[s]) {

            if (!parent.containsKey(v)) {

                parent.put(v, s);

                DFSVisit(v, parent);

            }

        }

    }

    public static void DFS(int v) {

        HashMap<Integer, Integer> parent = new HashMap<Integer, Integer>();

        parent.put(v, null);

        DFSVisit(v, parent);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        BFSTraversal g = new BFSTraversal(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        DFS(2);
    }

}
