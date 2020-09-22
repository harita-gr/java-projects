/* THREAD 1 - PRODUCER
 *When a new Q comes,
 *     Checks if questionList has reached capacity (LIMIT=5)
 *     If YES - sends alert & made to WAIT()
 *     If NO - adds new question to the list (blocks questionList using SYNCHRONIZED & sends notify() after adding
 * 
 * */

package multithreading.producer_consumer.arrayList;

import java.util.List;
import java.util.concurrent.BlockingQueue;


public class Producer implements Runnable {

	List<Integer> questionList =null; // Shared resource between 2 threads - P & C
	final int LIMIT=5; //Max question limit that can be unanswered
	private int questionNo;
	
	//Constructor
	public Producer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
 
	//Method to read Question
	public void readQuestion(int questionNo) throws InterruptedException {
		
		//Checking size of List (limit=5)
		synchronized(questionList) { // Accessing shared resource via SYNCHRONIZED block
		while(questionList.size()==LIMIT)
		{
			System.out.println("Questions have piled up...wait for answers");
			questionList.wait(); // Shared resource is made to WAIT until notified to continue
		}			
	  }
		
		//Adding question to List
		synchronized(questionList) {
			
			System.out.println("New Question: " + questionNo);
			questionList.add(questionNo);
			Thread.sleep(100); // to slow it a bit to make it more practical
			questionList.notify();  // notify the threads that are waiting (on questionList) to wake up & release resource
	   }
				
	}

	@Override
	public void run() {
		while (true) { // Just to run the code indefinitely
	  try {
		readQuestion(questionNo++); // Increments qNo every time called
	} catch (InterruptedException e) {
		e.printStackTrace();
	}		
   }
  }
}
