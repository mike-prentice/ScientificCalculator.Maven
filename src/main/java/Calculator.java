public class Calculator {

    double output;

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
}
