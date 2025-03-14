package com.agnes;

public class MathsOperations {
    public static void main ( String [] args) {
        // exercise 9. expression evaluation

        System.out.println("============================");
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

        // exercise 10 computation

        double input = 4.0;
        input = input * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(input);
        System.out.println("=========================");
        //exercise 11. Circle: Area and Perimeter
        double radius = 7.5;
        double perimeters = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The Perimeters is " + perimeters);
        System.out.println("The area is " + area);


    }
}
