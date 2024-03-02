package module12OOP;

public class MainFigure {
    public static void main(String[] args) {
        Figure square = new Square(4);

        double area = square.calculateArea();
        System.out.println(area);

        double perimeter = square.calculatePerimeter();
        System.out.println(perimeter);
    }
}
