/*
 * ARRAY "BLOCKING QUEUE"
 *  -> Implements concurrency
 *  -> No need to set limit,notify(),wait() explicitly
 * 
 * */


package multithreading.producer_consumer.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import multithreading.producer_consumer.arrayList.Consumer;
import multithreading.producer_consumer.arrayList.Producer;

public class Application {
	
	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		
		Thread t1 = new Thread (new Producer1(questionQueue));
		Thread t2 = new Thread (new Consumer1(questionQueue));
		
		t1.start();
		t2.start();
	}

}
