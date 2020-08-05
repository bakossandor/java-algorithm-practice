package com.removeDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Integer[] removeDuplicatesWithoutASet(Integer[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        tempArr.add(arr[0]);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                tempArr.add(arr[j]);
            }
            i++;
        }

        Integer[] returnArr = new Integer[tempArr.size()];
        return tempArr.toArray(returnArr);
    }

    public static Integer[] removeDuplicates(Integer[] arr) {
        Set<Integer> newHashSet = new HashSet<>(Arrays.asList(arr));
        Integer[] returnArray = new Integer[newHashSet.size()];
        return newHashSet.toArray(returnArray);
    }

    public static void main(String[] args) {
        Integer arrs[] = new Integer[]{11, 11, 24, 3424, 11, 24, 24, 55, 55, 1, 23};
        System.out.println(Arrays.toString(removeDuplicatesWithoutASet(arrs)));
    }
}
