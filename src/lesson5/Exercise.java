package lesson5;

public class Exercise {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 10; i++) {
            if (i != n) {
                System.out.println(i);
            }
        }

        String s = "abc";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 = s.charAt(i) + s2;
        }

        System.out.println(s2);

        s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }

        System.out.println(s2);
    }
}
