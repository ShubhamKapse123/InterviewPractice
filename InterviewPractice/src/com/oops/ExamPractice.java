package com.oops;

import java.util.ArrayList;
import java.util.Optional;

abstract class st{
	protected static  String te="test";
	
	abstract public void setid();
	public abstract   void getid();
}
public class ExamPractice {
	


	public static void main(String[] args) {

	 
	ArrayList<String> a= new ArrayList<>();
	a.add("test");
	a.add("best");
	a.add("test");
	
	Optional<String> n = a.stream().filter(i->i.equals("t")).findFirst();
	
	System.out.println(n.isPresent());
	
   
	}
}
