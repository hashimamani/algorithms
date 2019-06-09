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
import java.math.BigDecimal;

interface Account {

    BigDecimal balance = new BigDecimal(0.00);
}

class SavingsAccount implements Account {

    public SavingsAccount(BigDecimal initialValue) {
//        balance = initialValue;
    }

    public String toString() {
        return balance.toString();
    }

    public static void main(String args[]) {
        SavingsAccount instance = new SavingsAccount(new BigDecimal(50.00));
        System.out.println(instance);
    }
}
