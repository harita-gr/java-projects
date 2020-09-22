package multithreading.threadPools;

public class MessageProcessor implements Runnable{
	
	private int message;

	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +"[RECIEVED] message- "+ message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() +"[DONE] processing message- "+ message);
		
	}

	private void respondToMessage() {
		 try {
			Thread.sleep(30); // To simulate time taken for some work to  be done
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	
	

}
