package com.agnes;

public class StringMethods {
    public static void main(String[] args) {

        // exercise 1
        String name = "Java";
        int length = name.length();
        System.out.println("The length of Java is " + length);

        //exercise 2
        String text = "Long Example Sentence";
        char letter = text.charAt(6);
        System.out.println("The index position of 6 is " + letter);

        //exercise 3
        String text1 = "Even Long Example Sentence";
        int index = text1.indexOf("o");
        System.out.println("The index position of O is " + index);

        //exercise 4
        String text2 = "CAPS EQUALS SCREAMING";
        text2=text2.toLowerCase();
        System.out.println("Convert text to lowercase: " + text2);

        // convert back to uppercase
        String upperCase = text2.toUpperCase();
        System.out.println("Convert text back to uppercase: " + upperCase);

        //exercise 5




    }

}