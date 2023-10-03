package com.corejava.week2Day2;

 class GuestesPrinting2 implements Runnable{
      String guestName;
	public GuestesPrinting2(String guestname) {
		this.guestName=guestname;
	}
	synchronized void printGreeting(String guestName) throws InterruptedException{
		Thread.sleep(500);
		System.out.println("Welcome "+" "+guestName);
		System.out.println("How are you ?"+" "+guestName);
		System.out.println("Bye for now ,see you soon "+" "+guestName);	
        System.out.println("=================================================================");
	}
	@Override
	public void run() {
		   try {
			printGreeting(guestName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                     
		
	}

	
	
}


 public class SynchoronisedMethodExample{
	public static void main(String[] args) {
		Thread Guest1=new Thread(new GuestesPrinting2("Zeeshan"));
		Thread Guest2=new Thread(new GuestesPrinting2("Joy"));
		Thread Guest3=new Thread(new GuestesPrinting2("Naushin"));
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