package com.myPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of two string to compare");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		
		
		s1 = s1.replace(" ", "");
		s2 = s2.replace(" ", "");
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result == true)
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}

	}

}
