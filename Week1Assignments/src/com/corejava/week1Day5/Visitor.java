package com.corejava.week1Day5;


import java.util.ArrayList;
import java.util.Scanner;

public interface Visitor {

	  TaskDao t=new TaskDao();
      UserDao u=new UserDao();
    static ArrayList<TaskDao> visitorlist=new ArrayList<TaskDao>();
	public static void visitorMenu() {
		 System.out.println("***************WELCOME TO Do Manager APP***************");
		 TaskDao app=new TaskDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {
				System.out.println("1.Register");
				System.out.println("2.login");
				System.out.println("3.Tasks Assigned To you");
				System.out.println("4.Tasks status");
				System.out.println("5.Tasks sorted in ascending order by Date");
				System.out.println("6.Tasks sorted in Descending order by Date");
				System.out.println("0. Return To Main menu");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				
				    case 1:app.addVisitor();
				           app.diplayVisitor();
					       break;
					       
				    case 2:app.login(UserDao.V);
				           break;
				           
				    case 3:app.displayVisitorTasks();
				           break;
				           
				    case 4:app.completionStatus();
				           break;
				           
				    case 5:System.out.println("Enter user Id whose tasks list you want in Ascending order");
				    	   int id=sc.nextInt();
				           for (int i = 0; i < TaskDao.tasksArray.size(); i++) {
						    if(TaskDao.tasksArray.get(i).getAssignedTo()==id) {
						    	
						    	visitorlist.add(TaskDao.tasksArray.get(i));
						    
						    }
					}
				    	   app.tasksIncreasingOrder(visitorlist);
				           
				           break;
				      
				    case 6:  System.out.println("Enter user Id whose tasks list you want in Ascending order");
			    	         int id1=sc.nextInt();
			    	        
			                 for (int i = 0; i < TaskDao.tasksArray.size(); i++) {
					        if(TaskDao.tasksArray.get(i).getAssignedTo()==id1) {
					        	visitorlist.add(TaskDao.tasksArray.get(i));
					    }
				}
				    	app.tasksDecreasingOrder(TaskDao.tasksArray);
			          
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
