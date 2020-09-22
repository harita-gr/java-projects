package multithreading;

//Counter Method
class Sequence {
	
	private int value=0;
	
	public synchronized int getNext() {   // SYNCHRONIZED METHOD
		value++;
		return value;
	}	
}
// Thread Method
class Worker extends Thread{

	Sequence sequence=null;	
	
	public Worker(Sequence sequence) {
		super();
		this.sequence = sequence;
	}

	public void run()
	{ 
		for(int i=0;i<100;i++)
		{
		   System.out.println(Thread.currentThread().getName() + "got value: " + sequence.getNext());
		   try {
			Thread.sleep(30);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}		   
		}
	}
}

// MAIN METHOD
public class MultiThreading_ThreadSynchronization {

	public static void main(String[] args) {
		
		Sequence seq=new Sequence();
		Worker w1=new Worker(seq);
		Worker w2=new Worker(seq);
		
		w1.start();
		w2.start();

	}

}
