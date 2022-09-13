package com.oops;

public class Runner extends City  {
public static void main(String[] args) {
	
	People r= new Runner();
	
	r.test();
	int i=0;
	String A="abcabbccd";

	int vale[]= new int[10];
	while(i<A.length()) {
	System.out.println(++vale[A.charAt(i)-'a']);
	i++;
	}
}
}
