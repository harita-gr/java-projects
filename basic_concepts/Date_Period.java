package date;

import java.time.LocalDate;
import java.time.Period;

public class Date_Period {
	public static void main(String[] args) {
		
		LocalDate localdate1 = LocalDate.of(2018, 10, 3);
		LocalDate localdate2 = LocalDate.of(2019, 12, 23);
		
		Period period = Period.between(localdate1, localdate2);
		System.out.println("Period is: "+period);
		System.out.println(period.getYears()+"Years,"+period.getMonths()+"Months,"+period.getDays()+"Days");
	}

}
