package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int base = 0;
        boolean onOff = true;

        Console.println("Welcome to my calculator!");


        System.out.println(base);

    while(onOff) {

// Choose a function
        System.out.println("\n\nPLEASE CHOOSE A FUNCTION : \n");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division");
        System.out.println(" 5. Sin");
        System.out.println(" 6. Cos");
        System.out.println(" 7. Tan");
        System.out.println(" 8. Inverse");
        System.out.println(" 9. Square");
        System.out.println(" 10. Square Root");
        System.out.println(" 11. Cube Root");
        System.out.println(" 12. Inverse Sin");
        System.out.println(" 13. Inverse Cosine");
        System.out.println(" 14. Inverse Tangent");
        System.out.println(" 15. Natural Log");
        System.out.println(" 16. Log Base 10");
        System.out.println(" 17. Inverse Natural Log");
        System.out.println(" 18. Inverse Log");
        System.out.println(" 19. Factorial");
        System.out.println(" 20. Absolute Value");
        System.out.println("ENTER CHOICE NUMBER");

        String choice = input.next();
        System.out.println("Enter a number");
        num1 = input.nextDouble();
//        System.out.println(num1);

        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {

            System.out.println("Enter a second number");
            num2 = input.nextDouble();
//            System.out.println(num2);

            //Scientific Calculator Switch
            switch (choice) {
                case "1":
                    BasicCalc result = new BasicCalc();
                    double addition = result.add(num1, num2);
                    System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + addition);
                    break;


                case "2":
                    BasicCalc subtract = new BasicCalc();
                    double subtraction = subtract.subtract(num1, num2);
                    System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + subtraction);
                    break;

                case "3":
                    BasicCalc multiply = new BasicCalc();
                    double multiplication = multiply.multiply(num1, num2);
                    System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + multiplication);
                    break;

                case "4":
                    BasicCalc divide = new BasicCalc();
                    double division = divide.divide(num1, num2);
                    System.out.println("Here is your calculation: " + num1 + " " + "+ " + num2 + " = " + division);
                    break;
            }
        } else {
            switch (choice) {
                case "5":
                    Calculator sine = new Calculator();
                    double sin = sine.sine(num1);
                    System.out.println(sin);
                    break;

                case "6":
                    Calculator cosine = new Calculator();
                    double cos = cosine.cosine(num1);
                    System.out.println(cos);
                    break;

                case "7":
                    Calculator tangent = new Calculator();
                    double tan = tangent.tangent(num1);
                    System.out.println(tan);
                    break;

                case "8":
                    BasicCalc inverse = new BasicCalc();
                    double invert = inverse.inverse(num1);
                    System.out.println(invert);
                    break;

                case "9":
                    BasicCalc square = new BasicCalc();
                    double sq = square.square(num1);
                    System.out.println(sq);
                    break;

                case "10":
                    BasicCalc squareroot = new BasicCalc();
                    double squarert = squareroot.squareRoot(num1);
                    System.out.println(squarert);
                    break;

                case "11":
                    Calculator cubeR = new Calculator();
                    double cubeRt = cubeR.cubeRoot(num1);
                    System.out.println(cubeRt);
                    break;

                case "12":
                    Calculator invSin = new Calculator();
                    double inverseSn = invSin.inverseSine(num1);
                    System.out.println(inverseSn);
                    break;

                case "13":
                    Calculator invCosine = new Calculator();
                    double invCos = invCosine.inverseCosine(num1);
                    System.out.println(invCos);
                    break;

                case "14":
                    Calculator invTangent = new Calculator();
                    double invTan = invTangent.inverseTangent(num1);
                    System.out.println(invTan);
                    break;

                case "15":
                    Calculator naturalL = new Calculator();
                    double ln = naturalL.naturalLog(num1);
                    System.out.println(ln);
                    break;

                case "16":
                    Calculator logBaseTen = new Calculator();
                    double logBt = logBaseTen.log(num1);
                    System.out.println(logBt);
                    break;

                case "17":
                    Calculator invLn = new Calculator();
                    double invNaturalLog = invLn.inverseLn(num1);
                    System.out.println(invNaturalLog);
                    break;

                case "18":
                    Calculator invLog = new Calculator();
                    double invLogBT = invLog.inverseLog(num1);
                    System.out.println(invLogBT);
                    break;

                case "19":
                    Calculator factorial = new Calculator();
                    double factor = factorial.factorial(num1);
                    System.out.println(factor);
                    break;

                case "20":
                    Calculator absoluteV = new Calculator();
                    double abs = absoluteV.absoluteValue(num1);
                    System.out.println(abs);
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
        System.out.println("TYPE MC TO CLEAR OR OFF TO END");
        String clear = input.next();
        if (clear.equals("MC") || clear.equals("mc")) {
            System.out.println(base);
        } else if (clear.equals("OFF") || clear.equals("off")) {
            onOff = false;
        } else {
            System.out.println("Invalid Input");
        }
    }

    }
}
