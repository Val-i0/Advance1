package module12OOP;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Side must be bigger than 0");
        }
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
