import java.util.LinkedList;
import java.util.List;

public class List_LinkedList_Demo {

	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.add(1, 4);
		linkedList.remove(2);
		System.out.println(linkedList);
		
	

		

	}

}
