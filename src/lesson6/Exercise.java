package lesson6;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {1, 6, 19, -3, 987, -3};
        int n = -3;
        boolean contains = false;
        for (int i : array) {
            if (i == n) {
                contains = true;
                break;
            }
        }

        float[] array2 = {1.2f, -4, 0.023f, 45.3f};

        for (int i = array2.length - 1; i > 0; --i) {
            array2[i] += array2[i - 1];
        }
    }
}
