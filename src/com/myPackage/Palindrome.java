//This program is for finding the given string is palindrome or not
package com.myPackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String value = sc.nextLine();
        String store = "";
        store += value;
        String iterate = "";
        
        for(int i=store.length()-1; i>=0; i--)
        {
        	iterate += store.charAt(i);
        }
        if(iterate.equals(value))
        {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not a Palindrome");
        }
	}

}
