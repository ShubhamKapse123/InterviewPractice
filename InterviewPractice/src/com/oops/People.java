package com.oops;

public interface People {
	
	default  void  test(){
		System.out.println("welcome");
	}

	static void getTest() {
		System.out.println("home");
	}
}
