package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_SimpleDateFormatter {

	public static void main(String[] args) {
		
		
		Date date=new Date();
        SimpleDateFormat formatter =new SimpleDateFormat("dd/mm/yy");
        String strdate=formatter.format(date);
        System.out.println(strdate);

	}

}
