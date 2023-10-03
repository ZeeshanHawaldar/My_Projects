package com.corejava.week2Day2;

class NumberPrinter implements Runnable {
    private static final int MAX_NUMBER = 20;
    private static volatile int currentNumber = 0;
    private  volatile int remainder;
    
    public NumberPrinter(int remainder) {
       this.remainder=remainder;
    }

    @Override
    public void run() {
       for( currentNumber=0;currentNumber<=MAX_NUMBER;){
    	   if(currentNumber%2==remainder) {
    		   System.out.println(Thread.currentThread().getName()+" "+currentNumber);
    		   currentNumber++;//it is written here instead of for loop because volatile number can change after every thread access
    	   }
       }
        }
    
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new NumberPrinter(0), "Even Thread");
        Thread oddThread = new Thread(new NumberPrinter(1), "Odd  Thread");
        
        evenThread.start();
        oddThread.start();
     
    }
}