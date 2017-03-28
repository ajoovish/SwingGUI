package edu.neu.csye6200.multiThreadingTest;

public class GuessANumber extends Thread
{
	private int number;

	public GuessANumber(int number)
	{
		this.number = number;

	}
	public void run()
	{
		int counter=0;
		int guess=0;
		do{
			guess=((int)Math.random() *100+1);
			System.out.println(this.getName()+" Guesses "+guess);
			counter++;
		}while(guess!=number);
		System.out.println(this.getName()+" Has guessed the CORRECT number in "+counter+" guesses");
		System.out.println("The correct number is "+guess);

	}
}
