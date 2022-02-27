package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        char operator;
        int base = 0;

        Console.println("Welcome to my calculator!");
        System.out.println(base);
        System.out.println("Enter a number");
        num1 = input.nextDouble();
        System.out.println(num1);

        System.out.println("Enter an operator");
        operator = input.next().charAt(0);
        System.out.println(operator);

        System.out.println("Enter second number");
        num2 = input.nextDouble();
        System.out.println(num2);

        BasicCalc result= new BasicCalc();
        double calculation = result.add(num1, num2);






        /*
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

         */


    }
}
