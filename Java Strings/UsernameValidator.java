import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {

        // Given data (if any)
        String username = "  Pratiksha123  ";  // change or set to null

        if (username == null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter username: ");
            username = sc.nextLine();
        }

        username = username.trim();
        username = username.toLowerCase();

        System.out.println("Cleaned Username: " + username);
    }
}