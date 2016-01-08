package com.octanner.test1;

import java.util.ArrayList;
import java.util.List;

/**/public class TriangleImpl implements Triangle {
    /**
     * Three segments of lengths A, B, C form a triangle iff
     * <p/>
     * A + B > C
     * B + C > A
     * A + C > B
     * <p/>
     * e.g.
     * 6, 4, 5 can form a triangle
     * 10, 2, 7 can't
     * <p/>
     * Given a list of segments lengths algorithm should find at least one triplet of segments that form a triangle (if any).
     * <p/>
     * Method should return an array of either:
     * - 3 elements: segments that form a triangle (i.e. satisfy the condition above)
     * - empty array if there are no such segments
     */
    public Integer[] getTriangleSides(Integer[] segments) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < segments.length - 1; i++) {
            int a = segments[i];
            int b = segments[i + 1];

            for (int j = (i + 2); j < (segments.length); j++) {
                int c = segments[j];

                if (isTriangle(a, b, c)) {
                    list.add(a);
                    list.add(b);
                    list.add(c);
                }
            }
        }


//        for (int i = 0; i < segments.length; i++) {
//            for (int j = (i + 1); j < (segments.length - 2); j++) {
//                for (int k = (j + 1); k < (segments.length - 1); k++) {
//                    int a = segments[i];
//                    int b = segments[j];
//                    int c = segments[k];
//
//                    if (isTriangle(a, b, c)) {
//                        list.add(a);
//                        list.add(b);
//                        list.add(c);
//                    }
//                }
//            }
//        }

        System.out.println("list = " + list);
        return list.toArray(new Integer[list.size()]);
    }

    private static boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (b + c > a) && (a + c > b));
    }
}
