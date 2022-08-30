package com.multithreading;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleExecitor {
	//single thread creation if your create multiple thread by using runnable or callable the use the existing thread every time
	// if you want to thread executor then use the newSingleThreadScheduledExecutor(size)
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	System.out.println(Thread.currentThread().getName());
	ExecutorService ses= Executors.newSingleThreadExecutor();
	
	Runnable thr1= ()-> System.out.println("runnable..."+ Thread.currentThread().getName());
	
	Callable thr2= ()-> {return Thread.currentThread().getName();};
	
	
	Runnable thr4= ()-> System.out.println("runnable..."+ Thread.currentThread().getName());
	Callable thr5= ()-> {return Thread.currentThread().getName();};
	
	ses.execute(thr1);
	ses.execute(thr4);
	//the shutdownNow the executor use to shutdown executor with just before execute thread also not execute
	//it throw this java.util.concurrent.RejectedExecutionException after you want to start the thread.
	// in shutdown() use it will start the thread that just before the shutdown() call our example is thr4 after that
	//  same exeception throw.
	//ses.shutdownNow();
	Future<String> t=ses.submit(thr2);
	Future<String> t2=ses.submit(thr2);
	System.out.println(t.get());
	System.out.println(t2.get());
	
	
	}
	

}
