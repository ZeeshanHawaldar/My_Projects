package com.corejava.week1Day4;

import java.util.Scanner;

public interface Client{
       TaskDao t=new TaskDao();
       UserDao u=new UserDao();
       
	public static void clientMenu() {
		 System.out.println("***************WELCOME TO Do Manager APP***************");
		 TaskDao app=new TaskDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {
                
				System.out.println("1. Add Tasks to Tasks List");
				System.out.println("2. Update the Tasks");
				System.out.println("3. Delete the Task");
				System.out.println("4. Search the task");
				System.out.println("5. Add vistor task");
				System.out.println("0. Return to main Menu");
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
					case 5:app.visitorTasks();
						   app.displayVisitorTasks();
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
	

