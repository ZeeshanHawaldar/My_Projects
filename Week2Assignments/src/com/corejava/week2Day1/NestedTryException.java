package com.corejava.week2Day1;

import java.util.Scanner;

public class NestedTryException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Please enter how many elements you want to add to the Array");
		int n=sc.nextInt();
		int x=0;
		try {
			Integer[] A=new Integer[n];
			for (int i = 0; i < A.length; i++) {
				A[i]=sc.nextInt();
				
			}
			System.out.println("enter the index which element you want from array");
			int z=sc.nextInt();
			System.out.println(A[z]);
				try {
					int y=A[0]/x;
					System.out.println(y);
				} catch (ArithmeticException e) {
					System.out.println("Arithmetic Exception");
				}
				
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exceptions");
		}
		sc.close();
	}

}
