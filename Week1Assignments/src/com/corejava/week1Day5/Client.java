package com.corejava.week1Day5;


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
                
				System.out.println("1. Register");
				System.out.println("2. login");
				System.out.println("3. Add the Task");
				System.out.println("4. Update the Task");
				System.out.println("5. Delete the Task");
				System.out.println("6. Search the task");
				System.out.println("7. Assign task to vistor");
				System.out.println("8. Assign completion Date to task");
				System.out.println("9. Arrange Tasks in ascending order by Date");
				System.out.println("10. Arrange Tasks in descending order by Date");
				System.out.println("0. Return to main Menu");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				
				switch(choice)
				{
				     case 1:app.addClient();
				            app.diplayClient();
				            break;
				            
				     case 2:app.login(UserDao.C);
			                app.diplayClient();
			                break;
			                
				    case 3:app.addTask();
				           app.display1();
					       break;
					case 4:app.updateTask();
					       app.display1();
					       break;
					case 5:app.deleteTask();
					       app.display1();
						   break;
					case 6:app.searchTask();
					        break;
					case 7:app.visitorTasks();
						   app.displayVisitorTasks();
					       break;
					case 8:app.completionDate();;
					       app.display1();
				            break;
					case 9:app.tasksIncreasingOrder(TaskDao.tasksArray);;
					      
				            break;
					case 10:app.tasksDecreasingOrder(TaskDao.tasksArray);
					        
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
	

