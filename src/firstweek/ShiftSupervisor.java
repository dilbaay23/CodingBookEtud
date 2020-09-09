package firstweek;

import java.util.Date;

public class ShiftSupervisor extends Employee {
    private double  annualSalary;
    private double yearlyBonus;

    public ShiftSupervisor(String name, Date hire, double annualSalary) {
        super(name, hire);
        this.annualSalary = annualSalary;
    }

    public ShiftSupervisor(String name, Date hire) {
        super(name, hire);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(int goal, int product) {
        if(goal<=product)
            this.yearlyBonus = annualSalary/12;
        else
            this.yearlyBonus=0;
    }

    @Override
    public String toString() {
        return super.toString() + "ShiftSupervisor{" +
                "annualSalary=" + annualSalary +
                ", yearlyBonus=" + yearlyBonus +
                '}';
    }
}
