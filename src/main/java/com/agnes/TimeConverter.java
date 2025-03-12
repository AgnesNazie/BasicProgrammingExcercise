package com.agnes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class TimeConverter {
    public static void main (String []args) {
        //exercise 1
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // exercise format the current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formatterDate = today.format(formatter);
        System.out.println(formatterDate);
        //output "wednesday 12 March

        //exercise 3
        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);
        for (int i = 0; i <7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
        //exercise 4. parse a date from a string
        String dateString = "2025-03-11";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println(parsedDate);
        // output 2025-03-11

        //exercise 5 find the day of the week
        LocalDate birthday = LocalDate.of (1995,8,15);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println(birthday + " "  + dayOfWeek);

        //exercise 6
        LocalDate  futureDate =LocalDate.now().plusYears(10).minusMonths(10);
        Month month = futureDate.getMonth();
        System.out.println("Future date: "  + futureDate);
        System.out.println("Extracted month: "  + month);

    }
}
