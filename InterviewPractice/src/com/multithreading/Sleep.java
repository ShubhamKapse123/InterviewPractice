package com.multithreading;

import java.io.Serializable;

public class Sleep implements Serializable {
public static void main(String[] args) throws InterruptedException {

	
	for(int i=0;i<59;i++) {
		Thread.sleep(1000);
		

		System.out.println(i);
	}
}
}
