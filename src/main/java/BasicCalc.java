import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        double num1, num2;
        char operand;
        double answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        System.out.println("Enter operand");
        operand = scanner.next().charAt(0);
    }
    public int add(int num1, int num2) {
        return answer =  num1 + num2;


    }
}
