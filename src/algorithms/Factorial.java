/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.function.Function;

/**
 *
 * @author AMANI
 */
public class Factorial {

    private static final Function<Long, Long> CACHED = Memoize.memoize(Factorial::uncached);

    public static long factorial(long n) {

        return CACHED.apply(n);
    }

    private static long uncached(long n) {
        long result = n;
        long m = n - 1;
        while (m > 1) {
            result = result * m;
            m -= 1;
        }
        return result;
    }
}
