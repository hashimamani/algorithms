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
public class LambdaExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AddNumbers add = (int x, int y) -> x + y;

        AddNumbers add2 = new AddNumbers() {
            @Override
            public int sum(int x, int y) {
                return x + y;
            }
        };

        System.out.println("sum = " + add.sum(4, 5));

    }

    public interface AddNumbers {

        int sum(int x, int y);

    }

}
