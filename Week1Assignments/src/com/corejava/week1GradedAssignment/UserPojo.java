package com.corejava.week1GradedAssignment;

public class UserPojo {

	private int userId;
	private String userName;
	private String emailId;
	private String password;
	
	
	public UserPojo() {
		super();
		
	}
	
	
	public UserPojo(int userId, String userName, String emailId, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + "]";
	}
	
	
		
}
