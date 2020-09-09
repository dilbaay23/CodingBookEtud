package firstweek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoEmployee {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format( new Date()   );
        Date   date       = format.parse ( "2009-12-31" );
        ProductionWorker productionWorker = new ProductionWorker("Astrid",date,2);
        productionWorker.setShift(1);
        productionWorker.setNumber("225-A");
        System.out.println(productionWorker.toString());
        ShiftSupervisor shiftSupervisor= new ShiftSupervisor("Moon",date,30000);
        shiftSupervisor.setYearlyBonus(54,85);
        System.out.println(shiftSupervisor.toString());

    }
}
