/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author AMANI
 */
public class PlusMinus {

    /**
     * @param args the command line arguments
     *
     */
    static void plusMinus(int[] arr) {

        double positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] + Math.abs(arr[i]) == 0 && arr[i] < 0) {

                negative++;

            }

            if (arr[i] + Math.abs(arr[i]) > 0) {

                positive++;

            }

            if (arr[i] == 0) {

                zero++;
            }

        }

        positive = to6decimalPlaces(positive / arr.length);

        System.out.println(positive);

        negative = to6decimalPlaces(negative / arr.length);

        System.out.println(negative);

        zero = to6decimalPlaces(zero / arr.length);

        System.out.println(zero);

    }

    static double to6decimalPlaces(double value) {

        DecimalFormat df = new DecimalFormat("#.######");

        df.setRoundingMode(RoundingMode.HALF_UP);

        String formattedValue = df.format(value);

        return Double.valueOf(formattedValue);

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] arr = {1, 1, 0, -1, -1};

        plusMinus(arr);
    }

}
