package que2;

import java.util.Random;

class MyJob implements Runnable {
	Random random = new Random();
	private int sum;
	
	private boolean isDone = false;
	int count = 0;  // keep track how many threads have generated random number 

	@Override
	public void run() {
		int randomNumber = random.nextInt(10) + 1;
		System.out.println("Random number generated by "+Thread.currentThread().getName()+" : " + randomNumber);
		
		count++;
		
		sum = sum + randomNumber;
		
		//if all threads have generated random numbers then count will be 5 
		// now we can access get sum 
		if (count == 5) {

			isDone = true;
			synchronized (this) {
				notifyAll();
			}
		}
	}

	public synchronized int getSum() {
		// if all threads have terminated then only return sum
		if (!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class q2 {
	public static void main(String[] args) {
		MyJob job = new MyJob();
		Thread thread1 = new Thread(job, "thread1");
		Thread thread2 = new Thread(job, "thread2");
		Thread thread3 = new Thread(job, "thread3");
		Thread thread4 = new Thread(job, "thread4");
		Thread thread5 = new Thread(job, "thread5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		System.out.println("The sum of random numbers generated is "+job.getSum());
	}

}