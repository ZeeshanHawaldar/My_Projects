package com.corejava.week1Day1;

import java.util.Scanner;

public class ToDoManager_Week1Day1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("User please enter your name");
	String name=sc.nextLine();
	System.out.println(name+"\n");
	
	String[] list= {"Exercise","Prayer","Reading","chores","Hobby","Reading"};
	System.out.println("=======================================");
	System.out.println("ToDo list in Ascending order");
	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
	System.out.println("=======================================");
	System.out.println("ToDo list in Decending order");
	for (int i =list.length-1; i > 0; i--) {
		System.out.println(list[i]);
	}
	
	System.out.println("=======================================");
	System.out.println("Repeated Tasks in ToDo");
	for (int i = 0; i < list.length; i++) {
		for (int j = i+1; j < list.length; j++) {
			if(list[i].equals(list[j])) {
				count++;
				System.out.println("Reapetative tasks are present");
			}
		}
	}
	
	if(count==0) {
		System.out.println("Reapetative tasks are not present");
	}
	sc.close();
	}

}
