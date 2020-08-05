package com.findLargestAndSmallest;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 123, 235, 346, 567};
        int[] arr2 = {-12, 0, 122, -2234, 3};
        System.out.println("it suppose to be 567! it is: " + findLargest(arr));
        System.out.println("it suppose to be 122! it is: " + findLargest(arr2));

        // find both
        System.out.println("Smallest suppose to be -2234, the result is: " + findLargestAndSmallest(arr2)[0]);
        // you need to enable assertion,with a VM option -ea flag
        assert(findLargestAndSmallest(arr2)[0] == -2234): "not good";
    }

    public static int findLargest(int[] a) {
        int largest = a[0];
        for (int num : a) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int[] findLargestAndSmallest(int[] a) {
        int largest = a[0];
        int smallest = a[0];
        for (int num : a) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return new int[]{smallest, largest};
    }
}
