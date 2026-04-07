import java.util.Scanner;

abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    void calculate_area() {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculate_area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}

class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape s1 = new Circle(r);
        Shape s2 = new Rectangle(l, b);

        s1.display_info();
        s1.calculate_area();

        s2.display_info();
        s2.calculate_area();
    }
}