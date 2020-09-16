package date;

import java.util.Date;

public class Date_DateAndTime {

	public static void main(String[] args) {
	
		//IMPLEMENTATION 1
         java.util.Date date = new Date();
         System.out.println(date);
         
         //IMPLEMENTATION 2
         long millisec=System.currentTimeMillis();
         date=new Date(millisec);
         System.out.println(date);
	}

}
