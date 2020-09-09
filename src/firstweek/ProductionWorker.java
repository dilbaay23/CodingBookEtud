package firstweek;

import java.util.Date;

public class ProductionWorker extends Employee{
    private int shift;
    private double payRate;

    public ProductionWorker( double payRate) {
        this.payRate = payRate;
    }

    public ProductionWorker(String name, Date hire, double payRate) {
        super(name, hire);
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift==1 || shift==2)
        this.shift = shift;
        else
            System.out.println("invalid Shift!!! Please set shift 1 for day-shift and set 2 for night-shift  ");
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductionWorker{" +
                "shift=" + shift +
                ", payRate=" + payRate +
                '}';
    }
}
