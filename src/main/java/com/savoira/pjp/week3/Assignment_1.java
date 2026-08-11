package org.example;

public class Assignment_1 {

    void integerDivision() {

        // Block 1: integer division
        int a = 17, b = 5;

        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);
    }

    void integerCache() {

        // Block 2: Integer cache
        Integer x = 127;
        Integer y = 127;

        Integer p = 200;
        Integer q = 200;

        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));

        /** 127 is inside the Integer cache range, while 200 is not,
         so x == y is true but p == q is false.
         == checks for the object to be equal and .equals() check for the value to be equal

         Since StringBuilder is mutable so inside the loop for string concatenation it will not
         create the new strings but String will create the new strings which will take lot of memory
         **/
    }

    public static void main(String[] args) {

        Assignment_1 assignment = new Assignment_1();

        assignment.integerDivision();

        assignment.integerCache();
    }
}