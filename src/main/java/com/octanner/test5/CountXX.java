package com.octanner.test5;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class CountXX {
    int countXX(String str) {
        return go(str, 0);
    }

    int go(String str, int counter) {
        if (str.indexOf("xx") == -1) {
            return counter;
        }
        return go(str.substring(str.indexOf("xx") + 1, str.length()), counter + 1);
    }

}
