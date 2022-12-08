package com.oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test  {

	 static int minJumps(int arr[], int l, int h)
	    {
	      
	        if (h == l) {
	            return 0;
	        }
	 

	        if (arr[l] == 0) {
	            return 0;
	        }

	        int min = Integer.MAX_VALUE;
	        for (int i = l + 1; i <= h
	                            && i <= l + arr[l];
	             i++) {
	         
	            int jumps = minJumps(arr, i, h);
	            

	     
	            if (jumps != Integer.MAX_VALUE && jumps + 1 < min) {
	                min = jumps + 1;
	            }

	        }
	        return min;
	    }
	 
	    
	    public static void main(String args[])
	    {
	        //int arr[] = { 1, 3, 9, 8, 2, 2, 1, 0, 1, 0 };
	    	//int arr[] = {1, 0, 1, 0};
	    	
	    	Scanner scn= new Scanner(System.in);
	    	
	    	int n=scn.nextInt();
	    	int arr[]= new int[n];
	    	
	    	for(int i=0;i<n;i++) {
	    		arr[i]=scn.nextInt();
	    	}
	    	
	    	

	        int val=minJumps(arr, 0, n - 1);
	        
	        if(val>1) {
	        	  System.out.print(minJumps(arr, 0, n - 1));
	        }else {
	        	System.out.print("infinite");
	        }
	        
	     
	            
	            
	      
	    }
	


}
