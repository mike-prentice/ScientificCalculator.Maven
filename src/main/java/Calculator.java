public class Calculator {

    double output;

    public double Sine(double input) {
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
}
