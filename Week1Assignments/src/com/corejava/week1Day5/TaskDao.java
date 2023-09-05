package com.corejava.week1Day5;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class TaskDao extends TaskPojo implements Comparable<TaskDao>{
	static ArrayList<TaskDao> tasksArray=new ArrayList<TaskDao>();;
	
   static int taskCount=0;
	static ArrayList<Integer> I;
	Scanner sc=new Scanner(System.in);
	static List<TaskDao> L;
	
	
	public TaskDao() {
		super();
	
	}

	public TaskDao(int taskId, String taskTitle, String taskText, int assignedTo,LocalDate d,char completed) {
		super(taskId, taskTitle, taskText, assignedTo, d, completed);
		// TODO Auto-generated constructor stub
	}

	
	
	public void addTask() {
    	System.out.println("enter how many Tasks you want to add");
     	int n=sc.nextInt();
     	
     	for(int i=0;i<n;i++)
 			{
     		 taskCount++;
     		System.out.println("Task :" +(taskCount));
     		int taskId=(int)(Math.random()*100);
     		System.out.println("enter the Task Tiltle");
     		String taskTitle=sc.next();
     		System.out.println("enter the Task Text");
     		String taskText=sc.next();
     		System.out.println("enter the user Id whome you want to assign the Task");
     		int assignTo=sc.nextInt();
     		System.out.println("enter the completion date in format yy/mm/dd");
     		System.out.println("enter the Year");
     		int year=sc.nextInt();
     		System.out.println("enter the Month");
     		int month=sc.nextInt();
     		System.out.println("enter the Day");
     		int day=sc.nextInt();
     		LocalDate d=LocalDate.of(year, month, day);
     		System.out.println("enter the c if task completed");
     		char completed=sc.next().charAt(0);
     		
     		System.out.println("============================================================\n");
     		System.out.println("Task Id:"+taskId);
			System.out.println("Task Title:"+taskTitle);
			System.out.println("Task Text:"+taskText);
			System.out.println("Task assigned to :"+assignTo);
			System.out.println("Task Completed date :"+d);
			System.out.println("Task Completed status :"+completed);
			System.out.println("============================================================\n");
     		TaskDao t=new TaskDao(taskId,taskTitle,taskText,assignTo,d,completed); 
     		tasksArray.add(t);
     		
 			}
	}
     	
	public void deleteTask() {
    	System.out.println("enter Task Id which you want to delete");
     	 int id=sc.nextInt();
     	 for (int i = 0; i < tasksArray.size(); i++) {
 			if(tasksArray.get(i).getTaskId()==id) {
 				tasksArray.remove(i);
 			}
     	 }
     	System.out.println("============================================================\n");
        System.out.println("Task Removed");
        System.out.println("============================================================\n");
	}
     	
	public void updateTask() {
    	System.out.println("enter Task Id which you want to Update");
     	int  id=sc.nextInt();
     	 for (int i = 0; i < tasksArray.size(); i++) {
			if(tasksArray.get(i).getTaskId()==id) {
				System.out.println(tasksArray.get(i).getTaskId());
				System.out.println(id);
				
				System.out.println("enter the Task Tiltle");
				String taskTitle=sc.next();
				tasksArray.get(i).setTaskTitle(taskTitle);
				System.out.println(tasksArray.get(i).getTaskTitle());
		 		String taskText=sc.next();
		 		tasksArray.get(i).setTaskText(taskText);
		 		System.out.println("enter the name whome you want to assign the Task");
		 		int assignTo=sc.nextInt();
		 		tasksArray.get(i).setAssignedTo(assignTo);
		 		
		 		System.out.println("enter the completion date in format yy/mm/dd");
	     		System.out.println("enter the Year");
	     		int year=sc.nextInt();
	     		System.out.println("enter the Month");
	     		int month=sc.nextInt();
	     		System.out.println("enter the Day");
	     		int day=sc.nextInt();
	     		LocalDate d=LocalDate.of(year, month, day);
	     		tasksArray.get(i).setD(d);
	     		System.out.println("enter the c if task completed");
	     		char completed=sc.next().charAt(0);
	     		tasksArray.get(i).setCompleted(completed);
		 		TaskDao t=new TaskDao(id,taskTitle,taskText,assignTo,d,completed);
		 		tasksArray.set(i, t);
			}
		}
     	System.out.println("============================================================\n");
        System.out.println("Task Updated");
        System.out.println("============================================================\n");
	}	
     	
	public void   searchTask() {
    	System.out.println("enter Task Id which you want to search");
     	int id=sc.nextInt();
     	int count=0;
     	 for (int i = 0; i < tasksArray.size(); i++) {
			if(tasksArray.get(i).getTaskId()==id) { 
				System.out.println("============================================================\n");
				System.out.println(tasksArray.get(i)+ "\n is present in To Do List ");
				System.out.println("============================================================\n");
				count++;
			}
     	 }
     	 
	if(count==0) {
     			System.out.println("============================================================\n");
				System.out.println("Not present in To Do List ");
				System.out.println("============================================================\n");
			}
     		
     	
      	
	}
	
	
	public void visitorTasks() {
		System.out.println("enter user id whome you want to assign this task");
     	int newassign=sc.nextInt();
		System.out.println("enter how many Tasks you want to add to Visitor");
     	int n=sc.nextInt();
     	int visitorelements;
     	I=new ArrayList<Integer>(n);
     
     	System.out.println("Enter Tasks Id which you want to assign to visitor");
     	for (int i = 0; i <n ; i++) {
     		System.out.println("entering elements");
     		visitorelements=sc.nextInt();
			I.add(visitorelements);
		}
     	
     	for(int i=0;i<tasksArray.size();i++)
 			{
     		for (int j = 0; j < n; j++) {
     		
     			if(tasksArray.get(i).getTaskId()==I.get(j)) {
     				tasksArray.get(i).setAssignedTo(newassign);
         		}
			}
     		
     		}
     	
	}
     	
	
	public void displayVisitorTasks() {
		System.out.println("enter user id whose task list you want");
     	int newassign=sc.nextInt();
      	System.out.println("============================================================\n");
      	System.out.println("********list of Tasks assigned to Visitor********\n");
      	for (int i = 0; i < tasksArray.size(); i++) {
      		if(tasksArray.get(i).getAssignedTo()==newassign)
      		System.out.println(tasksArray.get(i) + " ");
  		}
      	System.out.println("\n============================================================\n");
	}

	 public void display1() {
      	System.out.println("============================================================\n");
      	System.out.println("********list of Tasks present in ToDo Manager********\n");
      	for (int i = 0; i < tasksArray.size(); i++) {
      		System.out.println(tasksArray.get(i) + " ");
  		}
      	System.out.println("\n============================================================\n");
      	
      }

	 public void tasksIncreasingOrder(ArrayList<TaskDao> A) {
		
			Collections.sort(A);
			System.out.println("\n============================================================\n");
			System.out.println("Tasks map by Date...");
			for(TaskDao o:A)
				System.out.println("value = "+o);
			System.out.println("\n============================================================\n");
	     }

	 
	 
	 public void tasksDecreasingOrder(ArrayList<TaskDao> A) {
	    	Collections.reverse(A);
	 }
	 
	 
	 public void completionDate(){
		 System.out.println("enter the user Id and task id for which you want to assign completion date");
		 int  userid=sc.nextInt();
	     	int  taskid=sc.nextInt();
	     	 for (int i = 0; i < tasksArray.size(); i++) {
				if(tasksArray.get(i).getAssignedTo()==userid&&tasksArray.get(i).getTaskId()==taskid) {
					
			 		
			 		System.out.println("enter the completion date in format yy/mm/dd");
		     		System.out.println("enter the Year");
		     		int year=sc.nextInt();
		     		System.out.println("enter the Month");
		     		int month=sc.nextInt();
		     		System.out.println("enter the Day");
		     		int day=sc.nextInt();
		     		LocalDate d=LocalDate.of(year, month, day);
		     		tasksArray.get(i).setD(d);
		     		
			 		
				}
			}
	     	System.out.println("============================================================\n");
	        System.out.println("Date Updated");
	        System.out.println("============================================================\n");
	 }
	 
	 public void completionStatus(){
			System.out.println("enter the user Id and task id for which you want to assign status as completed");
	     	int  userid=sc.nextInt();
	     	int  taskid=sc.nextInt();
	     	 for (int i = 0; i < tasksArray.size(); i++) {
				if(tasksArray.get(i).getAssignedTo()==userid&&tasksArray.get(i).getUserId()==taskid) {
					
			 		
			 		System.out.println("enter the completion status as c");
		     		char ch='c';
		     		tasksArray.get(i).setCompleted(ch);
		     		
			 		
				}
			}
	     	System.out.println("============================================================\n");
	        System.out.println("status Updated");
	        System.out.println("============================================================\n");
	 }
	 
	 
	

	@Override
	public int compareTo(TaskDao o) {
		
		int res=o.getD().compareTo(this.getD());
		return res;

	}

	
		
	
}
