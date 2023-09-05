package com.corejava.week1GradedAssignment;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;


public class UserDao extends UserPojo {
	
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
			System.out.println("User Id: "+userId);
			System.out.println("User Name: "+userName);
			System.out.println("Email Id: "+emailId);
			System.out.println("Password: "+password);
			UserDao e=new UserDao(userId,userName,emailId,password);
			User.put(userCount, e);
		}
	}
	
	public void login() {
		System.out.println("enter the username and password to login");
		System.out.println("enter user name");
		String userName=sc.next();
		System.out.println("enter password");
		String password1=sc.next();
		for (int i = 0; i < User.size(); i++) {
			if(User.get(i).getUserName().equals(userName)) {
				if(User.get(i).getPassword().equals(password1)) {
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
	
	public void adduserBooks() {
		System.out.println("Please Enter the Book Id to Add Book to You List");
		int id=sc.nextInt();
		userBooksCount++;
		for (int i = 0; i < BooksDao.books.size(); i++) {
			if(BooksDao.books.get(i).getBookId()==id) {
				UserBooks.put(userBooksCount, BooksDao.books.get(i));
			}
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
	
	public void newBook() {
		System.out.println("new books list:");
		for (int i = 0; i < UserBooks.size(); i++) {

				LocalDate d1= LocalDate.now();
				LocalDate d2= UserBooks.get(i).getDate1();
				
				if((d1.compareTo(d2))==0) {
					System.out.println(UserBooks.get(i));
			}
				
				
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
