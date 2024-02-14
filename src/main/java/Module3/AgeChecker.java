package Module3;

public class AgeChecker {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(15);
        checkAge(18);
    }

    private static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Човекът е пълнолетен (18+ години).");
        } else {
            System.out.println("Човекът е пълнолетен (под 18 години).");
        }
    }
}
