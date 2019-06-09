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
public class MathOperations {

    static int number2 = getValue();
    static int number1 = 10;

    static int getValue() {
        return number1;
    }

    static int doSum() {
        return number1 + number2;
    }

    static int doMinus() {
        return number1 - number2;
    }

    public static void main(String[] args) {

        System.out.println("Number1 + Number2 = " + doSum());

        System.out.println("Number1 - Number2 = " + doMinus());
    }
}
