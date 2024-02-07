package Module2;

public class _01Week1Homework {
    public static void main(String[] args) {
        System.out.print("Task 1: ");
        System.out.println(calculateAverage(3, 7, 15));

        System.out.print("Task 2: ");
        salary(12000);

        System.out.print("Task 3: ");
        loan(1000, 5);

    }

    public static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void salary(int salary) {
        System.out.println(salary / 12);
    }

    public static void loan(double sum, double months) {
        double annualInterest = sum * 1.07;
        System.out.println(annualInterest / months);
    }
}