package date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date_Calendar {

	public static void main(String[] args) {
		
		Calendar calendar  = new GregorianCalendar();
		
		int year= calendar.get(Calendar.YEAR);
		int month= calendar.get(Calendar.MONTH);
		int dayOfMonth= calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek= calendar.get(Calendar.DAY_OF_WEEK);
		int dayOfYear= calendar.get(Calendar.DAY_OF_YEAR);
				
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
		System.out.println(dayOfYear);
		

	}

}
