// Tell if a string is a permutation of the other
// Permutation is like "dog" - "god", "abcd" - "abdc"

package com.stringPermutaion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String a = "dog";
        String b = "odg";
        String c = "dogg";
        String d = "abbbccccddd asdasdasasffgsfgsg";
        String e = "asffgsfgsg abbbccccdddasdasdas";
        System.out.println("True, IsPermutation: " + a + " and " + b + "? " + isPermutation(a, b));
        System.out.println("False, IsPermutation: " + a + " and " + c + "? " + isPermutation(a, c));
        System.out.println("True, IsPermutation: " + d + " and " + e + "? " + isPermutation(d, e));
    }

    // We need to sort the 2 string and assuming that white space is matters
    // Build a char array from string and sort them
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (sort(s1).equals(sort(s2))) {
            return true;
        }
        return false;
    }

    public static String sort(String s) {
        char[] stringCharArr = s.toCharArray();
        Arrays.sort(stringCharArr);
        return new String(stringCharArr);
    }

}
