package lesson12;

public class Lecture {
    public static void main(String[] args2) {
        Car c = new Car(12, 34);
        c.setPayloadMass(45);
        Thing t = c;
        double mass = t.getMass();
        Vehicle v = new Vehicle();

        v = c;
        Vehicle v2 = new Car(56, 78);
        String s = "";
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
        }

    }
}
