package com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class RunMain {
	//this is the serilization process IOStream 
public static void main(String[] args) throws IOException {
	
	Human h= new Human();
	h.setBody("six pack wali");
	
	FileOutputStream fileout= new FileOutputStream("test.txt");
	
	ObjectOutputStream oos= new ObjectOutputStream(fileout);
	
	oos.writeObject(h);
	
	oos.flush();
	oos.close();
}
}
