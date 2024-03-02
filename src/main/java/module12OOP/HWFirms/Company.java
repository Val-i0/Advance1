package module12OOP.HWFirms;

public class Company implements CompanyActions {
    private String companyName;
    private String companyCreationDate;
    private String bulstat;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCreationDate() {
        return companyCreationDate;
    }

    public void setCompanyCreationDate(String companyCreationDate) {
        this.companyCreationDate = companyCreationDate;
    }

    public String getBulstat() {
        return bulstat;
    }

    public Company(String companyName, String companyCreationDate, String bulstat) {
        this.companyName = companyName;
        this.companyCreationDate = companyCreationDate;
        setBulstat(bulstat);
    }

    public void setBulstat(String bulstat) {
        if(bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("--WARN: Bulstat must be 10 symbols long!--");
        }
    }

    @Override
    public void printCompanyInfo() {
        System.out.println("Company Name is: " + this.companyName);
        System.out.println("Company Creation Date is: " + this.companyCreationDate);
        System.out.println("Company Bulstat is: " + this.bulstat);
    }
}
