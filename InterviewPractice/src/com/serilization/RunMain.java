package com.serilization;

import java.util.HashMap;

public class RunMain {
public static void main(String[] args) {
//	HashMap<Human,String> demo= new HashMap<>();
//	
//	Human h= new Human("M");
//	
//	demo.put(h,"Man");
//	
//	
//	System.out.println(demo.get(h));
	
	String k="te";
	
	String ki=new String("test").intern();
	
	if(k==ki) {
		System.out.println("true");
	}
	
	System.out.println(k.hashCode());
	System.out.println(ki.hashCode());
	
	
}
}
