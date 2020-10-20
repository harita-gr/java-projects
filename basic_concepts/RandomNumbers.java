import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		/**Using Random Class**/
		
		Random random = new Random();
		//System.out.println(random.nextInt(6));
		random.ints(5).forEach(System.out::println); // Generates stream of size 5 (5 diff numbers)
		random.ints(5,100000,999999).forEach(System.out::println); // Generates stream of size 5 between bounds		
		
		/**Using Math class**/
		 // Generates number between 0 and 1
		 // To convert to natural numbers use:  [ Math.random()*(max-min+1)+min ]  
		
		int min=200000,max=400000;
		int rannum= (int) (Math.random()*(max-min+1)+min);
		System.out.println(rannum);
		
	}

}
