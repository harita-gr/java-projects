/*
 * Producer-Consumer problem using wait(),notify()
 * 
 * shared resource - List
 * 
 * Producer => adds questions to List
 * Consumer => consumes/answers the questions from the list
 * 
 * **/

package multithreading.producer_consumer.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> questionList =new ArrayList<Integer>();
		
		Thread t1 = new Thread (new Producer(questionList));
		Thread t2 = new Thread (new Consumer(questionList));
		
		t1.start();
		t2.start();
	}

}
