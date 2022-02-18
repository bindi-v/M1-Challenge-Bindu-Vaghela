package com.company;


import com.company.interfaces.Converter;

public class ConverterIf implements Converter {
    //public interface Converter {
//   private int monthNumber;
//   private int dayNumber;

//    public String convertIf() {
//        return "Convert by If statements.";
//    }

    public String convertMonth(int monthNumber) {
        String monthName = null;
        System.out.println("--------------------------------------------");
        System.out.println("Convert number into month by if statements.\n");
        if (monthNumber == 1) {
            monthName = "January";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 2) {
            monthName = "February";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 3) {
            monthName = "March";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 4) {
            monthName = "April";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 5) {
            monthName = "May";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 6) {
            monthName = "June";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 7) {
            monthName = "July";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 8) {
            monthName = "August";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 9) {
            monthName = "September";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 10) {
            monthName = "October";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 11) {
            monthName = "November";
            System.out.println("Month is : " + monthName);
        } else if (monthNumber == 12) {
            monthName = "December";
            System.out.println("Month is : " + monthName);
        } else {
            System.out.println("Error from If: Invalid month number. Choose a number from 1 to 12.");
        }
        return monthName;
    }

    public String convertDay(int dayNumber){
        System.out.println("--------------------------------------------------");
        System.out.println("Convert number into day of week by if statements.\n");
        String dayOfWeek = null;
        if(dayNumber == 1) {
            dayOfWeek = "Sunday";
            System.out.println("Day of the week is : " + dayOfWeek);
        } else if(dayNumber == 2) {
            dayOfWeek = "Monday";
                    System.out.println("Day of the week is : " + dayOfWeek);
        }else if(dayNumber == 3) {
            dayOfWeek = "Tuesday";
            System.out.println("Day of the week is : " + dayOfWeek);
        }else if(dayNumber == 4) {
            dayOfWeek = "Wednesday";
            System.out.println("Day of the week is : " + dayOfWeek);
        }else if(dayNumber == 5) {
            dayOfWeek = "Thursday";
            System.out.println("Day of the week is : " + dayOfWeek);
        }else if(dayNumber == 6) {
            dayOfWeek = "Friday";
            System.out.println("Day of the week is : " + dayOfWeek);
        }else if(dayNumber == 7) {
            dayOfWeek = "Saturday";
            System.out.println("Day of the week is : " + dayOfWeek);
        }else {
            System.out.println("Error from If : Invalid input for day of week. Enter a number between 1 to 7");
        }
        return dayOfWeek;
    }


}
