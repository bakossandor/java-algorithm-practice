// Find and return a duplicates in an array of numbers
package com.findDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Integer[] findDuplicates(Integer[] arg) {
        Set<Integer> numbersSet = new HashSet<Integer>();
        Set<Integer> returnSet = new HashSet<Integer>();
        for (Integer num : arg) {
            if (!numbersSet.add(num)) {
                returnSet.add(num);
            }
        }
        Integer[] returnArr = new Integer[returnSet.size()];
        returnArr = returnSet.toArray(returnArr);
        return returnArr;
    }

    public static void main(String[] args) {
        Integer[] duplicated = new Integer[]{1, 1, 3, 4, 5, 2, 3, 4, 4, 4, 10, 10, 34, 12, 12, 2, 9};
        System.out.println(Arrays.toString(findDuplicates(duplicated)));
    }
}
