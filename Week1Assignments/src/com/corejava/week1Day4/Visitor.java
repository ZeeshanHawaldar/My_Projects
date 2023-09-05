package com.corejava.week1Day4;

import java.util.Scanner;

public interface Visitor {

	  TaskDao t=new TaskDao();
      UserDao u=new UserDao();
	public static void visitorMenu() {
		 System.out.println("***************WELCOME TO Do Manager APP***************");
		 TaskDao app=new TaskDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {
               
				System.out.println("1.Tasks Assigned To you");
				System.out.println("0. Return To Main menu");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				
				    case 1:app.displayVisitorTasks();
					       break;
					
					case 0:
						   TaskManagerMain.main(null);
						
				}
				
				System.out.println("Would you like to continue?(yes/no)");
			
				s=sc.next();
				
				
			}while(s.equals("yes"));
			sc.close();


		}
	
	
	
	
	
	
	
}
