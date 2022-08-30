package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class PoolThread {
public static void main(String[] args) throws InterruptedException {
	//fixed size thread pool this is given size thread will create after this size the existing thread used
	ExecutorService tpe= Executors.newFixedThreadPool(2);
	
	Runnable r1= ()->System.out.println("first thread.."+Thread.currentThread().getName());
	Runnable r2= ()->System.out.println("second thread.."+Thread.currentThread().getName());
	Runnable r3= ()->System.out.println("third thread.."+Thread.currentThread().getName());
	
	
	tpe.execute(r1);
	tpe.execute(r2);
	tpe.execute(r3);
	tpe.shutdown();
	
	
	//create new thread after execute().. if there is daily in time it will execute the existing thread 
	ExecutorService cashes= Executors.newCachedThreadPool();
	
	Runnable m1= ()->System.out.println("first thread.."+Thread.currentThread().getName());
	Runnable m2= ()->System.out.println("second thread.."+Thread.currentThread().getName());
	Runnable m3= ()->System.out.println("third thread.."+Thread.currentThread().getName());
	System.err.println("--------------------------------------------------------");
	
	cashes.execute(m1);
	 
	cashes.execute(m2);
	
	//Thread.sleep(1000);
	cashes.execute(m3);
	cashes.shutdown();
	
	
}
}
