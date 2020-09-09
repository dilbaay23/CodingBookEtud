package firstweek;

import com.sun.jdi.IntegerValue;

import java.util.Date;

public class Employee {
    private String name;
    private String number;
    private Date hire;

    public Employee() {
    }

    public Employee(String name,  Date hire) {
        this.name = name;
        this.hire = hire;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        int number2= Integer.parseInt((number.substring(0,3)));
        if((number2>=0 && number2<=999) && (number.charAt(3)=='-') && (number.charAt(4)>='A' && number.charAt(4)<='M'))
        this.number = number;
        else
            System.out.println("Invalid number!!!");
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", hire=" + hire +
                '}';
    }
}
