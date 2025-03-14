package com.agnes;

import java.util.Scanner;

import static java.util.Scanner.*;

public class ArithmeticOperations {
    public static void main(String[] args) {
        //sum of two numbers 74,36
        int number = 74;
        int number1 = 36;
        double sum = number + number1;
        // print the result
        System.out.println("The sum is " + sum);
        System.out.println("========================================");
        //division of two numbers 50, 3

        double num = 50;
        double num1 = 3;
        double result = num / num1;
        System.out.println(" The division: " + result);

        System.out.println("===============================================");
        // exercise 4 arithmetic operations
        double a = -5 + 8 * 6;
        double b = (55 + 9) % 9;
        double c = 20 + -3 * 5 / 8;
        double d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(" The Result is " + a);
        System.out.println(" The Result is " + b);
        System.out.println(" The Result is " + c);
        System.out.println(" The Result is " + d);
        System.out.println("==================================");
        // exercise 5
        int firstNumber = 25;
        int secondNumber = 5;
        int product = firstNumber * secondNumber;
        System.out.println("The product: " + product);

        // exercise 6 basic arithmetic operations
        System.out.println("========================");
        int x = 125;
        int y = 24;
        int add = x + y;
        int subtract = x - y;
        int multiple = x * y;
        double divide = x / y;
        double remainder = x % y;
        System.out.println("The sum is : " + add);
        System.out.println("The subtraction  is : " + subtract);
        System.out.println("The mul is : " + multiple);
        System.out.println("The div is : " + divide);
        System.out.println("The mod is : " + remainder);

        // exercise 7
        System.out.println("=========================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numb = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(numb + " x " + (i + 1) + " = " + (numb * (i + 1)));
        }
        scanner.close();

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