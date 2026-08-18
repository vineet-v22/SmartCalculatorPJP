package com.savoira.pjp.biweekly2;

public class TypeDemo {

    public static void main(String[] args) {

        // Block 1
        // Predicted output:
        // 4
        // 1
        // 4.5

        int a = 9, b = 2;

        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);


        // Block 2
        // Predicted output:
        // true
        // false
        // true

        Integer x = 100;
        Integer y = 100;

        Integer p = 200;
        Integer q = 200;

        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));

        /*
         * Java caches Integer objects for commonly used values, including
         * values from -128 to 127. Therefore x and y can refer to the same
         * cached Integer object, so x == y is true.
         *
         * 200 is outside this guaranteed cache range, so p and q can refer
         * to different Integer objects. Therefore p == q is false.
         *
         * equals() compares the actual values, so p.equals(q) is true.
         */
    }
}