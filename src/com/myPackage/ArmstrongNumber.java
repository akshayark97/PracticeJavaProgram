package com.myPackage;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp = n;
	int c=0, a;
	
	while(n > 0)
	{
		a = n % 10;
		n = n/10;
		c = c + (a*a*a);
	}
	if(temp == c)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not an Armstrong number");
	}
}
}
