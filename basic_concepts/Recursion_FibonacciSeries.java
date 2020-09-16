import java.util.Scanner;

public class Recursion_FibonacciSeries {

	public static void main(String[] args) {
		
		 int limit,i=1;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the limit:");
	     limit=s.nextInt();
	     s.close();
	     while(i<=limit)
	     {
	    	 System.out.println(fib(i));
	    	 i++;
	     }
	     
	}

	     static int fib(int n)
	     {
	    	
	         if (n==1)
	    	 {
	    		 return 0;
	    	 }
	    	 else if (n==2)
	    	 {
	    		 return 1;
	    	 }
	    	 else
	    	 {
	    		 return fib(n-1)+fib(n-2);
	    	 }
	     }
}
