package com.corejava.week2GradedAssignment;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class BooksDao extends BooksPojo {

	public BooksDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BooksDao(int bookId, String bookName, String authorName, String description, LocalDate date1, char f,
			char c) {
		super(bookId, bookName, authorName, description, date1, f, c);
		// TODO Auto-generated constructor stub
	}

	static HashMap<Integer,BooksDao> books=new HashMap<Integer,BooksDao>();
	static int booksCount=-1;
	Scanner sc=new Scanner(System.in);
	static LocalDate loginDate =null;
    static LocalTime LoginTime=null;
    
	
	
	
	public void addBooks() {
		System.out.println("Please Enter how many Books"
				+ " Data you want to Add");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			booksCount++;
			System.out.println("User: "+booksCount);
			int bookId=(int)(Math.random()*1000);
			System.out.println("Please Enter Book Name");
			String bookName=sc.next();
			System.out.println("Please Enter Author Name");
			String authorName=sc.next();
			System.out.println("Please Enter Description of the Book");
			String description=sc.next();
			System.out.println("enter the Book date in format yy/mm/dd");
     		System.out.println("enter the Year");
     		int year=sc.nextInt();
     		System.out.println("enter the Month");
     		int month=sc.nextInt();
     		System.out.println("enter the Day");
     		int day=sc.nextInt();
     		LocalDate date1=LocalDate.of(year, month, day);
     		System.out.println("enter the F if Book is your Favourite Book");
     		char f=sc.next().charAt(0);
     		System.out.println("enter the c if Book is completed");
     		char c=sc.next().charAt(0);
			System.out.println("\n=================================================================");
			System.out.println("Book Id: "+bookId);
			System.out.println("Book Name: "+bookName);
			System.out.println("Author Name Id: "+authorName);
			System.out.println("Description: "+description);
			System.out.println("Date: "+date1);
			System.out.println("Favourite: "+f);
			System.out.println("Completed: "+c);
			System.out.println("\n=================================================================\n");
			BooksDao e=new BooksDao(bookId,bookName,authorName,description,date1,f,c);
			books.put(booksCount, e);
		}
	}
	
	public void deleteBooks() {
		System.out.println("Please Enter Book Id to Delete");
		int id=sc.nextInt();
		
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getBookId()==id) {
				books.remove(i);
				
			}
		}
		
	}
	
	public void updateBooks() throws CorrectId {
		System.out.println("Please Enter Book Id to Update");
		int id=sc.nextInt();
		int count=0;
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getBookId()==id) {
				count++;
				books.get(i).setBookId(id);
				System.out.println("Please Enter Book Name");
				String bookName=sc.next();
				books.get(i).setBookName(bookName);
				System.out.println("Please Enter Author Name");
				String authorName=sc.next();
				books.get(i).setAuthorName(authorName);
				System.out.println("Please Enter Description of the Book");
				String description=sc.next();
				books.get(i).setDescription(description);
				System.out.println("enter the Book date in format yy/mm/dd");
	     		System.out.println("enter the Year");
	     		int year=sc.nextInt();
	     		System.out.println("enter the Month");
	     		int month=sc.nextInt();
	     		System.out.println("enter the Day");
	     		int day=sc.nextInt();
	     		LocalDate date1=LocalDate.of(year, month, day);
	     		books.get(i).setDate1(date1);
	     		System.out.println("enter the F if Book is your Favourite Book");
	     		char f=sc.next().charAt(0);
	     		books.get(i).setF(f);
	     		System.out.println("enter the c if Book is completed");
	     		char c=sc.next().charAt(0);
	     		books.get(i).setC(c);
				System.out.println("\n=================================================================\n");
				System.out.println("Book Id: "+id);
				System.out.println("Book Name: "+bookName);
				System.out.println("Author Name Id: "+authorName);
				System.out.println("Description: "+description);
				System.out.println("Date: "+date1);
				System.out.println("Favourite: "+f);
				System.out.println("Completed: "+c);
				System.out.println("\n=================================================================\n");
			}
		}
		if(count==0) {
			throw new CorrectId();
		}
	}
	
	
	
	
	
	public void searchBooks() {
		int count=0;
		System.out.println("Please Enter Book Id to search");
		int id=sc.nextInt();
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getBookId()==id) {
				count++;
				System.out.println("Book Id" +id +"Present in the Book list");
			}
		}
		if(count==0) {
			System.out.println("Book Id" +id +"not Present in the Book list");
		}
	}
	
	public void bookDetails() {
	
		System.out.println("Please Enter Book Id to get Details of the Book");
		int id=sc.nextInt();
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getBookId()==id) {
				
				System.out.println(books.get(i));
			}
		}
		
	}
	
	public void displayBooks() {
		System.out.println("\n=================================================================\n");
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		System.out.println("\n=================================================================\n");
	}
	
	
}
