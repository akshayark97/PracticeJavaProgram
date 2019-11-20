//Program to find hcf and lcm

package com.myPackage;

import java.util.Scanner;

public class LCMANDGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, b, x, y, t, hcf, lcm;
		
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    x = a;
	    y = b;
	    
	    while( b != 0)
	    {
	    	t = b;
	    	b = a % b;
	    	a = t;
	    }
       hcf = a;
       lcm = x*y/hcf;
       System.out.println("HCF: "+hcf);
       System.out.println("LCM: "+lcm);
	}
	
}
