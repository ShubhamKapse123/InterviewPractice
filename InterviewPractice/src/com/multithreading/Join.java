package com.multithreading;


class Apptitude extends Thread{
	public void run() {
	
	try {
		System.out.println("Start Apptitude Test");
		Thread.sleep(1000);
		System.out.println("Complete Apptitude Test");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class Technicalround extends Thread{
	public void run() {
	
	try {
		System.out.println("Start Technical Interview");
		Thread.sleep(1000);
		System.out.println("Complete Technical Interview");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}


class HrRound extends Thread{
	public void run() {
	
	try {
		System.out.println("Start Hr Test");
		Thread.sleep(1000);
		System.out.println("Complete Hr Test");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

public class Join {
		
public static void main(String[] args) throws InterruptedException {

	Apptitude apti= new Apptitude();
	apti.start();
	apti.join();
	
	Technicalround tr= new Technicalround();
	tr.start();
	tr.join();
	
	HrRound hr= new HrRound();
	hr.start();
	hr.join();
	
	System.out.println("Congratulation Your Selected....");
	
	
}

}

