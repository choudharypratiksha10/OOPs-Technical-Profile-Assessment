class Staff {
    void work() { System.out.println("Staff work"); }
}

class Doctor extends Staff {
    void work() { System.out.println("Doctor treats"); }
}

class Nurse extends Staff {
    void work() { System.out.println("Nurse assists"); }
}

class Receptionist extends Staff {
    void work() { System.out.println("Receptionist manages"); }
}

class TestStaff {
    public static void main(String[] args) {
        new Doctor().work();
        new Nurse().work();
        new Receptionist().work();
    }
}