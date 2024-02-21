package module6Classes;

public class Person {
    private String name;
    private int age;

//    public Person() {
//    }

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static String ageCategory(int age) {
        if(age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public String nonStaticAgeCategory() {
        this.age = age;
        this.name = name;
        if(age < 18) {
            return name + " is Child";
        } else if (age < 65) {
            return name + " is Adult";
        } else {
            return name + " is Senior";
        }
    }

}
