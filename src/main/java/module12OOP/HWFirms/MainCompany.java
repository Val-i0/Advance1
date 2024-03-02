package module12OOP.HWFirms;

public class MainCompany {
    public static void main(String[] args) {
        Company company1 = new Company("Main Company", "2020-05-17", "1234567890");
        company1.printCompanyInfo();

        System.out.println(); // divide companies' info for readability

        Company company2 = new CompanyET("Ivanov ET", "2018.09.28", "4567891238",
                "Petar Ivanov", 1000.0, 52487.65);
        company2.printCompanyInfo();

        System.out.println(); // divide companies' info for readability

        Company company3 = new Company("Main Company", "2020-05-17", "1234");
        company3.printCompanyInfo();
    }
}
