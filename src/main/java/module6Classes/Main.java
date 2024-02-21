package module6Classes;

public class Main {
    public static void main(String[] args) {
        // Person class
/*
        Person unknown = new Person();
        Person maria = new Person("Maria", 21);

        unknown.printInfo();
        maria.printInfo();
        System.out.println(maria.nonStaticAgeCategory());

        String category = Person.ageCategory(18);
        System.out.println("Static method says: " + category);
*/

        // Calculator class
/*
        int sum = Calculator.sumTwoNumbers(2, 5);
        System.out.println(sum);
        double sumInts = Calculator.sumTwoNumbers(9, 11);
        System.out.println(sumInts);
*/

        // Circle class
/*
        Circle circle1 = new Circle();
        System.out.println(circle1.calculateArea());

        Circle circle2 = new Circle(5);
        System.out.println(circle2.calculatePerimeter());
        System.out.printf("%.3f", circle2.calculatePerimeter());
*/

        // SquareWithGetterAndSetter class
/*
        SquareWithGetterAndSetter sq = new SquareWithGetterAndSetter();
        sq.setLength(5);
        System.out.println(sq.getLength());
*/

        // Rectangle class
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidthAndHeigth(2.5, 4);
        System.out.println("rectangle1:");
        System.out.println("Height is: " + rectangle1.getHeight());
        System.out.println("Width is: " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(4, 5.5);
        System.out.printf("%nrectangle2:%n");
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());
    }
}
