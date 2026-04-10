class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {

        // Given data
        Student s = new Student(101, "Pratiksha");

        System.out.println(s);
    }
}