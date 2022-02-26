import static java.lang.Math.*;


public class BasicCalc {
    public static double result;

    public static double add(double num1, double num2) {
        result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static double subtract(double num1, double num2) {
        result = num1 - num2;
        System.out.println(result);
        return result;
    }

    public static double multiply(double num1, double num2) {
        result = num1 * num2;
        System.out.println(result);
        return result;
    }

    public static double divide(double num1, double num2) {
        result = num1 / num2;
        System.out.println(result);
        return result;
    }

    public static double square(double num1) {
        result = num1 * num1;
        System.out.println(result);
        return result;
    }
}

