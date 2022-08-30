package com.multithreading;

public class BasicMethod {
public static void main(String[] args) {
	//print current thread name
	System.out.println(Thread.currentThread().getName());
	
	//change name of current thread 
	Thread.currentThread().setName("Start Point");
	
	System.out.println(Thread.currentThread().getName());
	
	MasterMind mm= new MasterMind();
	mm.setName("MasterMind");
	
	System.out.println(mm.getName());
	
	System.out.println(Thread.currentThread().isAlive());
	
	//check thread live or die
	System.out.println(mm.isAlive());
	
	
}
}
