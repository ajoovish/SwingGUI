package edu.neu.csye6200.multiThreadingTest;

public class MultiThreading_Test implements Runnable {

	private Thread t;
	private String threadName;

	public MultiThreading_Test(String Name) 
	{
		threadName = Name;
		System.out.println("Creating: "+threadName);
	}

	@Override
	public void run() {
		System.out.println("Running: "+threadName);
		try{
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread: "+threadName+","+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread: "+threadName+" interrupted");
		}
		System.out.println("Thread: "+threadName+" Exiting");
	}

	public void start()
	{
		System.out.println("Starting: "+threadName);
		if(t==null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}

}