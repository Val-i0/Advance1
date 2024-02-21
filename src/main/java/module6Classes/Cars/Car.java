package module6Classes.Cars;

import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private int yearMake;
    private double price;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.yearMake = 0;
        this.price = 0;
    }
    // setter and getter for the default empty params constructor
    public void setParams(String brand, String model, int yearMake, double price) {
        this.brand = brand;
        this.model = model;
        this.yearMake = yearMake;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearMake() {
        return yearMake;
    }

    public double getPrice() {
        return price;
    }

    public Car(String brand, String model, int yearMake, double price) {
        this.brand = brand;
        this.model = model;
        this.yearMake = yearMake;
        this.price = price;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        yearMake = 0;
        price = 0;
    }

    public Car(int yearMake, double price) {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.yearMake = yearMake;
        this.price = price;
    }

    public double calculateTax() {
        int year = calculateAge();
        if (year > 5) {
            return price * 0.05;
        } else {
            return 0;
        }
    }

    public int calculateAge() {
        int year = Year.now().getValue();
        return year - yearMake;
    }
}