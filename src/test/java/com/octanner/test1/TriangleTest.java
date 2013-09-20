package com.octanner.test1;

import com.octanner.test1.Triangle;
import com.octanner.test1.TriangleImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TriangleTest {
    public void testGetTriangleSides() throws Exception {
        //e.g. [4, 6, 80, 5, 129] would return an array that contains [6, 4, 5]
        //e.g. [10, 2, 7] would return []
        Triangle triangle = new TriangleImpl();

        Integer[] expected = new Integer[]{6, 4, 5};
        Integer[] result = triangle.getTriangleSides(new Integer[]{4, 6, 80, 5, 129});
        Assert.assertEqualsNoOrder(result, expected);

        result = triangle.getTriangleSides(new Integer[]{10, 2, 7});
        Assert.assertEqualsNoOrder(result, new Integer[]{});

    }
}
