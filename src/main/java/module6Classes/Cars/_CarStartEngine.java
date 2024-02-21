package module6Classes.Cars;

public class _CarStartEngine {
    public static void main(String[] args) {
        // use constructor with params
        Car honda = new Car("Honda", "Civic", 2000, 4000);
        System.out.println("Honda tax is: " + honda.calculateTax() + " BGN");
        System.out.println("Honda age is: " + honda.calculateAge() + " years");
        System.out.println(); // for space in console

        // use constructor with NO params
        Car tesla = new Car();
        System.out.println("Tesla default values BEFORE setter:");
        System.out.println(tesla.getBrand());
        System.out.println(tesla.getModel());
        System.out.println(tesla.getYearMake());
        System.out.println(tesla.getPrice());

        tesla.setParams("Tesla", "Model S", 2022, 80000);
        System.out.println("Tesla values AFTER setter:");
        System.out.println(tesla.getBrand());
        System.out.println(tesla.getModel());
        System.out.println(tesla.getYearMake());
        System.out.println(tesla.getPrice());

        System.out.println("Tesla tax is: " + tesla.calculateTax() + " BGN");
        System.out.println("Tesla age is: " + tesla.calculateAge() + " years");
    }
}
