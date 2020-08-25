package lesson8;

public class Lecture {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Jan";
        p1.surname = "Kowalski";

        Person p2 = new Person();
        p2.name = "Adam";
        p2.surname = "Placek";
        p2.age = 32;

        Person p3 = new Person();
        p3.name = "Ala";
        p3.surname = "Kot";
        p3.age = 20;

        Project proj1 = new Project();
        proj1.name = "Super project";
        proj1.estimatedWorkDays = 123;
        proj1.manager = p1;
        proj1.workers = new Person[2];
        proj1.workers[0] = p2;
        proj1.workers[1] = p3;

        p1.project = proj1;
        p2.project = proj1;
        p3.project = proj1;

        p2.manager = p1;
        p3.manager = p1;

    }
}
