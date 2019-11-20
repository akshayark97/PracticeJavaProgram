package com.myPackage;

import java.util.Scanner;

public class FIbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_no = 0, second_no = 1, user_no, result, count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the user input");
	    user_no = sc.nextInt();
	    for(int i=0; i<user_no; i++)
	    {
	    	result = first_no + second_no;
	    	count++;
	    	if(user_no < result)
	    	{
	    		break;
	    	}
	    	
	    	 first_no = second_no;
	     	second_no = result;
	     	
	     	
	 	    System.out.print(first_no+", ");
	     	}
	
	   
		
		

	}

}
