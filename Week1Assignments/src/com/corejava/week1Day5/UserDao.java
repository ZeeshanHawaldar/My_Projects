package com.corejava.week1Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDao extends UserPojo  {
     Scanner sc=new Scanner(System.in);
	static ArrayList<UserDao> C=new ArrayList<UserDao>();
	static ArrayList<UserDao> V=new ArrayList<UserDao>();
	static int clientCount=0;
	static int visitorCount=100;
	UserDao(){
		
	}
	
	
	
	public UserDao(int userId, String userName, String emailid, String password) {
		super(userId, userName, emailid, password);
		// TODO Auto-generated constructor stub
	}


    
 
	
	
	
	
	public void addClient() {
		
	    	System.out.println("enter how many Clients you want to add");
	     	int n=sc.nextInt();
	     	
	     	for(int i=0;i<n;i++)
 			{
	     		clientCount++;
     		System.out.println("User :" +clientCount);
     		System.out.println("enter the User Name");
     		String userName=sc.next();
     		System.out.println("enter the emailid");
     		String emailid=sc.next();
     		System.out.println("enter the password ");
     		String password=sc.next();
     		int userId=(int)(Math.random()*1000);
			System.out.println("User id:"+userId);
			System.out.println("User Name:"+userName);
			System.out.println("Email id:"+emailid);
			System.out.println("Password:"+password);
     		UserDao e=new UserDao(userId,userName,emailid,password);
     		C.add(e);
 			}
	
		}
	
	public void addVisitor() {
		
    	System.out.println("enter how many Clients you want to add");
     	int n=sc.nextInt();
     	
     	for(int i=0;i<n;i++)
			{
     		visitorCount++;
 		System.out.println("User :" +visitorCount);
 		System.out.println("enter the User Name");
 		String userName=sc.next();
 		System.out.println("enter the emailid");
 		String emailid=sc.next();
 		System.out.println("enter the password ");
 		String password=sc.next();
 		int userId=visitorCount;
		System.out.println("User id:"+userId);
		System.out.println("User Name:"+userName);
		System.out.println("Email id:"+emailid);
		System.out.println("Password:"+password);
 		UserDao e=new UserDao(userId,userName,emailid,password);
 		V.add(e);
 		
			}

	}
	
	public void login(ArrayList<UserDao> U) {
		System.out.println("enter the username and password to login");
		System.out.println("enter user name");
		String userName1=sc.next();
		System.out.println("enter password");
		String password1=sc.next();
		for (int i = 0; i < U.size(); i++) {
			if(U.get(i).getUserName().equals(userName1)) {
				if(U.get(i).getPassword().equals(password1)) {
					System.out.println("logined sucessfully!!!!!!!!!!!!!!!!!!");
					break;
				}
				else {
					System.out.println("plz enter correct password");
					System.exit(0);
				}
			}
			else {
				System.out.println("plz enter correct username");
				System.exit(0);
			}
		}
		
	}

	
	 public void diplayClient() {
		 System.out.println("============================================================\n");
	      	System.out.println("********list of Tasks present in ToDo Manager********\n");
	      	for (int i = 0; i < C.size(); i++) {
	      		System.out.println(C.get(i) + " ");
	  		}
	      	System.out.println("\n============================================================\n");
	 }
	
	 public void diplayVisitor() {
		 System.out.println("============================================================\n");
	      	System.out.println("********list of Tasks present in ToDo Manager********\n");
	      	for (int i = 0; i < V.size(); i++) {
	      		System.out.println(V.get(i) + " ");
	  		}
	      	System.out.println("\n============================================================\n");
	 }
	
}
