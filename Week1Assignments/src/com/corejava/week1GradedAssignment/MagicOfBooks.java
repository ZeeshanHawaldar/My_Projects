package com.corejava.week1GradedAssignment;

import java.util.Scanner;

public interface MagicOfBooks {
	

	 public static void main(String[] args) {
		 System.out.println("***************WELCOME TO MAGIC OF BOOKS APP***************");
		 UserDao app=new UserDao();
		 BooksDao b=new BooksDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {
				System.out.println("1. Add user details in app");
				System.out.println("2. for User login");
				System.out.println("3. Add books to app resource");
				System.out.println("4. Add books to user list");
				System.out.println("5. To show new books");
				System.out.println("6. To show favourite books");
				System.out.println("7. To check completed books list");
				System.out.println("8. To get Any random Book details");
				System.out.println("0. Exit.");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				
				    case 1:app.addUser();
				           app.displayUser();
					       break;
					case 2:app.login();
					       break;
					case 3:b.addBooks();
					       b.displayBooks();
						   break;
					case 4:app.adduserBooks();
					       app.displayUserBooks();
						   break;
					case 5:app.newBook();
						   break;
					case 6:app.favouriteBooks();
					       break;
					case 7:app.completedBooks();
					       break;
					case 8:b.bookDetails();
					       break;
					case 0:
						System.exit(1);
						
				}
				
				System.out.println("Would you like to continue?(yes/no)");
				s=sc.next();
			}while(s.equals("yes"));
			sc.close();
		}
		

}
