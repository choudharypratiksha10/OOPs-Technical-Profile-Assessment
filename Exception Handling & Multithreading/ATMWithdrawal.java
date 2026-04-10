import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {

        Double balance = null;
        Double withdraw = null;

        Scanner sc = new Scanner(System.in);

        if (balance == null) {
            System.out.print("Enter balance: ");
            balance = sc.nextDouble();
        }

        if (withdraw == null) {
            System.out.print("Enter withdrawal amount: ");
            withdraw = sc.nextDouble();
        }

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= withdraw;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}