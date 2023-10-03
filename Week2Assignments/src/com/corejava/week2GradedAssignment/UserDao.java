package com.corejava.week2GradedAssignment;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;


public class UserDao extends UserPojo implements Runnable{
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(int userId, String userName, String emailId, String password) {
		super(userId, userName, emailId, password);
		// TODO Auto-generated constructor stub
	}
	
	static HashMap<Integer,UserDao> User=new HashMap<Integer,UserDao>();
	static int userCount=-1;
	static int userBooksCount=-1;
	Scanner sc=new Scanner(System.in);
	static HashMap<Integer,BooksDao> UserBooks=new HashMap<Integer,BooksDao>();
	
	static String loginname;//to know who logined in file data
	
	public void addUser() {
		System.out.println("Please Enter how many user Data you want to Add");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			userCount++;
			System.out.println("User: "+userCount);
			int userId=(int)(Math.random()*1000);
			System.out.println("Please Enter User Name");
			String userName=sc.next();
			System.out.println("Please Enter Email Id");
			String emailId=sc.next();
			System.out.println("Please Enter Pasword");
			String password=sc.next();
			System.out.println("\n=================================================================");
			System.out.println("User: "+userCount);
            System.out.println("User Id: "+userId);
			System.out.println("User Name: "+userName);
			System.out.println("Email Id: "+emailId);
			System.out.println("Password: "+password);
			UserDao e=new UserDao(userId,userName,emailId,password);
			System.out.println("\n=================================================================");

			User.put(userCount, e);
		}
	}
	
	@Override
	public void run() {
		

				try {
					login();
				} catch (LoginCredentials e) {
					System.out.println("Please Enter Correct User nmae Or Password");
				    run();
				}
				
			
				
	}
	public synchronized void login() throws LoginCredentials {
		System.out.println("enter the username and password to login");
		System.out.println("enter user name");
		String userName=sc.next();
		System.out.println("enter password");
		String password1=sc.next();
		int countOfLogin=0;
		for (int i = 0; i < User.size(); i++) {
			if(User.get(i).getUserName().equals(userName)&&(User.get(i).getPassword().equals(password1))) {
					System.out.println("logined sucessfully!!!!!!!!!!!!!!!!!!");
					countOfLogin++;
					
				}
				
		}
		loginname=userName;
		if(countOfLogin==0) {
			 System.out.println("============================================================\n");

				throw new LoginCredentials();
				
		}
	}
	
	public void adduserBooks() throws CorrectId {
		System.out.println("Please Enter the Book Id to Add Book to Your List");
		int id=sc.nextInt();
		int count=0;
		userBooksCount++;
		for (int i = 0; i < BooksDao.books.size(); i++) {
			if(BooksDao.books.get(i).getBookId()==id) {
				UserBooks.put(userBooksCount, BooksDao.books.get(i));
				count++;
			}
		
		}
		if(count==0) {
			throw new CorrectId();
		}
	}
	
	public void favouriteBooks() {
	
		for (int i = 0; i < UserBooks.size(); i++) {
			char fav='f';
			if(UserBooks.get(i).getF()==fav){
				System.out.println(UserBooks.get(i));
				
			}
		}
	}
	
	public void completedBooks() {
		
		for (int i = 0; i < UserBooks.size(); i++) {
			if(UserBooks.get(i).getC()=='c' ){
				System.out.println(UserBooks.get(i));
			}
		}
	}
	
	public void newBook() throws NewBookCheck {
		System.out.println("new books list:");
		int count=0;
		for (int i = 0; i < UserBooks.size(); i++) {

				LocalDate d1= LocalDate.now();
				LocalDate d2= UserBooks.get(i).getDate1();
				
				if((d1.compareTo(d2))==0) {
					System.out.println(UserBooks.get(i));
					count++;
				}		
		}
		if(count==0) {
			throw new NewBookCheck();
		}
	}

	
	public void displayUser() {
		System.out.println("\n=================================================================\n");
		for (int i = 0; i < User.size(); i++) {
			System.out.println(User.get(i));
		}
		System.out.println("\n=================================================================\n");
	}
	
	public void displayUserBooks() {
		System.out.println("\n=================================================================\n");
		for (int i = 0; i < UserBooks.size(); i++) {
			System.out.println(UserBooks.get(i));
		}
		System.out.println("\n=================================================================\n");
	}

	
	
	
}
