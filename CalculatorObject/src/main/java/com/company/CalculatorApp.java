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
        int numOne = scan.nextInt();

        System.out.println("Enter second double number");
        int numTwo = scan.nextInt();

        //set the values in VO
        Calculator calC = new Calculator();
        calC.setNum1(num1);
        calC.setNum2(num2);
        calC.setNumOne(numOne);
        calC.setNumTwo(numTwo);

        Calculator cal = new Calculator();

        int addResult = cal.add(calC.getNum1(), calC.getNum2());
        System.out.println("Addition Result =" + addResult);

        int subResult = cal.subtract(calC.getNum1(), calC.getNum2());
        System.out.println("Subtraction Result =" + subResult);

        int mulResult = cal.multiply(calC.getNum1(), calC.getNum2());
        System.out.println("Multiplication Result =" + mulResult);

        int divResult = cal.divide(calC.getNum1(), calC.getNum2());
        System.out.println("Division Result =" + divResult);

        double addResultDouble = cal.add(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Addition Result =" + addResultDouble);

        double subResultDouble = cal.subtract(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Subtraction Result =" + subResultDouble);

        double mulResultDouble = cal.multiply(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Multiplication Result =" + mulResultDouble);

        double divResultDouble = cal.divide(calC.getNumOne(), calC.getNumTwo());
        System.out.println("Division Result =" + divResultDouble);

//      int sum = add(1, 1);
//        System.out.println("1 + 1 = " + sum);
//
//      int subtract = subtract(23, -52);
//        System.out.println("23 - (-52) = " + subtract);
//
//      int multiply = multiply(34, 2);
//        System.out.println("34 * 2 = " + multiply);
//
//      int divide = divide(12, 3);
//        System.out.println(" 12 / 3 = " + divide);


    }
}
