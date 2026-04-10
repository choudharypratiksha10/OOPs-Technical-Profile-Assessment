import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {

        String firstName = null;
        String lastName = null;

        Scanner sc = new Scanner(System.in);

        if (firstName == null) {
            System.out.print("Enter first name: ");
            firstName = sc.nextLine();
        }

        if (lastName == null) {
            System.out.print("Enter last name: ");
            lastName = sc.nextLine();
        }

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);
    }
}