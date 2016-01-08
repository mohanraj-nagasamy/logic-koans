package com.octanner.test5;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * <p/>
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class StringSplosion {

    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i + 1));
        }
        return sb.toString();
    }

}
