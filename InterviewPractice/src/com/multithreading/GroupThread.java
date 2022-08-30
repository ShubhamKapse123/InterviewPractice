package com.multithreading;

public class GroupThread {
public static void main(String[] args) throws InterruptedException {
	ThreadGroup tg= new ThreadGroup("cricket");
	Runnable r= ()->{
		for(int i=1; i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("wekup"+i+" ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
      
	};


	
	
		
	
	Thread one= new Thread(tg,r,"t1");
	Thread two= new Thread(tg,r,"t2");
	Thread three= new Thread(tg,r,"t3");
	
	
	one.start();
	one.join();
	two.start();
	two.join();
	three.start();
	
	

	
	tg.list();
	
	
}
}
