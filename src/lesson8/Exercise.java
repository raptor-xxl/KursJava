package lesson8;

public class Exercise {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ala";
        p1.surname = "Kot";

        Person p2 = new Person();
        p2.name = "Jan";
        p2.surname = "Kowalski";

        Person p3 = new Person();
        p3.name = "Adam";
        p3.surname = "Placek";

        Car car1 = new Car();
        car1.model = "Astra";
        car1.color = "blue";
        car1.passengers = new Person[5];
        car1.passengers[0] = p1;
        car1.passengers[1] = p2;
        car1.passengers[2] = p3;
        p1.car = car1;
        p2.car = car1;
        p3.car = car1;

        Person p = p1;
        for (Person person : p.car.passengers) {
            if (person != p && person != null) {
                System.out.println(person.name + " " + person.surname);
            }
        }
    }
}
