package com.company;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("Enter first double number");
        double numOne = scan.nextDouble();

        System.out.println("Enter second double number");
        double numTwo = scan.nextDouble();

        //set the values in VO
        Calculator calC = new Calculator();

        calC.setNum1(num1);
        calC.setNum2(num2);
        calC.setNumOne(numOne);
        calC.setNumTwo(numTwo);

        Calculator cal = new Calculator();

        System.out.println("-------------------------------");
        System.out.println("Results for Integer values : ");

        int addResult = cal.add(calC.getNum1(), calC.getNum2());
        System.out.println("Addition Result = " + addResult);

        int subResult = cal.subtract(calC.getNum1(), calC.getNum2());
        System.out.println("Subtraction Result = " + subResult);

        int mulResult = cal.multiply(calC.getNum1(), calC.getNum2());
        System.out.println("Multiplication Result = " + mulResult);

        int divResult = cal.divide(calC.getNum1(), calC.getNum2());
        System.out.println("Division Result = " + divResult);

        System.out.println("*************************************");
        System.out.println("Results for Double values : \n");

        double addResultDouble = cal.add(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Addition Result = " + addResultDouble);

        double subResultDouble = cal.subtract(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Subtraction Result = " + subResultDouble);

        double mulResultDouble = cal.multiply(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Multiplication Result = " + mulResultDouble);

        double divResultDouble = cal.divide(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Division Result = " + divResultDouble);

        System.out.println("===================================");
        System.out.println("Calculations for given numbers and operations : \n");
        
        System.out.println("1 + 1 = " + cal.add(1, 1));
        System.out.println("23 - 52 = " + cal.subtract(23, -52));
        System.out.println("34 * 2 = " + cal.multiply(34, 2));
        System.out.println("12 / 3 = " + cal.divide(12, 3));
        System.out.println("3.4 + 2.3 = " + cal.add(3.4, 2.3));
        System.out.println("6.7 * 4.4 = " + cal.multiply(6.7, 4.4));
        System.out.println("5.5 - 0.5 = " + cal.subtract(5.5, 0.5));
        System.out.println("10.8 / 2.2 = " + cal.divide(10.8, 2.2));



    }
}
