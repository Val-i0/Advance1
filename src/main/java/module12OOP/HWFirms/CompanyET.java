package module12OOP.HWFirms;

public class CompanyET extends Company {
    private String ownerName;
    private double startingCapital;
    private double actualCapital;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getStartingCapital() {
        return startingCapital;
    }

    public void setStartingCapital(double startingCapital) {
        this.startingCapital = startingCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public CompanyET(String companyName, String companyCreationDate, String bulstat, String ownerName, double startingCapital, double actualCapital) {
        super(companyName, companyCreationDate, bulstat);
        this.ownerName = ownerName;
        this.startingCapital = startingCapital;
        this.actualCapital = actualCapital;
    }

    public double calculateProfit() {
        return actualCapital - startingCapital;
    }

    public void printCompanyInfo() {
        super.printCompanyInfo();
        System.out.println("Company Owner Name is: " + this.ownerName);
        System.out.println("Company Starting Capital is: " + this.startingCapital);
        System.out.println("Company Actual Capital is: " + this.actualCapital);
        System.out.println("Company Profit is: " + this.calculateProfit());
    }
}
