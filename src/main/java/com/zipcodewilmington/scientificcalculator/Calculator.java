package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    public double output;

    public double sine(double input) {
        output = Math.sin(Math.toRadians(input));
        return output;
    }

    public double cosine(double input) {
        output = Math.cos(Math.toRadians(input));
        return output;
    }

    public double tangent(double input) {
        output = Math.tan(Math.toRadians(input));
        return output;
    }

    public double inverseSine(double input) {
        output = (Math.asin(input) * (180/Math.PI));
        return output;
    }

    public double inverseCosine(double input) {
        output = (Math.acos(input) * (180/Math.PI));
        return output;
    }

    public double inverseTangent(double input) {
        output = (Math.atan(input) * (180/Math.PI));
        return output;
    }

    public double naturalLog(double input) {
        output = Math.log(input);
        return output;
    }

    public double log(double input) {
        output = Math.log10(input);
        return output;

    }

    public double inverseLn(double input) {
        output = Math.exp(input);
        return output;
    }

    public double inverseLog(double input) {
        output = Math.pow(10, input);
        return output;
    }

    public double cubeRoot(double input) {
        output = Math.cbrt(input);
        return output;
    }


    public double absoluteValue(double input) {
        output = Math.abs(input);
        return output;
    }

    public double factorial(double input) {
        output = 1;
        if(input < 0)  {
            System.out.println("Can't find the factorial of a negative number");
        } else {
            for(int i = 1; i <= input; i++) {
                output = output * i;
            }
        }
        return output;
    }
}





































