package com.multithreading;



class TestCal extends Thread{
	int total=0;
	public void run() {
	for(int i=1;i<=10;i++) {
		total=total+100;
	}
	synchronized (this) {
		this.notify();
	}
	}
}

public class Intercommunicate {
public static void main(String[] args) throws InterruptedException {
	TestCal tc= new TestCal();	
	tc.start();
	
	synchronized(tc){
		tc.wait();
		System.out.println(tc.total);
	}
	

}
}
