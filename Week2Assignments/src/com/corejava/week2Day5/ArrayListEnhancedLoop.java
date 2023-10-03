package com.corejava.week2Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEnhancedLoop {
   static  Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> A=new ArrayList<String>();
		System.out.println("How Many Elements You want To Add");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			A.add(sc.next());
		}
		
		System.out.println("=================================================");
		System.out.println("Printing Array List Elements Using Enhanced Loop");
		System.out.println("=================================================");
        for (String X:A) {
			System.out.println(X+"");
		}
		System.out.println("=================================================");
	}
	
	
	
	
	
}
