import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n1 = sc.nextLine();
        System.out.print("Enter age: ");
        int a1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String n2 = sc.nextLine();
        System.out.print("Enter age: ");
        int a2 = sc.nextInt();

        Person p1 = new Person(n1, a1);
        Person p2 = new Person(n2, a2);

        p1.display();
        p2.display();
    }
}