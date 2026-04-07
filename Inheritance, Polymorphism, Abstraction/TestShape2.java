import java.util.Scanner;

class Shape {
    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void area(double r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area(int l, int b) {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

class TestShape2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Circle c = new Circle();
        Rectangle rec = new Rectangle();

        c.area(r);
        rec.area(l, b);
    }
}