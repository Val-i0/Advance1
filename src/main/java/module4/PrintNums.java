package module4;

public class PrintNums {
    public static void main(String[] args) {
//        print1to100();
//        printEvenTo200();
//        divisibleTo3And7();
        each10Error();
    }

    private static void print1to100() {
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }

    private static void each10Error() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Error");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printEvenTo200() {
        for (int i = 0; i < 201; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void divisibleTo3And7() {
        for (int i = 0; i < 301; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }
    }
}
