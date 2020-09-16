package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Date_LocalDateAndTime {

	public static void main(String[] args) {
		// LOCAL DATE		
		LocalDate localDateToday = LocalDate.now();
		System.out.println(localDateToday);
		
		// Local Date with Zone
		LocalDate localDateWithZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localDateWithZone);
		
		// LOCAL TIME
		LocalTime localTimeNow = LocalTime.now();
		System.out.println(localTimeNow);
		
		// Local Time with Zone
		LocalTime localTimeeWithZone = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localTimeeWithZone);
		
		//LOCAL DATE-TIME
				
		LocalDateTime localDateTimeToday = LocalDateTime.now();
		System.out.println(localDateTimeToday);
		
		// Local Date-Time with Zone
		LocalDateTime localDatetTimeWithZone = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(localDatetTimeWithZone);
		
		
		
	}

}
