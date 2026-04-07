class Person {
    void role() { System.out.println("Person"); }
}

class Employee extends Person {
    void role() { System.out.println("Employee"); }
}

class Manager extends Employee {
    void role() { System.out.println("Manager"); }
}

class TestRole {
    public static void main(String[] args) {
        Person p = new Manager();
        p.role();
    }
}