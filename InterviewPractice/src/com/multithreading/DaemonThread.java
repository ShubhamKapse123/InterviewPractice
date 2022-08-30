package com.multithreading;

public class DaemonThread extends Thread{
	
	public void run() {
		System.out.println("Daemon thread");
	}
public static void main(String[] args) {
	//daemon thread execute if the main thread performing  the some take
	//if  comment this print statement of main thread the daemon thread is not execute

	System.out.println("main thread task");
	
	//daemon thread is provide the service to user thread or main thread it running 
	//background of the user thread or main thread
    DaemonThread dt= new DaemonThread();
    dt.setDaemon(true);
    dt.start();

	
	

}
}
