package com.corejava.week1Day5;

import java.time.LocalDate;

public class TaskPojo extends UserDao {
  
	private int taskId;
	private String taskTitle;
	private String taskText;
	private int assignedTo;
	 private LocalDate d;
	private char completed;
	
	
	public TaskPojo() {
		
	}
	
	
	
	public TaskPojo(int taskId, String taskTitle, String taskText, int assignedTo, LocalDate d, char completed) {
		super();
		this.taskId = taskId;
		this.taskTitle = taskTitle;
		this.taskText = taskText;
		this.assignedTo = assignedTo;
		this.d=d;
		this.completed=completed;
	}



	public int getTaskId() {
		return taskId;
	}



	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}



	public String getTaskTitle() {
		return taskTitle;
	}



	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}



	public String getTaskText() {
		return taskText;
	}



	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}



	public int getAssignedTo() {
		return assignedTo;
	}



	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}



	public LocalDate getD() {
		return d;
	}



	public void setD(LocalDate d) {
		this.d = d;
	}



	public char getCompleted() {
		return completed;
	}



	public void setCompleted(char completed) {
		this.completed = completed;
	}



	@Override
	public String toString() {
		return "TaskPojo [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskText=" + taskText + ", assignedTo="
				+ assignedTo + ", d=" + d + ", completed=" + completed + "]";
	}



	

	
	
}
