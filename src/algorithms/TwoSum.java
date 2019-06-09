/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author AMANI
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static int[] twoSum(int[] nums, int target) {

        int result[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = nums.length - 1; i >= 0; i--) {

            if (map.containsKey(target - nums[i])) {

                result[0] = i;

                result[1] = map.get(target - nums[i]);

                return result;
            }

            map.put(nums[i], i);

        }

        return result;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[] nums = {0, 4, 3, 0};

        System.out.println("Two sum = " + Arrays.toString(twoSum(nums, 0)));
    }

}
