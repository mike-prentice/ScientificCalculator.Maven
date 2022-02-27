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

        //ADD A CHOICE FUNCTION A/B: BASIC OR SCIENCE

        //ADD A CLEAR DISPLAY(BACK TO ZERO FUNCTION)

        //NEED TO WRAP EVERYTHING BELOW WELCOME AND STOPPING AT SC CALC CHOICES IN ITS OWN CLASS/METHOD
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
//NEED TO WRAP SCIENTIFIC CALC IN ITS OWN CLASS/METHOD

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


        //Scientific Calculator Switch
        switch(operator) {
            case '1' :
                Calculator sine= new Calculator();
                double sin = sine.sine(input);
                System.out.println(sin);
                break;

            case '2' :
                Calculator cosine = new Calculator();
                double cos = cosine.cosine(input);
                System.out.println(cos);
                break;

            case '3' :
                Calculator tangent = new Calculator();
                double tan = tangent.tangent(input);
                System.out.println(tan);
                break;

            /*case '4' :                                <-------No factorial method yet
                BasicCalc divide= new BasicCalc();
                double division = divide.divide(num1, num2);
                System.out.println(division);
                break;*/

            case '5' :
                BasicCalc square= new BasicCalc();
                double sq = square.square(num1, num2);
                System.out.println(sq);
                break;

            case '6' :
                BasicCalc squareroot = new BasicCalc();
                double squarert =squareroot.squareRoot(num1, num2);
                System.out.println(squarert);
                break;

            case '7' :
                BasicCalc inverse = new BasicCalc();
                double invert = inverse.inverse(num1, num2);
                System.out.println(invert);
                break;
        }

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
