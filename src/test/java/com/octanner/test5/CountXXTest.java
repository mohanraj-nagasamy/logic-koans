package com.octanner.test5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 */
public class CountXXTest extends CountXX {

    @Test
    public void testCountXX() throws Exception {
        assertEquals(countXX("abcxx"), 1);
        assertEquals(countXX("xxx"), 2);
        assertEquals(countXX("xxxx"), 3);
        assertEquals(countXX("abc"), 0);
        assertEquals(countXX("Hello there"), 0);
        assertEquals(countXX("Hexxo thxxe"), 2);
        assertEquals(countXX(""), 0);
        assertEquals(countXX("Kittens"), 0);
        assertEquals(countXX("Kittensxxx"), 2);
    }
}