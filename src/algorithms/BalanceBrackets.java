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
public class BalanceBrackets {

    static String isBalanced(String s) {

        String answer = "YES";

        while (s.length() > 0) {

            if (s.contains("()")) {

                s = s.replace("()", "");

            } else if (s.contains("[]")) {

                s = s.replace("[]", "");

            } else if (s.contains("{}")) {

                s = s.replace("{}", "");

            } else {
                break;
            }

        }

        s.trim();

        System.out.println("String = " + s);

        if (s.length() > 0) {

            answer = "NO";

        }

        return answer;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Is balanced: " + isBalanced("((())"));
    }

}
