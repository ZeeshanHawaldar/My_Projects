package com.corejava.week2Day3andDay4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListImpl {
	
	public static  Scanner sc=new Scanner(System.in);
	 static ArrayList<Integer> A=new ArrayList<Integer>();
	 static ArrayList<Integer> B;
	 
	 //method to remove elements by index
	 public static void RemoveElement1(int index) {
		 int length=A.size();
		B=new ArrayList<Integer>(length-1);
		System.out.println("B length:"+B.size());
		 for (int i = 0,j=0; i < A.size(); i++,j++) {
			 if(i==index) {
				 j--;
	            continue;
			 }
			 
			 else {
				B.add(j, A.get(i));
			 }
			 
	}
	 }
	 
	 
	 
	public static void main(String[] args) {
		 
		 System.out.println("+==========================================================+"); 
		 System.out.println("Size of the ArrayList: "+A.size());
		 System.out.println("+==========================================================+");
		 
		 //Adding Elements in the ArrayList
		 System.out.println("Please Enter how many elements you want to add");
		 int n=sc.nextInt();
		 System.out.println("Please Enter The elements");
		 for (int i = 0; i < n; i++) {
			 int Add=sc.nextInt();
			     A.add(Add);
		}
		 for (Integer X : A) {
	 			System.out.println(X);
	 		}
		 System.out.println("+==========================================================+");

		 
		 //Removing The ArraList Element Using Index
		 System.out.println("Please Enter at which Index You want to Remove");
         int index=sc.nextInt();
         for (int i = 0; i < A.size(); i++) {
        	 if(i==index) {
			A.remove(index);
        	 }
		}
         for (Integer X : A) {
  			System.out.println(X);
  		}
		 System.out.println("+==========================================================+");

         
         //Removing The ArraList Element by passing Index in method
		 System.out.println("Please Enter at which Index You want to Remove");
         int index1=sc.nextInt();
        
        	 RemoveElement1(index1);
		
         for (Integer Y : B) {
 			System.out.println(Y);
 		}
		 System.out.println("+==========================================================+");

         System.out.println("Size of the ArrayList"+B.size());
         
		 System.out.println("+==========================================================+");

         //Find The Min Elements
         for (int i = 0; i < B.size(); i++) {
 		     Collections.sort(B);
 		}
		     System.out.println("Smallest Elements in the Array is : "+B.get(0));

		 System.out.println("+==========================================================+");

         
       //Find The Max Elements
         for (int i = 0; i < B.size(); i++) {
        	
 		     Collections.reverseOrder();
 		}
		     System.out.println("largest Elements in the Array is : "+B.get(B.size()-1));

		 System.out.println("+==========================================================+");

        for (Integer X : B) {
			System.out.println(X);
		}
		 System.out.println("+==========================================================+");

	}

}
