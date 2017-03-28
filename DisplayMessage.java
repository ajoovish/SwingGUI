package edu.neu.csye6200.multiThreadingTest;

public class DisplayMessage extends Thread{
	private String message;

	DisplayMessage(String message)
	{
		this.message = message;

	}
	public void run()
	{
		while(true){
			System.out.println(message);
		}
	}
}
