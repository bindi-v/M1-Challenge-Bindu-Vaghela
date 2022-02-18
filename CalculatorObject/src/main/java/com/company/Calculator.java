package com.company;

public class Calculator {
    private int num1;
    private int num2;
    private double numOne;
    private double numTwo;

    public int getNum1() {

        return num1;
    }
    public void setNum1(int num1) {

        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {

        this.num2 = num2;
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }

    int result;
    double resultDouble;

    //Method for addition

    public int add(int num1, int num2){
        result = num1+num2;
        return result;
    }
    public double add(double numOne, double numTwo) {
        resultDouble = numOne + numTwo;
        return resultDouble;
    }

    //Method for subtraction

    public int subtract(int num1, int num2){
        result = num1-num2;
        return result;
    }
    public double subtract(double numOne, double numTwo) {
        resultDouble = numOne - numTwo;
        return resultDouble;
    }

    //Method for multiplication

    public int multiply(int num1, int num2){
        result = num1*num2;
        return result;
    }
    public double multiply(double numOne, double numTwo) {
        resultDouble = numOne * numTwo;
        return resultDouble;
    }

    //Method for division

    public int divide(int num1, int num2){
        result = num1/num2;
        return result;
    }
    public double divide(double numOne, double numTwo) {
        resultDouble = numOne / numTwo;
        return resultDouble;
    }


}
