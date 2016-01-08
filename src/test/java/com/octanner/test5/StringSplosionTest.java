package com.octanner.test5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 * <p/>
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class StringSplosionTest extends StringSplosion {

    @Test
    public void testStringSplosion() throws Exception {
        assertEquals(stringSplosion("Code"), "CCoCodCode");
        assertEquals(stringSplosion("abc"), "aababc");
        assertEquals(stringSplosion("ab"), "aab");
        assertEquals(stringSplosion("x"), "x");
        assertEquals(stringSplosion("fade"), "fade");
        assertEquals(stringSplosion("There"), "TThTheTherThere");
        assertEquals(stringSplosion("Kitten"), "KKiKitKittKitteKitten");
        assertEquals(stringSplosion("Good"), "GGoGooGood");

    }
}