import java.util.Scanner;

class Bank {
    final double rate = 5.0;

    void calculate(double amt) {
        System.out.println("Interest: " + (amt * rate / 100));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter amount: ");
        double a = sc.nextDouble();

        b.calculate(a);
    }
}