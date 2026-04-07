interface Bank {
    float getInterestRate();
}

class SBI implements Bank {
    public float getInterestRate() { return 6.5f; }
}

class HDFC implements Bank {
    public float getInterestRate() { return 7.0f; }
}

class ICICI implements Bank {
    public float getInterestRate() { return 6.8f; }
}

class TestBank {
    public static void main(String[] args) {
        System.out.println("SBI: " + new SBI().getInterestRate());
        System.out.println("HDFC: " + new HDFC().getInterestRate());
        System.out.println("ICICI: " + new ICICI().getInterestRate());
    }
}