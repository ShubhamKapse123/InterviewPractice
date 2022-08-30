package com.multithreading;

public class PriorityMethod {
public static void main(String[] args) {
/*	priority is the integer number.  High the number (1-10) take first
	1-MIN_PRIORITY
	5-NORM_PRIORITY
	10-MAX_PRIORITY*/
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	
	
	MasterMind mm= new MasterMind();
	mm.setPriority(3);
	System.out.println(mm.getPriority());
	
	
}
}
