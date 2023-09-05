package com.corejava.week1Day4;

import java.util.Scanner;

public interface TaskManagerMain {
	
	
	public static void main(String[] args) {
		 
			 System.out.println("***************WELCOME TO Do Manager APP***************");
			 UserDao d=new UserDao();
				Scanner sc=new Scanner(System.in);
			 char choice=0;
				String s="yes";
				do {
					
					System.out.println("C. Enter C if you are Client ");
					System.out.println("V. Enter V if you are Client ");
					System.out.println("0. Exit.");
					System.out.println("Enter your choice");
					choice=sc.next().charAt(0);
					switch(choice)
					{
					
					    case 'C':d.login();
					    	    Client.clientMenu();
						       break;
						case 'V':d.login();
							   Visitor.visitorMenu();
						       break;
						
						case '0':
							System.exit(1);
							
					}
					
					System.out.println("Would you like to continue?(yes/no)");
				
					s=sc.next();
					
					
				}while(s.equals("yes"));
				sc.close();

			  
			
	      }
		
	}
		 

