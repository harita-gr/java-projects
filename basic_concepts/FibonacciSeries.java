import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
     int num1=0,num2=1,num3;
     int limit;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the limit:");
     limit=s.nextInt();
     s.close();
     
     if (limit<=0)
     {
    	 System.out.println("Invalid Number");
     }
     else if (limit==1)
     {
    	 System.out.println(num1);
     }
     else if (limit>=2)
     {
    	 System.out.println(num1);
    	 System.out.println(num2);
     }
     
         for(int i=3;i<=limit;i++)
       {
    	    num3=num1+num2;
    	    System.out.println(num3);
    	    num1=num2;
    	    num2=num3;
    	 }
     }
	}

