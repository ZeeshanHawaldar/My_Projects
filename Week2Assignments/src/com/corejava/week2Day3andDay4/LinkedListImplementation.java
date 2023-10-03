package com.corejava.week2Day3andDay4;

import java.util.Collections;
import java.util.LinkedList;

import java.util.Scanner;

public class LinkedListImplementation {

	@SuppressWarnings("rawtypes")
	static LinkedList L=new LinkedList();
	static Scanner sc = new Scanner(System.in);
	 
		public static boolean checkInteger(Scanner sc) {	  
			if(sc.hasNextInt()) {
				System.out.println("Integer");
			   return true;
			}
			else
			{
				return false;
			}
			
		} 
	
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			System.out.println("How many elements you want to Add");
			int n=sc.nextInt();
			System.out.println("Adding Elements!!!!!!!!!!!!!!!!!!!!");
			for (int i = 0; i < n; i++) {
				
				if(checkInteger(sc)) {
					L.add(sc.nextInt());
				}
				else {
					System.out.println("please enter Integer elements");
					System.exit(0);
				}
			}
			
			System.out.println("============================================");
			System.out.println("Linked List elements");
			for (int i = 0; i < L.size(); i++) {
				System.out.println(L.get(i));
			}
			System.out.println("============================================");
            sc.close();
            
            System.out.println("============================================");
			System.out.println("Sorting Linked List elements in Ascending Order");
			Collections.sort(L);
			for (int i = 0; i < L.size(); i++) {
				System.out.println(L.get(i));
			}
			System.out.println("============================================");
            
			 System.out.println("============================================");
				System.out.println("Sorting Linked List elements in Descending Order");
				
				Collections.reverse(L);
				for (int i = 0; i < L.size(); i++) {
					System.out.println(L.get(i));
				}
				System.out.println("============================================");
				sc.close();
		}
	
	
}
