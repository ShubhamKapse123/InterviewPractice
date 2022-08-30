package com.multithreading;
class World extends Thread {
	public void run() {
		//System.out.println(Thread.interrupted());// if interrupted method call two twis interrupted status will change true-->false
		//System.out.println(Thread.currentThread().isInterrupted());// this will not changes interrupted status
	
		try {
			for(int i=1;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println("welcome "+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Itrupted {
public static void main(String[] args) {
	World w= new World();
	w.start();
	w.interrupt();
	
}
}
