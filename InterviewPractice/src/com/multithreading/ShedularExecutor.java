package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ShedularExecutor {
	static int val=10;
public static void main(String[] args) {
	//existing thread use by default the scheduler and we will schedule in time to start thread 
	//after completing the the work of existing thread
	ScheduledExecutorService es= Executors.newSingleThreadScheduledExecutor();
	
	Runnable r1= ()->{
		val=val+10;
		System.out.println("first one "+Thread.currentThread().getName());};
	Runnable r2= ()->{
		val=val+10;
		System.out.println("second one "+Thread.currentThread().getName() );
	};
	Runnable r3= ()->System.out.println("third one "+Thread.currentThread().getName()+" "+val );
	
	es.schedule(r1, 5, TimeUnit.SECONDS);
	
	es.schedule(r2, 10, TimeUnit.SECONDS);
	
	es.schedule(r3, 13, TimeUnit.SECONDS);
	
	es.shutdown();
	
	
	
	
}
}
