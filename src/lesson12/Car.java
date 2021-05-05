package lesson12;

public class Car extends Vehicle {
    private Engine engine = new Engine();
    private double payloadMass;

    public Car(double mass, double speed) {
        super(mass, speed);
        setMass(mass);
        setSpeed(speed);
    }

    public Car(double mass) {
        super(mass, 0);
    }

    public double getSpeed() {
        return super.getSpeed();
    }

    public double getMass() {
        return super.getMass() + payloadMass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getPayloadMass() {
        return payloadMass;
    }

    public void setPayloadMass(double payloadMass) {
        this.payloadMass = payloadMass;
    }
}
