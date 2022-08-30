package com.multithreading;

public class YieldMethod extends Thread {
	//stop the current thread and give the change to 
	//execute the other thread if priority is low(ex. mart billing counter)
	public void run() {
		
		Thread.yield();
		
		for(int i=1;i<=5;i++)
		{
		System.out.println("base thread");
		}
	}
public static void main(String[] args) {
	
	YieldMethod ym= new YieldMethod();
	ym.start();
	
	for(int j=1;j<=5;j++) {
	
		System.out.println("main thread");
	}
	

	
}
}
