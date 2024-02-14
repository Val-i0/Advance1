package module4;

import java.util.Scanner;

public class Tasks4 {
    private static Scanner scan;
    public static void main(String[] args) {
        System.out.printf("List of tasks:%n" +
                "1 - Print day of week%n" +
                "2 - Calculate area and perimeter of Rectangle%n" +
                "3 - Is the number Positive or Negative?%n" +
                "4 - Print biggest of 3 numbers%n");
        System.out.println("Please select a task number (1 - 4):");
        scan = new Scanner(System.in);
        int method = scan.nextInt();

        switch (method) {
            case 1: weekday(); break;
            case 2: calculateRectangle(); break;
            case 3: isItPositive(); break;
            case 4: biggestOf3Numbers(); break;
        }
    }

    private static void biggestOf3Numbers() {
        int big = 0;
//        int big = Integer.MIN_VALUE;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Please enter a number (integers only):");
            scan = new Scanner(System.in);
            int temp = scan.nextInt();
            if (temp >= big) {
                big = temp;
            }
        }

        System.out.printf("Biggest number is: %d", big);
    }

    private static void isItPositive() {
        System.out.println("Please enter a digit:");
        scan = new Scanner(System.in);
        double num = scan.nextDouble();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is zero - not positive, not negative");
        }
    }
    private static void calculateRectangle() {
        System.out.println("Enter rectangle Length:");
        scan = new Scanner(System.in);
        double len = scan.nextDouble();

        while (len <= 0) {
            System.out.println("Enter positive number:");
            len = scan.nextDouble();
        }

        System.out.println("Enter rectangle Height:");
        double hei = scan.nextDouble();

        while (hei <= 0) {
            System.out.println("Enter positive number:");
            hei = scan.nextDouble();
        }

        System.out.printf("Rectangle Perimeter: 2 * (%f + %f) = %.2f%n", len, hei, 2*(len + hei));
        System.out.printf("Rectangle Area: %f * %f = %.2f", len, hei, len * hei);
    }
    private static void weekday() {
        System.out.println("Please enter a digit from 1 to 7:");

        scan = new Scanner(System.in);
        int input = scan.nextInt();
        String day = "";

        switch (input) {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default:
                System.out.println("Invalid day of week"); break;
        }

        System.out.printf("You entered %d. So weekday is %s", input, day);
    }

}
