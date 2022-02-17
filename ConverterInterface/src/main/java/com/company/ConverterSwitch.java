package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {
    //public interface Converter {
//    public void convertSwitch() {
//        System.out.println("Convert by Switch statements.");
//    }
    /*
         * This method converts the given number into its corresponding month.
         * @param monthNumber the number you wish to convert to a month
         * @return the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
         */
       // String convertMonthSwitch(int monthNumber);
    public String convertMonth(int monthNumber) {
        System.out.println("----------------------------------------");
        System.out.println("Convert a number into month by switch.\n");
        String monthName;
        switch(monthNumber) {
            case 1:
                System.out.println("Month is : January");
                break;
            case 2:
                System.out.println("Month is : February");
                break;
            case 3:
                System.out.println("Month is : March");
                break;
            case 4:
                System.out.println("Month is : April");
                break;
            case 5:
                System.out.println("Month is : May");
                break;
            case 6:
                System.out.println("Month is : June");
                break;
            case 7:
                System.out.println("Month is : July");
                break;
            case 8:
                System.out.println("Month is : August");
                break;
            case 9:
                System.out.println("Month is : September");
                break;
            case 10:
                System.out.println("Month is : October");
                break;
            case 11:
                System.out.println("Month is : November");
                break;
            case 12:
                System.out.println("Month is : December");
                break;
            default:
                System.out.println("Error From Switch: Invalid Input for month number! Enter a number from 1 to 12. ");
                break;
        }
        return null;
    }

    /*
         * This method converts the given number into its corresponding day of the week.
         * @param dayNumber number you wish to convert to a day of the week
         * @return the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
         * The first day of the week is Sunday
         */
   // String convertDaySwitch(int dayNumber);
    public String convertDay(int dayNumber) {
        System.out.println("Convert a number to day of week by switch.\n");
        switch(dayNumber) {
            case 1:
                System.out.println("Day of the week is : Sunday");
                break;
            case 2:
                System.out.println("Day of the week is : Monday");
                break;
            case 3:
                System.out.println("Day of the week is : Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is : Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is : Thursday");
                break;
            case 6:
                System.out.println("Day of the week is : Friday");
                break;
            case 7:
                System.out.println("Day of the week is : Saturday");
                break;
            default:
                System.out.println("Error From Switch: Invalid input for day number of week! Enter a number from 1 to 7.");
                break;
        }
        return null;
    }

   // }
}
