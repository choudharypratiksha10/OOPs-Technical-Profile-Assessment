import java.util.Scanner;

abstract class Employee {
    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;
    Manager(double s) { salary = s; }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary, incentive;
    Developer(double s, double i) {
        salary = s;
        incentive = i;
    }

    double calculateBonus() {
        return (salary * 0.10) + incentive;
    }
}

class TestEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter manager salary: ");
        double ms = sc.nextDouble();

        System.out.print("Enter developer salary and incentive: ");
        double ds = sc.nextDouble();
        double di = sc.nextDouble();

        Employee e1 = new Manager(ms);
        Employee e2 = new Developer(ds, di);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}