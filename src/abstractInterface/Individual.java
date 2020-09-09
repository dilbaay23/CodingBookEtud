package abstractInterface;

public class Individual extends  Payer {

    private double healthExpenditures;

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double payTax() {
        double taxPercentage = this.getAnnualIncome() < 20000 ? 0.15 : 0.25;
        return this.getAnnualIncome()*taxPercentage - this.healthExpenditures*0.5;

    }
}


