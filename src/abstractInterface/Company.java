package abstractInterface;

public class Company extends Payer{

    private int numberOfEmployee;

    public Company(String name, double annualIncome, int numberOfEmployee) {
        super(name, annualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double payTax() {
        double taxPercentage = this.numberOfEmployee > 10 ? 0.14 : 0.16;
        return this.getAnnualIncome()*taxPercentage;
    }
}
