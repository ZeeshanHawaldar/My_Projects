package com.corejava.week1Day4;

public class UserPojo {

	private String userName;
	private String password;
	
	
	
	public UserPojo() {
		super();
		
	}

     

	



	public UserPojo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

   
	@Override
	public String toString() {
		return "UserPojo [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
