package com.agnes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TimeConverter {

    public static void main(String[] args) {
        //exercise 1
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // exercise format the current date
        System.out.println("=====================================");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM");
        String formatterDate = today.format(formatter);
        System.out.println(formatterDate);
        //output "wednesday 12 March"
        System.out.println("=====================================");
        //exercise 3
        LocalDate lastMonday = today.with(DayOfWeek.MONDAY).minusWeeks(1);
        for (int i = 0; i < 7; i++) {
            System.out.println(lastMonday.plusDays(i));
        }
        System.out.println("=====================================");

        //exercise 4. parse a date from a string
        String dateString = "2025-03-11";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println(parsedDate);
        System.out.println("=====================================");
        // output 2025-03-11

        //exercise 5 find the day of the week
        LocalDate birthday = LocalDate.of(1995, 8, 15);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        System.out.println(birthday + " " + dayOfWeek);

        System.out.println("=====================================");
        //exercise 6
        LocalDate futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        Month month = futureDate.getMonth();
        System.out.println("Future date: " + futureDate);
        System.out.println("Extracted month: " + month);
        System.out.println("=====================================");

        //exercise 7
        LocalDate birthDate = LocalDate.of(1995, 8, 15);
        LocalDate futureDate1 = LocalDate.now().plusYears(10).minusMonths(10);
        Period period = Period.between(birthDate, futureDate1);
        System.out.println("Elapsed time: " + period.getYears() + " years, " + period.getMonths() + " months," + period.getDays() + " days");

        System.out.println("=====================================");
        // exercise 8
        Period period1 = Period.of(4, 7, 29);
        LocalDate futureDate2 = today.plus(period1);
        System.out.println("New date after period: " + futureDate2);

        System.out.println("=====================================");
        //exercise 9
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        System.out.println("=====================================");
        //exercise 10 Extract Nanoseconds
        int nanoseconds = currentTime.getNano();
        System.out.println("Nanoseconds: " + nanoseconds);


        System.out.println("=====================================");
        //exercise 11 parse a localtime from a string
        String timeString = "10:59:15";
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println(parsedTime);

        System.out.println("=====================================");
        //exercise 12 format current time
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter1);
        System.out.println(formattedTime);

        System.out.println("=====================================");
        //exercise 13 create a localDateTime
        LocalDateTime dateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        System.out.println(dateTime);

        System.out.println("=====================================");
        //exercise 14 format LocalDateTime
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("eeee d MMMM hh:mm");
        String formattedDate = dateTime.format(formatter2);
        System.out.println(formattedDate);

        System.out.println("=====================================");

        //exercise 15 combine local date and local time
        LocalDate date = LocalDate.of(2018, 4, 5);
        LocalTime time = LocalTime.of(10, 0);
        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        System.out.println(dateTime1);

        System.out.println("=====================================");
        //exercise 16extract local date and time form local datetime.
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);

        System.out.println("=====================================");
        // Extra challenge (create calender)
        Locale locale = Locale.ENGLISH;

        for (int month1 = 1; month1 <= 12; month1++) {
            LocalDate firstDay = LocalDate.of(2018, month, 1);
            int daysInMonth = firstDay.lengthOfMonth();
            DayOfWeek startDayOfWeek = firstDay.getDayOfWeek();
            String monthName = firstDay.getMonth().getDisplayName(TextStyle.FULL, locale );
            System.out.printf("\n%20s %d\n", monthName,2018);
            System.out.println("Mon Tue Wed Thu Fri Sat Sun");

            int startIndex = startDayOfWeek.getValue() % 7;

            for (int i =0; i< startIndex; i++) {
                System.out.println("  ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%3d ",day);
                if ((startIndex + day) % 7 == 0 ||  day == daysInMonth) {
                    System.out.println();
                    System.out.println("=====================================");
                }

            }


        }

    }
}
