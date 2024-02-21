package module6Classes;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }
    public void setWidthAndHeigth(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
/**
 * Класът трябва да има конструктори както с параметри, така и без параметри, метод за
 * изчисляване на площта на правоъгълника (calculateArea()) и метод за изчисляване на
 * периметъра на правоъгълника (calculatePerimeter())
 */