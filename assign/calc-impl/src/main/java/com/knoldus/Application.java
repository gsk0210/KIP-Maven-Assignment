package com.knoldus;
import com.knoldus.Calculator;


public class Application {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(17,11));
        System.out.println(calculator.subtract(17,2));
        System.out.println(calculator.multiply(11,10));
        System.out.println(calculator.divide(11,2));

    }
}
