package edu.neu.csye6200.multiThreadingTest;


public class ThreadClassDemo {

	public static void main(String[] args) {
		Runnable Hello = new DisplayMessage("Hello");
		Thread thread1 = new Thread(Hello);
		thread1.setDaemon(true);
		thread1.setName("Hello");
		System.out.println("Starting Hello Thread /.....");
		thread1.start();

		Runnable Thankyou = new DisplayMessage("Thank you for using thread");
		Thread thread2 = new Thread(Thankyou);
		thread2.setDaemon(true);
		thread2.setName("ThankYou");
		System.out.println("Starting Thank You Thread /.....");
		thread2.start();

		System.out.println("Starting thread 3 /.....");
		Thread thread3 = new GuessANumber(27);
		thread3.start();
		try{
			thread3.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread 3 interrupted");
		}
		System.out.println("Starting Thread 4");

		Thread thread4 = new GuessANumber(32);

		thread4.start();
		System.out.println("End of main() method");
	}

}
