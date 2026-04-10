import java.util.Scanner;

class EmailChecker {
    public static void main(String[] args) {

        String email = null; // put value if given

        if (email == null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter email: ");
            email = sc.nextLine();
        }

        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}