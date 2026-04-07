import java.util.Scanner;

class Employee2 {
    String name;
    double salary;

    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter salary: ");
        double s = sc.nextDouble();

        Employee2 e = new Employee2(n, s);
        e.display();
    }
}