package com.corejava.week1Day4;

import java.util.ArrayList;

import java.util.Scanner;

public class TaskDao extends TaskPojo{
	static ArrayList<TaskDao> A;
	static ArrayList<TaskDao> V;
	static ArrayList<Integer> I;
	Scanner sc=new Scanner(System.in);
	public TaskDao() {
		super();
	
	}

	public TaskDao(int taskId, String taskTitle, String taskText, String assignedTo) {
		super(taskId, taskTitle, taskText, assignedTo);
		// TODO Auto-generated constructor stub
	}

	
	
	public void addTask() {
    	System.out.println("enter how many Tasks you want to add");
     	int n=sc.nextInt();
     	A=new ArrayList<TaskDao>(n);
     	for(int i=0,j=1;i<n;i++,j++)
 			{
     		System.out.println("Task :" +(j));
     		int taskId=(int)(Math.random()*100);
     		System.out.println("enter the Task Tiltle");
     		String taskTitle=sc.next();
     		System.out.println("enter the Task Text");
     		String taskText=sc.next();
     		System.out.println("enter the name whome you want to assign the Task");
     		String assignTo=sc.next();
     		System.out.println("============================================================\n");
     		System.out.println("Task Id:"+taskId);
			System.out.println("Task Title:"+taskTitle);
			System.out.println("Task Text:"+taskText);
			System.out.println("Task assigned to :"+assignTo);
			System.out.println("============================================================\n");
     		TaskDao t=new TaskDao(taskId,taskTitle,taskText,assignTo); 
     		A.add(t);
     		
 			}
	}
     	
	public void deleteTask() {
    	System.out.println("enter Task Id which you want to delete");
     	 int id=sc.nextInt();
     	 for (int i = 0; i < A.size(); i++) {
 			if(A.get(i).getTaskId()==id) {
        A.remove(i);
 			}
     	 }
     	System.out.println("============================================================\n");
        System.out.println("Task Removed");
        System.out.println("============================================================\n");
	}
     	
	public void updateTask() {
    	System.out.println("enter Task Id which you want to Update");
     	int  id=sc.nextInt();
     	 for (int i = 0; i < A.size(); i++) {
			if(A.get(i).getTaskId()==id) {
				System.out.println(A.get(i).getTaskId());
				System.out.println(id);
				
				System.out.println("enter the Task Tiltle");
				String taskTitle=sc.next();
				
				A.get(i).setTaskTitle(taskTitle);
				System.out.println(A.get(i).getTaskTitle());
		 		String taskText=sc.next();
		 		A.get(i).setTaskTitle(taskText);
		 		System.out.println("enter the name whome you want to assign the Task");
		 		String assignTo=sc.next();
		 		A.get(i).setTaskTitle(assignTo);
		 		
		 		
		 		TaskDao d=new TaskDao(id,taskTitle,taskText,assignTo);
		 		A.set(i, d);
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
     	 for (int i = 0; i < A.size(); i++) {
			if(A.get(i).getTaskId()==id) { 
				System.out.println("============================================================\n");
				System.out.println(A.get(i)+ "\n is present in To Do List ");
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
		System.out.println("enter how many Tasks you want to add to Visitor");
     	int n=sc.nextInt();
     	int visitorelements;
     	I=new ArrayList<Integer>(n);
     	 V=new ArrayList<TaskDao>(n);
     	System.out.println("Enter Tasks Id");
     	for (int i = 0; i <n ; i++) {
     		System.out.println("entering elements");
     		visitorelements=sc.nextInt();
			I.add(visitorelements);
		}
     	for(int i=0;i<A.size();i++)
 			{
     		for (int j = 0; j < n; j++) {
     			int k=0;
     			if(A.get(i).getTaskId()==I.get(j)) {
     				TaskDao t=A.get(i);
         			V.add(k,t);
         		}
			}
     		
     		}
     	
	}
     	
	
	public void displayVisitorTasks() {
      	System.out.println("============================================================\n");
      	System.out.println("********list of Tasks assigned to Visitor********\n");
      	for (int i = 0; i < V.size(); i++) {
      		System.out.println(V.get(i) + " ");
  		}
      	System.out.println("\n============================================================\n");
	}

	 public void display1() {
      	System.out.println("============================================================\n");
      	System.out.println("********list of Tasks present in ToDo Manager********\n");
      	for (int i = 0; i < A.size(); i++) {
      		System.out.println(A.get(i) + " ");
  		}
      	System.out.println("\n============================================================\n");
      	
      	
      	
      

    }

	
	

	
}
