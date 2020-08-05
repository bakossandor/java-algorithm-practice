// One edits: insert, remove, replace
// Determine if 2 strings are one edit away from each other
// abcd - abce --> true
// abcde - abc --> false

package com.oneEdit;

public class Main {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcda";
        String c = "abcd";
        String d = "abcdad";
        String e = "abdddd";
        System.out.println("True? " + isOneEdit(a, b));
        System.out.println("False? " + isOneEdit(a, c));
        System.out.println("False? " + isOneEdit(a, d));
        System.out.println("False? " + isOneEdit("mall", "mal"));
    }

    public static boolean isOneEdit(String a, String b) {
        if (a.equals(b)) {
            return false;
        } else if (Math.abs(a.length() - b.length()) > 1) {
            return false;
        }

        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();

        if (charArrA.length - charArrB.length < 0) {
            return reduced(charArrB, charArrA);
        } else if (charArrA.length - charArrB.length > 0) {
            return reduced(charArrA, charArrB);
        } else {
            return swap(charArrA, charArrB);
        }
    }

    public static boolean reduced(char[] longer, char[] shorter) {
        int s = 0;
        int diff = 0;
        for (int i = 0; i < longer.length - 1; i++, s++) {
            if (longer[i] != shorter[s]) {
                if (diff == 0) {
                    diff++;
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean swap(char[] a, char[] b) {
        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                diff++;
                if (diff > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
