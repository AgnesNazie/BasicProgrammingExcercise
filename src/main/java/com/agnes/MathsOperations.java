package com.agnes;

import java.util.Scanner;

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

        //exercise 12. Average of Three Numbers

        Scanner scanner = new Scanner(System.in);

        double number ;
        System.out.println("Enter the first number");
        number = scanner .nextDouble();
        double number2 ;
        System.out.println(" Enter the  second number");
        number2 = scanner.nextDouble();
        double number3;
        System.out.println("Enter the third number");
        number3 = scanner.nextDouble();
        double sum = number + number2 + number3;
        int count = 3;
        double average = sum / count ;

        System.out.println("The average of three number is " + average);

    }
}
