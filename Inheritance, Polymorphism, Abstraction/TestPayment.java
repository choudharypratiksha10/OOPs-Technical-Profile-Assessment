import java.util.Scanner;

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("UPI: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("NetBanking: " + amount);
    }
}

class TestPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        new CreditCardPayment().pay(amt);
        new UPIPayment().pay(amt);
        new NetBankingPayment().pay(amt);
    }
}