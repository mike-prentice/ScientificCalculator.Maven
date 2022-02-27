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


// Choose a function
        System.out.println("\n\nPLEASE CHOOSE A FUNCTION : \n");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division");
        System.out.println(" 5. Sin");
        System.out.println(" 6. Cos");
        System.out.println(" 7. Tan");
        System.out.println(" 8. Factorial");
        System.out.println(" 9. Square");
        System.out.println(" A. Square Root");
        System.out.println(" B. Inverse");
        System.out.println("Enter CHOICE NUMBER");

        char choice = input.next().charAt(0);

    System.out.println("Enter a number");
    num1 = input.nextDouble();
    System.out.println(num1);
    System.out.println("Enter second number");
    num2 = input.nextDouble();
    System.out.println(num2);


        //Scientific Calculator Switch
        switch(choice) {
            case '1' :
                BasicCalc result= new BasicCalc();
                double addition = result.add(num1, num2);
                System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + addition);
                break;


            case '2' :
                BasicCalc subtract= new BasicCalc();
                double subtraction = subtract.subtract(num1, num2);
                System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + subtraction);
                break;

            case '3' :
                BasicCalc multiply= new BasicCalc();
                double multiplication = multiply.multiply(num1, num2);
                System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + multiplication);
                break;

            case '4' :
                BasicCalc divide= new BasicCalc();
                double division = divide.divide(num1, num2);
                System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + division);
                break;
            case '5' :
                Calculator sine= new Calculator();
                double sin = sine.sine(num1);
                System.out.println(sin);
                break;

            case '6' :
                Calculator cosine = new Calculator();
                double cos = cosine.cosine(num1);
                System.out.println(cos);
                break;

            case '7' :
                Calculator tangent = new Calculator();
                double tan = tangent.tangent(num1);
                System.out.println(tan);
                break;

            case '8' :
                Calculator factorial = new Calculator();
                double factor = factorial.factorial(num1);
                System.out.println(factor);
                break;

            case '9' :
                BasicCalc square= new BasicCalc();
                double sq = square.square(num1);
                System.out.println(sq);
                break;

            case 'A' :
                BasicCalc squareroot = new BasicCalc();
                double squarert =squareroot.squareRoot(num1);
                System.out.println(squarert);
                break;

            case 'B':
                BasicCalc inverse = new BasicCalc();
                double invert = inverse.inverse(num1);
                System.out.println(invert);
                break;

            default:
                System.out.println("Invalid Input");
        }


        //ADD A CLEAR DISPLAY(BACK TO ZERO FUNCTION)
        System.out.println("TYPE MC TO CLEAR");
        String clear = input.next();
        if (clear.equals("MC")||clear.equals("mc")) {
            System.out.println(base);
        }

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
