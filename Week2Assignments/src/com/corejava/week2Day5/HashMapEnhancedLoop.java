package com.corejava.week2Day5;


import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapEnhancedLoop {

	static Scanner sc=new Scanner(System.in);
	static HashMap<String,Integer> H=new HashMap<String,Integer>();
	
	public static void main(String[] args) {
       System.out.println("How many Elements You Want To Enter in HashMap");
       int n=sc.nextInt();
       System.out.println("Please Enter the name and id ");
      for(int i=0;i<n;i++) {
    	
    	  String name=sc.next();
    		int id=sc.nextInt();
    	  H.put(name, id);
      }
      
      System.out.println("===================================================");
      System.out.println("***************************************************");
	  System.out.println("Printing Array List Elements Using Enhanced Loop");
	  System.out.println("***************************************************");
	  
	  for (Entry<String, Integer> entry : H.entrySet()) {
		    
		   
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		   
		    System.out.println(value+" : "+key);
		}
	  System.out.println("===================================================");
	  sc.close();
	}

}
