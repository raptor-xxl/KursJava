package lesson4;

public class Exercise {

    public static void main(String[] args) {
        int i = -3;
        if (i < 0) {
            System.out.println("Ujemna");
        } else if (i == 0) {
            System.out.println("Zerowa");
        } else {
            System.out.println("Dodatnia");
        }

        double d1 = 4.6;
        double d2 = -8;
        double d3 = 22.9;

        double max = d1 > d2 ? d1 : d2;
        max = max > d3 ? max : d3;

        if (d1 > d2) {
            max = d1;
        } else {
            max = d2;
        }
    }

}
