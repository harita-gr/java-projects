package multithreading;

public class Multithreading_Demo {

	public static void main(String[] args) {
		
		// To print current thread info
		System.out.println(Thread.currentThread()); 
		
		//Modifying current thread
		Thread t=Thread.currentThread();
		t.setPriority(6);
		t.setName("my-main");
		System.out.println(t);
		
		//Creating our own thread - MyThread class
		
		MyThread t1=new MyThread();
		t1.setName("Thread t1");
		
		MyThread t2=new MyThread();
		t2.setName("Thread t2");
		
		MyThread t3=new MyThread();
		t3.setName("Thread t3");
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
