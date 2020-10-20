/**Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 * In other words, prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 *  
**/

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=0;
		boolean flag=false;
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		num=scan.nextInt();
		scan.close();
		
		if(num == 0 || num == 1)
		{
			System.out.println("Not a Prime Number - Exception");
		}
		
		else if(num%2==0)
		{
			System.out.println("Not a Prime Number - Even");
		}
		
		else {
			for(int i=3;i<num/2;i++)
			{
				if(num%i==0)
				{
					flag=true;
					System.out.println("Not a Prime number");
					break;
				}
				if (flag==true) break;
				
			}
			if(flag==false) System.out.println("Prime Number");
		}
 
	}

}
