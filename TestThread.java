package edu.neu.csye6200.multiThreadingTest;

public class TestThread{
	public static void main(String args[])
	{
		MultiThreading_Test t1 = new MultiThreading_Test("Thread-1");
		t1.start();
		MultiThreading_Test t2 = new MultiThreading_Test("Thread-2");
		t2.start();
	}
}