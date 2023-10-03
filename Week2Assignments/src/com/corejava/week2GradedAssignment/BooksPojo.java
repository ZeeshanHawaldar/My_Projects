package com.corejava.week2GradedAssignment;

import java.time.LocalDate;

public class BooksPojo {
	private int bookId;
	private String bookName;
	private String authorName;
	private String description;
	private LocalDate date1;
	private char f;
	private char c;
	
	public BooksPojo() {
		super();
		
	}
	
	public BooksPojo(int bookId, String bookName, String authorName, String description, LocalDate date1, char f,
			char c) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.date1 = date1;
		this.f = f;
		this.c = c;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate1() {
		return date1;
	}

	public void setDate1(LocalDate date1) {
		this.date1 = date1;
	}

	public char getF() {
		return f;
	}

	public void setF(char f) {
		this.f = f;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "BooksPojo [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", description=" + description + ", date1=" + date1 + ", f=" + f + ", c=" + c + "]";
	}
	
		
	
}
