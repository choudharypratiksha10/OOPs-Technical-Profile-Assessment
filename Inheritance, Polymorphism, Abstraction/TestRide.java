import java.util.Scanner;

abstract class Ride {
    int distance;
    Ride(int d) { distance = d; }
    abstract void calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Bike: " + (distance * 5));
    }
}

class AutoRide extends Ride {
    AutoRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Auto: " + (distance * 8));
    }
}

class CarRide extends Ride {
    CarRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Car: " + (distance * 12));
    }
}

class TestRide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        int d = sc.nextInt();

        Ride[] rides = {
            new BikeRide(d),
            new AutoRide(d),
            new CarRide(d)
        };

        for (Ride r : rides) {
            r.calculateFare();
        }
    }
}