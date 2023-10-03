

package com.corejava.week2GradedAssignment;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface MagicOfBooks {
	static LocalDate loginDate =null;
    static LocalTime LoginTime=null;
        

	 public static void main(String[] args) throws InputMismatchException, IOException {
			String name = null;
  
		 UserDao app=new UserDao();
		   Thread login=new Thread(app);
		 FileWriter fw=new FileWriter("MyFile1.txt",true);
		 BooksDao b=new BooksDao();
		Scanner sc=new Scanner(System.in);
		 int choice=0;
			String s="yes";
			do {
				 System.out.println("***************WELCOME TO MAGIC OF BOOKS APP***************");
                System.out.println("1. Add user details in app");
				System.out.println("2. for User login");
				System.out.println("3. Add books to app resource");
				System.out.println("4. Add books to user list");
				System.out.println("5. To show new books");
				System.out.println("6. To show favourite books");
				System.out.println("7. To check completed books list");
				System.out.println("8. To get Any random Book details");
				System.out.println("9. Log out");
				System.out.println("0. Exit.");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				
				    case 1:app.addUser();
				           app.displayUser();
					       break;
					case 2:
						;
					try {
						
						login.start();
						LocalDate date=LocalDate.now();
						LocalTime time=LocalTime.now();
						name =UserDao.loginname;
						String l=name+" logined at "+date+" "+time+"\n";
						fw.append(l);
						fw.flush();
						
						login.join();
					} catch (Exception e) {
					   System.out.println("Please Log out First!!");
					}
					    break;
					       
					case 3:b.addBooks();
					       b.displayBooks();
						   break;
						   
					case 4:try {
						app.adduserBooks();
					} catch (CorrectId e) {
						System.out.println("Please Enter Correct Book Id To add User Book");
					}
					       app.displayUserBooks();
						   break;
						   
					case 5:try {
						app.newBook();
					} catch (NewBookCheck e) {
						System.out.println("No New Books are Present in The List");
					}
						   break;
						   
					case 6:app.favouriteBooks();
					       break;
					       
					case 7:app.completedBooks();
					       break;
					       
					case 8:b.bookDetails();
					       break;
					       
					case 9:
							fw.write(name+" logged out at "+LocalDate.now()+" "+LocalTime.now()+"\n");
							fw.flush();
							Thread.interrupted();
						       System.out.println("Logged Out Sucessfully!!!!!!!!!!!!!!!!!!\n");
					       MagicOfBooks.main(null);
						    
					case 0:
						
						fw.close();
						System.exit(1);
						
					default:System.out.println("Please Enter Valid Choice from above list\n");
						
				}
				
				System.out.println("\n Would you like to continue?(yes/no) \n");
				s=sc.next();
			}while(s.equals("yes"));
			sc.close();
			MagicOfBooks.main(null);
		}
	 

}
