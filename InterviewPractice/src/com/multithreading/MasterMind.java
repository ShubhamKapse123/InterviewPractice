package com.multithreading;

public class MasterMind extends Thread {
	
	public void run(){
		System.out.println("Master_Mind Priority"+Thread.currentThread().getPriority());
	}

}
