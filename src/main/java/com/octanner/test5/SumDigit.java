package com.octanner.test5;


public class SumDigit {
    public static void main(String[] args) {
        int count8 = 0;
        count8 = count8(8088);
        System.out.println("count8 = " + count8);
        count8 = count8(818);
        System.out.println("count8 = " + count8);
        count8 = count8(81238);
        System.out.println("count8 = " + count8);

//        System.out.println("isSame(8088) = " + isSame(8));
    }

    //    count8(8) → 1
    //    count8(818) → 2
    //    count8(8818) → 4
    public static int count8(int n) {
        return countInnerGo(n);
    }

    private static int countInnerGo(int n) {
        if (n <= 0) return 0;

        if ((n % 10) == 8) {
            return (isSame(n) ? 2 : 1) + countInnerGo(n / 10);
        }
        if ((n / 10) == 8) {
            return isSame(n) ? 2 : 1;
        }

        return countInnerGo(n / 10);
    }

    private static boolean isSame(int n) {
        int mod1 = n % 10;
        int div1 = n / 10;
        int mod2 = div1 % 10;
        return mod1 == mod2;
    }
}
