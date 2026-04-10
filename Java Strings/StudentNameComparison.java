import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {

        String name1 = null;
        String name2 = null;

        Scanner sc = new Scanner(System.in);

        if (name1 == null) {
            System.out.print("Enter first name: ");
            name1 = sc.nextLine();
        }

        if (name2 == null) {
            System.out.print("Enter second name: ");
            name2 = sc.nextLine();
        }

        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Names are same");
        } else {
            System.out.println("Case-sensitive: Names are different");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Names are same");
        } else {
            System.out.println("Case-insensitive: Names are different");
        }
    }
}