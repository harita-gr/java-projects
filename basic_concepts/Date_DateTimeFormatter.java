package date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date_DateTimeFormatter {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime= ZonedDateTime.now();
		
		DateTimeFormatter dtformatter1=DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtformatter2=DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtformatter3=DateTimeFormatter.ofPattern("yy//MM/dd HH:mm:ss");
		
		String format1=dtformatter1 .format(zonedDateTime);
		String format2=dtformatter2 .format(zonedDateTime);
		String format3=dtformatter3 .format(zonedDateTime);
		
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(format3);
		

	}

}
