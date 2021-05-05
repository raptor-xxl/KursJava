package lesson12;

public class Vehicle extends Thing {

    private double speed;

    public Vehicle() {

    }

    public Vehicle(double mass, double speed) {
        super(mass);
        this.speed = speed;
    }

    protected double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
