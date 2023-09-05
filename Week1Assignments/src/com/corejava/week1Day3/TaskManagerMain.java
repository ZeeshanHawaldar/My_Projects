package com.corejava.week1Day3;

import java.util.Scanner;

public class TaskManagerMain {

	 public static void main(String[] args) {
		 System.out.println("***************WELCOME TO MAGIC OF BOOKS APP***************");
		 TaskDao app=new TaskDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {

				System.out.println("1. Add Tasks to Tasks List");
				System.out.println("2. Update the Tasks");
				System.out.println("3. Delete the Task");
				System.out.println("4. Search the task");
				System.out.println("0. Exit.");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				
				    case 1:app.addTask();
				           app.display1();
					       break;
					case 2:app.updateTask();
					       app.display1();
					       break;
					case 3:app.deleteTask();
					       app.display1();
						   break;
					case 4:app.searchTask();
					       
						   break;
					
					case 0:
						System.exit(1);
						
				}
				
				System.out.println("Would you like to continue?(yes/no)");
			
				s=sc.next();
				
				
			}while(s.equals("yes"));
			sc.close();


		}

	
}
