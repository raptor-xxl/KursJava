package lesson9;

public class Car {
    double speed;
    int passengers;

    void addPassengers(int passengers) {
        this.passengers += passengers;
    }

    void removePassengers(int passengers) {
        if (passengers > this.passengers) {
            System.out.println("Removing more passengers than present");
            return;
        }
        this.passengers -= passengers;
    }

    void accelerate(double dv) {
        speed += dv;
    }

    void print() {
        System.out.println("Speed: " + speed);
        System.out.println("Passengers: " + passengers);
    }
}
