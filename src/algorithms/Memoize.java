/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 *
 * @author AMANI
 */
public class Memoize {

    /**
     * @param args the command line arguments
     */
    public static <I, O> Function<I, O> memoize(Function<I, O> f) {

        Map<I, O> lookup = new HashMap<>();

        return input -> lookup.computeIfAbsent(input, f);
    }

    static Function<Long, Boolean> isPrime = x -> {

        if (x == 2) {

            return true;
        }

        if (x == 0 || x == 1) {

            return false;
        } else {

            for (int i = 2; i < x; i++) {

                if (x % i == 0) {

                    return false;

                }
            }
        }

        return true;
    };

    public static void main(String[] args) {
        // TODO code application logic here

        Function<Long, Boolean> memoizedFunction = memoize(isPrime);

        System.out.println("is prime " + memoizedFunction.apply(23L));
    }

}
