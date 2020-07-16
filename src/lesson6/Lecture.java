package lesson6;

public class Lecture {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 4;
        array1[1] = 2;
        array1[3] = 5;
        array1[4] = 8;
        System.out.println(array1[0]);

        int[] array2 = {1, 2, 3, 0, -4};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println();

        for (int a : array1) {
            System.out.println(a);
        }

        int[][][] tab2 = new int[5][3][4];
        tab2[2][1][0] = 9;
        int i = tab2[1][2].length;

        int[][] tab3 = new int[6][];
        tab3[0] = new int[2];
        tab3[2] = new int[5];
        tab3[4] = new int[20];

        i = tab3[0].length;
        i = tab3[2].length;
        i = tab3[4].length;

        int[][] tab4 = {
                {1, 2, 3},
                {2, 7, 5, 1},
                {},
                {1}
        };
    }
}
