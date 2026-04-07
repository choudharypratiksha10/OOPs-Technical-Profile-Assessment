import java.util.Scanner;

class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000)
            amount = amount * 1.02f;
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Room No: ");
        RNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        Name = sc.nextLine();
        System.out.print("Charges per day: ");
        Charges = sc.nextFloat();
        System.out.print("Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Total Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}