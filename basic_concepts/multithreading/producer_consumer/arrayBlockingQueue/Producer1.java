package multithreading.producer_consumer.arrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer1 implements Runnable {
	
	BlockingQueue<Integer> questionQueue;
	int questionNo;
	
	//Constructor
	public Producer1(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while(true) { // to run indefinitely
			try {
				synchronized (this) {
					int nextQuestion=questionNo++;
					System.out.println("Got new Question - " +nextQuestion);
				    questionQueue.put(nextQuestion);
				}
	        } catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		}
	}

