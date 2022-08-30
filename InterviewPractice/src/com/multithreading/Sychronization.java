package com.multithreading;

import java.util.concurrent.SynchronousQueue;

 class  Book{
	static  int val=10;

	
static synchronized public  void booktiket(int set) {
		if(val>=set) {
			System.out.println("succefully"+val);
			val-=set;
			System.out.println("left set"+val);
		}else {
			System.out.println("failed");
		}
	}
}
public class Sychronization extends Thread{
	public static Book b;
	public  int set;
	
	public void run() {
	 b.booktiket(set);
	}
public static void main(String[] args) {
	b=new Book();
	Sychronization s= new Sychronization();
	s.set=7;
	s.start();
	
	Sychronization s1= new Sychronization();
	s1.set=6;
	s1.start();
	
	Sychronization s3= new Sychronization();
	s3.set=6;
	s3.start();
	
	Sychronization s5= new Sychronization();
	s5.set=6;
	s5.start();
	
	

	
}
}
