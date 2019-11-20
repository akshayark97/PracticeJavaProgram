package com.myPackage;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String putString = sc.nextLine();
		int count = 0;
		for(int i=0; i<putString.length()-1; i++)
		{
			if(putString.charAt(i) != ' ' && putString.charAt(i+1) == ' ')
			{
				count++;
			}
		}
		System.out.println(count+1);

	}

}
