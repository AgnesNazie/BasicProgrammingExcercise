package com.agnes;

public class StringMethods {
    public static void main(String[] args) {

        // exercise 1. length of the string
        String name = "Java";
        int length = name.length();
        System.out.println("The length of Java is " + length);

        //exercise 1. index position of 6.
        String text = "Long Example Sentence";
        char letter = text.charAt(6);
        System.out.println("The index position of 6 is " + letter);

        //exercise 2) index position of "o".
        String text1 = "Even Long Example Sentence";
        int index = text1.indexOf("o");
        System.out.println("The index position of O is " + index);

        //exercise 3) create a substring
        String paragraph = "ok this is not as long!";
        String extract = paragraph.substring(10,22);
        System.out.println("The substring is: " + extract);


        //exercise 4
        String text2 = "CAPS EQUALS SCREAMING";
        text2=text2.toLowerCase();
        System.out.println("Convert text to lowercase: " + text2);

        // convert back to uppercase
        String upperCase = text2.toUpperCase();
        System.out.println("Convert text back to uppercase: " + upperCase);

        //exercise 5
        String word = "Java is the worst programming language!";
        word=word.replace("worst", "best");
        System.out.println(word);



    }

}