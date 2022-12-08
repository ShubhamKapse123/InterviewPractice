package com.collection;

import java.util.List;
import java.util.Locale;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.mysql.jdbc.PreparedStatement;
import com.serilization.Employye;


 



  
 
public class Hashing {

	 static void reverseWords(String str)
	 {
		 
			char charArray[] = str.substring(1, str.length()-1).toCharArray();
		    Arrays.sort(charArray);
		    String n= new String(str.charAt(0)+""+new StringBuffer(new String(charArray)).reverse()+""+str.charAt(str.length()-1));
		    System.out.print(n+" ");
	 }

	 
public static void main(String[] args) throws InterruptedException {
	
String str="Hello how are you";
String[]strarr=str.split("\\s");

for(int i=0;i<strarr.length;i++) {
	reverseWords(strarr[i]);
}



	  

	  
	  
	  }
	

}
