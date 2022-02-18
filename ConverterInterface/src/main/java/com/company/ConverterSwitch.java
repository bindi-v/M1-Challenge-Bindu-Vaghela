package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {
    //public interface Converter {
//    public void convertSwitch() {
//        System.out.println("Convert by Switch statements.");
//    }

       // String convertMonthSwitch(int monthNumber);
    public String convertMonth(int monthNumber) {
        System.out.println("----------------------------------------");
        System.out.println("Convert a number into month by switch.\n");
        String monthName = "January";
        switch(monthNumber) {
            case 1:
                monthName = "January";
                System.out.println("Month is : " + monthName);
                break;
            case 2:
                monthName = "February";
                System.out.println("Month is : " + monthName);
                break;
            case 3:
                monthName = "March";
                System.out.println("Month is : " + monthName);
                break;
            case 4:
                monthName = "April";
                System.out.println("Month is : " + monthName);
                break;
            case 5:
                monthName = "May";
                System.out.println("Month is : " + monthName);
                break;
            case 6:
                monthName = "June";
                System.out.println("Month is : " + monthName);
                break;
            case 7:
                monthName = "July";
                System.out.println("Month is : " + monthName);
                break;
            case 8:
                monthName = "August";
                System.out.println("Month is : " + monthName);
                break;
            case 9:
                monthName = "September";
                System.out.println("Month is : " + monthName);
                break;
            case 10:
                monthName = "October";
                System.out.println("Month is : " + monthName);
                break;
            case 11:
                monthName = "November";
                System.out.println("Month is : " + monthName);
                break;
            case 12:
                monthName = "December";
                System.out.println("Month is : " + monthName);
                break;
            default:
                System.out.println("Error From Switch: Invalid Input for month number! Enter a number from 1 to 12. ");
                break;
        }
        return monthName;
    }


   // String convertDaySwitch(int dayNumber);
    public String convertDay(int dayNumber) {
        System.out.println("------------------------------------------");
        System.out.println("Convert a number to day of week by switch.\n");
        String dayOfWeek = "Sunday";
        switch(dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Monday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Tuesday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 4:
                dayOfWeek = "Wednesday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 5:
                dayOfWeek = "Thursday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 6:
                dayOfWeek = "Friday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            case 7:
                dayOfWeek = "Saturday";
                System.out.println("Day of the week is : " + dayOfWeek);
                break;
            default:
                System.out.println("Error From Switch: Invalid input for day number of week! Enter a number from 1 to 7.");
                break;
        }
        return dayOfWeek;
    }
}
