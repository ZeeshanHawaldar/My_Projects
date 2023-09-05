package com.corejava.week1Day2;

import java.util.Scanner;

public class ToDoManager_Week1Day2 {
	static Scanner sc=new Scanner(System.in);
	 static String[] list= {"Exercise","Reading","Hobby"};
	 
	public static void main(String[] args) {
		
		
		
    System.out.println("======================================");
	System.out.println("Hi Zeeshan Welcome to To Do manager");
	System.out.println("======================================\n");
	
	System.out.println("Please enter your choice");
	System.out.println("1. To Add the task in ToDo list \n "
			+ "2. To Update the task in ToDo list\n"
			+ "3. To Delete the task from ToDo list \n"
			+ "4. To Search the task in ToDo list\n");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:System.out.println("Please Enter how many tasks you want to Add");
	        int n=sc.nextInt();
	        String[] s=new String[n];
	        System.out.println("Please enter the tasks");
	        for (int i = 0; i < s.length; i++) {
				s[i]=sc.next();
			}
	           String[] add=new String[list.length+s.length];
	       
        /*public static void arraycopy(Object source_arr, int sourcePos,
                            Object dest_arr, int destPos, int len)
            Parameters : 
            source_arr : array to be copied from
          sourcePos : starting position in source array from where to copy
          dest_arr : array to be copied in
          destPos : starting position in destination array, where to copy in
           len : total no. of components to be copied.*/
	          

	           // Copying elements from array1
	           System.arraycopy(list, 0, add, 0, list.length);

	           // Copying elements from array2
	           System.arraycopy(s, 0, add, list.length, s.length);

	         
	   
	        
	        System.out.println("======================================");
	        for (int i = 0; i < add.length; i++) {
				System.out.println(add[i]);
			}
	        System.out.println("======================================");
	        break;
	case 2:System.out.println("Please Enter at which position you want to update task");
             int index=sc.nextInt();
  
            System.out.println("Please enter the new tasks");
             for (int j = 0; j <list.length; j++) {
            	 if(j==index) {
            		 list[j]=sc.next();
            		
            	 }
            	 else {
            		 list[j]=list[j];
            	 }
	          }
             
             System.out.println("======================================");
              System.out.println("ToDo List");
              for (int i = 0; i < list.length; i++) {
		        System.out.println(list[i]);
		     
		       
	}   
              System.out.println("======================================");
              break;
	case 3:System.out.println("Please Enter at which position you want to delete task");
                   int del=sc.nextInt();
              String[] delete=new String[list.length-del];
                System.out.println("Please enter the new tasks");
                for (int i = 0, k = 0; i < list.length; i++) {
                	  
                    // if the index is
                    // the removal element index
                    if (i == del) {
                        continue;
                    }
          
                    // if the index is not
                    // the removal element index
                    delete[k++] = list[i];
                }
                
               System.out.println("======================================");
               System.out.println("ToDo List");
            
                 for (int i = 0; i < delete.length; i++) {
               System.out.println(delete[i]);
              
} 
                 System.out.println("======================================");
                 break;
	case 4:System.out.println("Please Enter which task you want to search");
                String search=sc.next();
                 int count=0;
               System.out.println("Please enter the new tasks");
                   for (int j = 0; j <list.length; j++) {
   	                  if(list[j].equals(search)) {
   	                	  count++;
   		            System.out.println("searched task present in To Do list");
   	                  }
                     }
    if(count==0) {
    	System.out.println("searched task not present in To Do list");
    }
                     System.out.println("======================================");
                       System.out.println("ToDo List");
                     for (int i = 0; i < list.length;i++ ) {
                    System.out.println(list[i]);
                    
} 
                     System.out.println("======================================");
                     break;
	
	}
	
	sc.close();
	
	}

}
