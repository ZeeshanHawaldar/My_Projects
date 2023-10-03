package com.corejava.week2Day5;


import java.util.HashSet;
import java.util.Scanner;


public class HashSetEnhancedLoop {

	static Scanner sc=new Scanner(System.in);
	static HashSet<String> HS=new HashSet<String>();
	
	public static void main(String[] args) {
       System.out.println("How many Elements You Want To Enter in HashSet");
       int n=sc.nextInt();
       System.out.println("Please Enter the names");
      for(int i=0;i<n;i++) {
    	
    	  String name=sc.next();
          HS.add(name);
      }
      
      System.out.println("===================================================");
      System.out.println("***************************************************");
	  System.out.println("Printing Hash Set Elements Using Enhanced Loop");
	  System.out.println("***************************************************");
	  
	  for (String names : HS) {
		
		    System.out.println(names);
		}
	  System.out.println("===================================================");
	  sc.close();
	}
}
