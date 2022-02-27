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


// Basic calculations switch
        switch(operator) {
            case '+' :
                BasicCalc result= new BasicCalc();
                double addition = result.add(num1, num2);
                System.out.println(addition);
                break;

            case '-' :
                BasicCalc subtract= new BasicCalc();
                double subtraction = subtract.subtract(num1, num2);
                System.out.println(subtraction);
                break;

            case '*' :
                BasicCalc multiply= new BasicCalc();
                double multiplication = multiply.multiply(num1, num2);
                System.out.println(multiplication);
                break;

            case '/' :
                BasicCalc divide= new BasicCalc();
                double division = divide.divide(num1, num2);
                System.out.println(division);
                break;
        }


// Choose a function
        System.out.println("\n\nPLEASE CHOOSE A FUNCTION : \n");
        System.out.println(" 1. Sin");
        System.out.println(" 2. Cos");
        System.out.println(" 3. Tan");
        System.out.println(" 4. Factorial");
        System.out.println(" 5. Square");
        System.out.println(" 6. Square Root");
        System.out.println(" 7. Inverse");
        System.out.println("Enter CHOICE NUMBER");

        int choice = input.nextInt();

//Switch for scientific calculator functions




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
