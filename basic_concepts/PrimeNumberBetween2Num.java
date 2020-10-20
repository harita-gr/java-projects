import java.util.Scanner;

public class PrimeNumberBetween2Num {

	public static void main(String[] args) {
		
		int num1=0,num2=0;
		boolean flag=false;
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		num1=scan.nextInt();
		System.out.println("Enter the number 2: ");
		num2=scan.nextInt();
		scan.close();
		
		for(int i=num1;i<num2;i++)
		{
			checkPrime(i);		
		}

	}
	
	public static void checkPrime(int num)
	{
		boolean flag=false;
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				flag=true;
				break;
			}
			if (flag==true) break;
		}	
		if(flag==false) System.out.println(num);
	}

}
