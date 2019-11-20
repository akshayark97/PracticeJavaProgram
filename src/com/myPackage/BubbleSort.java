package com.myPackage;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of an array");
//		int n=sc.nextInt();
		System.out.println("Enter the value");
		String s=sc.nextLine();
		char[] arr = s.toCharArray();
		
		String temp="";
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					char t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for(int i=0; i < arr.length; i++)
		{
			temp += arr[i];
		}
		System.out.println(temp);

	}

}
