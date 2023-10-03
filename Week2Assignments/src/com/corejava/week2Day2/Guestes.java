package com.corejava.week2Day2;

 class GuestesPrinting implements Runnable{
      String guestName;
	public GuestesPrinting(String guestname) {
		this.guestName=guestname;
	}
	synchronized void printGreeting(String guestName){
		
		System.out.println("Welcome "+" "+guestName);
		System.out.println("How are you ?"+" "+guestName);
		System.out.println("Bye for now ,see you soon "+" "+guestName);	

	}
	@Override
	public void run() {
		   printGreeting(guestName);                     
		
	}

	
	
}


 public class Guestes{
	public static void main(String[] args) {
		Thread Guest1=new Thread(new GuestesPrinting("Zeeshan"));
		Thread Guest2=new Thread(new GuestesPrinting("Joy"));
		Thread Guest3=new Thread(new GuestesPrinting("Naushin"));
		Guest1.start();
		try {
			Guest1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Guest2.start();
		try {
			Guest2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Guest3.start();
		try {
			Guest3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}