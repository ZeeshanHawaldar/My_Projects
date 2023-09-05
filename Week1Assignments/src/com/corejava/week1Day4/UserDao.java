package com.corejava.week1Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDao extends UserPojo  {
     Scanner sc=new Scanner(System.in);
	ArrayList<UserDao> U;
	
	UserDao(){
		
	}
	
	UserDao(String userName,String password){
		super(userName,password);
	}
	
	public void login() {
		System.out.println("Please enter the User name");
		String userName=sc.next();
		if(userName.equals("zeeshan")) {
			System.out.println("Please enter the Password");
			String password=sc.next();
			if(password.equals("zee123")) {
				System.out.println("Logined Sucessfully!!!!!!!!!!!!");
			}
			else {
				System.out.println("Please enter correct password");
				System.exit(1);
			}
		}
		System.out.println("Please enter Correct User Name");
	}
	
	

	
	
	
	
	
	
}
