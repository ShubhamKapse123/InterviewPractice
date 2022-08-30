package com.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DummyHuman  {

public static void main(String[] args) throws IOException, ClassNotFoundException {
		// here Deserilization process
		FileInputStream fileout= new FileInputStream("test.txt");
		
		ObjectInputStream oos= new ObjectInputStream(fileout);
		
		Human  h= (Human)oos.readObject();
		
		System.out.println(h.getBody());
		

	}

}
