package multithreading;

public class MyThread extends Thread{
	
	@Override
	
	public  void run() {
		System.out.println("Hello from: "+Thread.currentThread().getName() +",ID is:" + Thread.currentThread().getId()+",Priority is:" + Thread.currentThread().getPriority());
	}

}
