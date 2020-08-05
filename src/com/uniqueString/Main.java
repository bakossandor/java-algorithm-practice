// Implement an algorithm to determine if a string has all unique characters
// What if you cannot use other datastructures

package com.uniqueString;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("unique have to be false and its: " + unique("unique"));
        System.out.println("abcd have to be true and its: " + unique("abcd"));

        System.out.println("unique have to be false and its: " + uniqueWithoutAnotherDataStruct("unique"));
        System.out.println("abcd have to be true and its: " + uniqueWithoutAnotherDataStruct("abcd"));
    }

    public static boolean unique(String s) {
        Set<Character> map = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (!map.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean uniqueWithoutAnotherDataStruct(String s) {
       for (int i = 0; i < s.length(); i++) {
           for (int j = i; j < s.length(); j++) {
               if (s.charAt(j) == s.charAt(i)) {
                   return false;
               }
           }
       }
       return true;
    }

}
