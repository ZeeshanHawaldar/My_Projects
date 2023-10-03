package com.corejava.week2Day3andDay4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;



public class StackImplementation {

	public static void main(String[] args) {
		//Declaration of Stack
		Stack<String> s=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		
		//Adding Stack Elements
		System.out.println("Enter how many elements you want to Add");
		int n=sc.nextInt();
		
		System.out.println("Adding Elements..........................");
		for (int i = 0; i <n; i++) {
			s.push(sc.next());
		}
		
		
		
		System.out.println("=======================================================");
		System.out.println("Printing Stack elements");
		for (int i = 0; i <s.size(); i++) {
			System.out.println(s.get(i));
		}
		System.out.println("=======================================================");
	
		//creating Iterator
		@SuppressWarnings("rawtypes")
		Iterator I=s.iterator();
		
		System.out.println("=======================================================");
		System.out.println("Printing Stack elements using Iterator");
		while(I.hasNext()){
			System.out.println(I.next()+" ");
		}
		System.out.println("=======================================================");
		sc.close();
	}

	
}
