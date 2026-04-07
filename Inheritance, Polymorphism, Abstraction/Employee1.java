class Employee1 {
    static int count = 0;

    Employee1() { count++; }

    static void show() {
        System.out.println("Total: " + count);
    }

    public static void main(String[] args) {
        new Employee1();
        new Employee1();
        new Employee1();

        Employee1.show();
    }
}