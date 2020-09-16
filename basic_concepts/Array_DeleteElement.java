import java.util.Scanner;

public class Array_DeleteElement {

	public static void main(String[] args) {
		
		int size,del;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		size=s.nextInt(); 
		
		int arr[]=new int[size]; //  Declare array
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the element to be deleted:" );
		del=s.nextInt();
		
		//Finding the element
		int flag=0,loc=0;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==del)
			{
				flag=1;
				loc=i;
				break;
			}
		}
		
		//Deleting the element
		if(flag==1)
		{
			for (int i=loc;i<size-1;i++)
			{
				arr[i]=arr[i+1];
			}
			
			System.out.println("The array after deleting the element: " );
			for(int i=0;i<size-1;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		else
			System.out.println("Element not found");

				
	}

}
