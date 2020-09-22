import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Collections_Sort {

	public static void main(String[] args) {

     
         HashSet<String> set1=new HashSet<>();
         set1.add("Black Butler");
         set1.add("Bleach");
         set1.add("Fairy Tail");
         set1.add("07 Ghost");
         
         
         List<String> list1 = new ArrayList<>(set1); //Creating a LIST with values from SET
         Collections.sort(list1); // Method argument should be LIST
         System.out.println(list1);
         
         
         
	}

}
