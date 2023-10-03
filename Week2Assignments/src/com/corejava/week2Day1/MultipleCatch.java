package com.corejava.week2Day1;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("enter integer value");
		int x=sc.nextInt();
          int y=x/0;
          System.out.println(y);
		
		System.out.println("Enter how many elements you want to add to the array");
		int n=sc.nextInt();
		Integer[] A=new Integer[n];
		System.out.println("enter Array Elements");
		for (int i = 0; i < A.length; i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("enter the index of element you want to print");
		int index=sc.nextInt();
		System.out.println(A[index]);
		sc.close();
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch(Exception e3) {
			System.out.println(e3);
		}
	}
	
	
	
}
