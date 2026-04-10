import java.util.Scanner;

class DivisionCalculator {
    public static void main(String[] args) {

        Integer a = null, b = null;
        Scanner sc = new Scanner(System.in);

        if (a == null) {
            System.out.print("Enter first number: ");
            a = sc.nextInt();
        }

        if (b == null) {
            System.out.print("Enter second number: ");
            b = sc.nextInt();
        }

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}