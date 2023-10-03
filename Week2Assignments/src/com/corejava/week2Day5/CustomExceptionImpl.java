package com.corejava.week2Day5;

import java.util.ArrayList;
import java.util.Scanner;

class CustomException extends Exception{

	private static final long serialVersionUID = 1L;

	
}


class FruitChecker{
	static int count=0;
public void checkFruit(String fruit, ArrayList<String> fruits) throws CustomException {
	
	for (int i = 0; i < fruits.size();i++) {
		if(fruits.get(i).equals(fruit)) {
			count++;
		 throw new CustomException();   
		}
		
	}  
   if(count==0) {
	   System.out.println("Adding "+fruit+" in The List");
		fruits.add(fruit);
   }
	
	
}	

}

public class CustomExceptionImpl{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> fruits=new ArrayList<String>();
	
	
	
	public static void main(String[] args)  {
		FruitChecker f=new FruitChecker();
		System.out.println("How Many Fruits You Want To Add");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			fruits.add(sc.next());
		}
		
		System.out.println("==========================================================");
		System.out.println("Fruits Present in the List");
		for (int i = 0; i < n; i++) {
			System.out.println(fruits.get(i));  
		}
		System.out.println("==========================================================");
        
		System.out.println("Add new Fruit");
		String fruit=sc.next();
		try {
			f.checkFruit(fruit, fruits);
		} catch (CustomException e) {
		    System.out.println(e);
			System.out.println(fruit+" Fruit Already Present in The List");
		}
		
		System.out.println("==========================================================");

		System.out.println("Fruits List After Adding Fruits");
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));  
		}
		System.out.println("==========================================================");
        
	}

	}

