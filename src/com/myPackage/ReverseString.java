//This program is for reversing a string
package com.myPackage;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		String temp = "";
		for(int i=value.length()-1; i >= 0; i--)
		{
			temp += value.charAt(i);
		}
		System.out.println(temp);

	}

}
