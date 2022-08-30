package com.multithreading;

public class Test {
public static void main(String[] args) {
	MasterMind mm= new MasterMind();
	mm.start();
	
	Proccesing p1= new Proccesing();
	p1.start();
		
}
}
