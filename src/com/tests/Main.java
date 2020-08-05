package com.tests;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Get the name of a class
        int[] a = {1, 2, 3};
        System.out.println("Array class" + a.getClass().getName());

        // Creating a two dimensional array
        int[][] td = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("it suppose to be 9, and we got: " + td[2][2]);

        // Checking if an array contains an element
        // 1. make a List from an array and use contains method
        // 2. perform a linear search on the array
        // 3.
        String[] s = {"String", "Not String"};
        System.out.println("is it true? :" + Arrays.asList(s).contains("String"));

        for(String ss : s){
            if (ss.equals("Not String")) {
                System.out.println("I have found it, its: " + ss);
            }
        }


    }
}
