package abstractInterface;

import javax.swing.undo.CannotUndoException;
import java.util.Scanner;

public class DemoTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the tax Payers: ");
        int taxPayersNumber = scanner.nextInt();

        Payer[] payers = new Payer[taxPayersNumber];
        for (int i = 0; i < taxPayersNumber; i++) {
            System.out.println("Are you Individual or Company (i/c)");
            char select = scanner.next().toLowerCase().charAt(0);

            System.out.println("Name: ");
            String name= scanner.next();

            System.out.println("Annual income: ");
            double income = scanner.nextDouble();

            if(select=='i'){
                System.out.println("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                payers[i]= new Individual(name, income,healthExpenditures);
            }else{
                System.out.println(" Number Of Employees : ");
                int employeeNumber = scanner.nextInt();
                payers[i]= new Company(name,income,employeeNumber);
            }
        }
        System.out.println("TAXES PAID: ");
        double totalIndividualPaid=0;
        double totalCompanyPaid=0;
        double total=0;

        for (Payer payer:payers) {
            if (payer instanceof Individual){
                double taxPaid = payer.payTax();
                totalIndividualPaid += taxPaid;
                System.out.println(payer.getName() + " paid : " + taxPaid + " tax.");
            }else{
                double taxPaid = payer.payTax();
                totalCompanyPaid += taxPaid;
                System.out.println(payer.getName() + " paid : " + taxPaid + " tax.");

            }

        }
        System.out.println(totalCompanyPaid);
        System.out.println(totalIndividualPaid);
        System.out.println(total);

    }
}
