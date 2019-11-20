package com.myPackage;

import java.util.Scanner;

public class FirstBigAndSecondBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int fbig=0;
		int sbig=0;
		for(int i=0; i<arr.length; i++)
		{
		if(arr[i] > fbig)
		{
			sbig = fbig;
			fbig = arr[i];
			
		}
		else if(arr[i] > sbig)
		{
			sbig=arr[i];
		}
		}
        System.out.println("The first big is: "+fbig);
        System.out.println("The second big is: "+sbig);
	}

}
