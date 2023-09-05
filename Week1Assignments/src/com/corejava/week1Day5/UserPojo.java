package com.corejava.week1Day5;

public class UserPojo {

	private String userName;      //to store user name//
	private int  userId;          //to store user id//
	private String emailid;       //to store user email id//
	private String password;

	
	
	public UserPojo() {
		super();
		
	}



	public UserPojo(int userId,String userName, String emailid, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailid = emailid;
		this.password = password;
	}



	public UserPojo(int userId2, String userName2) {
		this.userId = userId2;
		this.userName = userName2;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "UserPojo [userName=" + userName + ", userId=" + userId + ", emailid=" + emailid + ", password="
				+ password + "]";
	}

	
	
     

	
}
