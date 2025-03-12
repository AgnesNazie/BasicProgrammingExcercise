package com.agnes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TimeConverter {
    public static void main(String[] args) {
        //exercise 1
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // exercise format the current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formatterDate = today.format(formatter);
        System.out.println(formatterDate);
        //output "wednesday 12 March"

        //exercise 3
        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
        //exercise 4. parse a date from a string
        String dateString = "2025-03-11";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println(parsedDate);
        // output 2025-03-11

        //exercise 5 find the day of the week
        LocalDate birthday = LocalDate.of(1995, 8, 15);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println(birthday + " " + dayOfWeek);

        //exercise 6
        LocalDate futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        Month month = futureDate.getMonth();
        System.out.println("Future date: " + futureDate);
        System.out.println("Extracted month: " + month);

        //exercise 7
        LocalDate birthDate = LocalDate.of(1995, 8, 15);
        LocalDate futureDate1 = LocalDate.now().plusYears(10).minusMonths(10);
        Period period = Period.between(birthDate, futureDate1);
        System.out.println("Elapsed time: " + period.getYears() + " years, " + period.getMonths() + " months," + period.getDays() + " days");

        // exercise 8
        Period period1 = Period.of(4, 7, 29);
        LocalDate futureDate2 = today.plus(period1);
        System.out.println("New date after period: " + futureDate2);

        //exercise 9
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //exercise 10 Extract Nanoseconds
        int nanoseconds = currentTime.getNano();
        System.out.println("Nanoseconds: " + nanoseconds);

        //exercise 11 parse a localtime from a string
        String timeString = "10:59:15";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println(parsedTime);

        //exercise 12 format current time
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter1);
        System.out.println(formattedTime);

        //exercise 13 create a localDateTime
        LocalDateTime dateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        System.out.println(dateTime);

        //exercise 14 format LocalDateTime
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("eeee d MMMM hh:mm");
        String formattedDate = dateTime.format(formatter2);
        System.out.println(formattedDate);

        //exercise 15 combine local date and local time
        LocalDate date = LocalDate.of(2018, 4, 5);
        LocalTime time = LocalTime.of(10, 0);
        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        System.out.println(dateTime1);

        //exercise 16extract local date and time form local datetime.
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);

    }
}
