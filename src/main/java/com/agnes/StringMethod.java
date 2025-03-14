package com.agnes;

public class StringMethod {
    public static void main(String[] args) {

        // exercise 1. length of the string
        String name = "Java";
        int length = name.length();
        System.out.println("The length of Java is " + length);
        // The length of java is "4"
        System.out.println("==============================================");
        //exercise 1. index position of 6.
        String text = "Long Example Sentence";
        char letter = text.charAt(6);
        System.out.println("The index position of 6 is " + letter);
        // The charAt position of 6 is "x"
        System.out.println("=========================================");

        //exercise 2) index position of "o".
        String text1 = "Even Long Example Sentence";
        int index = text1.indexOf("o");
        System.out.println("The index position of O is " + index);
        // The index position of "o2 is "6".
        System.out.println("=====================================");

        //exercise 3) create a substring
        String paragraph = "ok this is not as long!";
        String extract = paragraph.substring(10, 22);
        System.out.println("The substring is: " + extract);
        //The substring output  is "not as long"
        System.out.println("========================================");
        //exercise 4
        String text2 = "CAPS EQUALS SCREAMING";
        text2 = text2.toLowerCase();
        System.out.println("Convert text to lowercase: " + text2);
        // the output is caps equals screaming.
        System.out.println("================================================");
        // convert back to uppercase
        String upperCase = text2.toUpperCase();
        System.out.println("Convert text back to uppercase: " + upperCase);
        // the output is CAPS EQUALS SCREAMING.
        System.out.println("====================================================");
        //exercise 5
        String word = "Java is the worst programming language!";
        word = word.replace("worst", "best");
        System.out.println(word);
        // The output is 2Java is the best programming language.
        System.out.println("==================================");
        //exercise 6
        String str = "\tj\ta\tv\ta\t";
        str = str.trim();
        System.out.println("The trim is " + str);
        // The trimmed output is "j a v a".
        System.out.println("============================================");
        //exercise 7
        int number = 20;
        String result = String.valueOf(number) + "20";
        System.out.println("The parse of the int is " + result);
        // the output is 2020.
        System.out.println("==========================================");

        //exercise 8 split method of string
        String texts = "oil and water ";
        String[] words = texts.split("and");
        for (String word1 : words) {
            System.out.println(word1);
        }
        System.out.println("=====================================");
        //exercise 9
        String names = "Carl, Susie, Fredrick, Bob, Erik";
        String[] nameArray = names.split(",");
        for (String name1 : nameArray) {
            System.out.println(name1);
        }
        System.out.println("========================================");
        // convert string to char
        String text3 = "ThisShouldBeConverted";
        char[] charArray = text3.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch);
        }
        System.out.println("========================================");
        //convert char to string and print it.

        char[] charArray1 = {'j', 'a', 'v', 'a'};
        String word2 = new String(charArray1);
        System.out.println(word2);
        // output is java
        System.out.println("==============================================");
    }

}