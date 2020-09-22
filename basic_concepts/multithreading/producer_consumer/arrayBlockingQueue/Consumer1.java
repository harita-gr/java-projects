package multithreading.producer_consumer.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer1 implements Runnable {

	BlockingQueue<Integer> questionQueue;
	
	//Constructor
	public Consumer1(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}
		
	@Override
	public void run() {
		while(true) { // to run indefinitely
		try {
			System.out.println("Answered Question - "+questionQueue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
