package lesson7;

public class Lecture {
    public static void main(String[] args) {
        int[] a1 = new int[4];
        int[] a2 = new int[4];
        int[][] a3 = new int[4][];
        int[] a4 = a1;


        if (a1 == a2) {
            System.out.println("Same");
        }

        String s1 = "a";
        String s2 = "la";
        String s3 = "ala";

        String s4 = "a" + "la";

        if (s3.equals(s4)) {
            System.out.println("Same2");
        }

        Long l2 = 5L;
        Long l = 1000L;
        Integer i1 = 5;
        long l3 = 5;
        if (i1.equals(l2)) {
            System.out.println("Same3");
        }
    }
}
