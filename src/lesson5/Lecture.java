package lesson5;

public class Lecture {
    public static void main(String[] args) {

        int i = 6;
        while (i < 5) {
            System.out.println("Tekst" + i);
            i++;
        }
        i = 6;
        do {
            System.out.println("Tekst do while " + i);
            i++;
        } while (i < 5);

        etykieta3:
        for (int j = 0; j < 10; j++) {
            System.out.println("Pętla for " + j);
        }

        etykieta1:
        for (int i2 = 0; i2 < 5; i2++) {
            System.out.println("Pętla for ** 1");
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 > 1) {
                    continue;
                }
                System.out.println("Pętla for **** " + i2 + " " + i3);
            }
            System.out.println("Pętla for ** 2");
        }

        int[] tab = new int[5];
        for (int a : tab) {
            System.out.println(a);
        }

    }
}
