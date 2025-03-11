package com.agnes;

public class StringMethods {
    public static void main(String [] args) {
        String name = "Java";
        int length =name.length();
        System.out.println("The length of Java is " +length);

        String text = "Long Example Sentence" ;
        char letter = text.charAt(6);
        System.out.println("The index position of 6 is " + letter);

        String text1= "Even Long Example Sentence" ;
        int index = text1.indexOf("o");
        System.out.println("The index position of O is " + index);

}

}