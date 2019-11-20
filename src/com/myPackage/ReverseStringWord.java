package com.myPackage;

import java.util.Scanner;

public class ReverseStringWord {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] words = str.split(" ");
//		String reversedString = "";
//		for (int i = 0; i < words.length; i++) {
//			String word = words[i];
//			String reverseWord = "";
//			for (int j = word.length() - 1; j >= 0; j--) {
//				reverseWord += word.charAt(j);
//			}
//			reversedString += reverseWord + " ";
//		}
//
//		System.out.println(reversedString);
//		String[] newValue = reversedString.split(" ");
//		for(int i=0; i<newValue.length; i++)
//		{
//			String value = newValue[i];
//			if(value == words[i])
//			{
//				System.out.println(value);
//			}
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
//		String temp1 = "";
		boolean flag = true;
		String reverse = "";
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			reverse += temp;
			String temp1 = "";
			for(int j=temp.length(); j>=0; j--)
			{
				temp1 += temp.charAt(i);
			}
			
			
		}
		
		
	}

}