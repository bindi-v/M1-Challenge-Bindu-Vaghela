package com.company;

import com.company.interfaces.Converter;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 12 for month.");
        int monthNumber = scan.nextInt();

        System.out.println("Enter a number between 1 to 7 for day of the week.");

        int dayNumber = scan.nextInt();

        // Converter converterIf = new ConverterIf();

       Converter convertMonthIf = new ConverterIf();
       Converter convertDayIf = new ConverterIf();
       Converter convertMonthSwitch = new ConverterSwitch();
       Converter convertDaySwitch = new ConverterSwitch();

        String monthIf = convertMonthIf.convertMonth(monthNumber);
        String dayOfWeekIf = convertDayIf.convertDay(dayNumber);
        System.out.println("===========================================\n");
        String monthSwitch = convertMonthSwitch.convertMonth(monthNumber);
        String dayOfWeekSwitch = convertDaySwitch.convertDay(dayNumber);
        System.out.println("===========================================");
    }

}
