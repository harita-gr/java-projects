package multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_Demo {

	public static void main(String[] args) {

      ExecutorService executor = Executors.newFixedThreadPool(2);
      
      Runnable processor = new MessageProcessor(6);
      executor.execute(processor);
      

      Runnable processor1 = new MessageProcessor(4);
      executor.execute(processor1);
      

      Runnable processor2 = new MessageProcessor(7);
      executor.execute(processor2);
      
      executor.shutdown(); // shut down gracefully when all tasks are done
      
      while (!executor.isTerminated()) { // to wait till all tasks are terminated to print sysout
    	  
      }
      
      System.out.println("All tasks submitted...");

	}

}
