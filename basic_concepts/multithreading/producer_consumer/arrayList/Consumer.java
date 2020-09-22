/* THREAD 2 - CONSUMER
 * 
 * 1. Checks questionList,
 *      if Empty - sends a message & wait() for questions
 *      if NOT - answers question 1 by 1 and removes FIFO
 * 
 * */

package multithreading.producer_consumer.arrayList;

import java.util.List;

//Thread 2
public class Consumer implements Runnable {


	List<Integer> questionList =null; // Shared resource between 2 threads - P & C
	
	//Constructor
	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}
 
	//Method to answer Question
	public void answerQuestion() throws InterruptedException {
		
		synchronized(questionList) { // Accessing shared resource via SYNCHRONIZED block
		while(questionList.isEmpty())
		{
			System.out.println("No questions to answer...waiting for producer to create questions");
			questionList.wait(); // Shared resource is made to WAIT until notified to continue
		}			
	  }
		
	   //Answering question & deleting it from list - FIFO
		synchronized(questionList) {
			Thread.sleep(5000); // Time to answer question
			//Simulation of queue - FIFO
			System.out.println("ANSWERED Question: " + questionList.remove(0)); //remove() => Removes & returns that valu
			questionList.notify();  // notify the threads that are waiting to wake up & release resource
	   }
				
	}

	@Override
	public void run() {
		while (true) { // Just to run the code indefinitely
	  try {
		  answerQuestion(); 
	} catch (InterruptedException e) {
		e.printStackTrace();
	}		
   }
  }
}
