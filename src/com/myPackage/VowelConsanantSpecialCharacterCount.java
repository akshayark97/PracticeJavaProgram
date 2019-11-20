package com.myPackage;

import java.util.Scanner;

public class VowelConsanantSpecialCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nc=0;//number count
		int vc=0;//vowel count
		int cc=0;//consonant count
		int sp=0;//space count
		int sc=0;//special character count
        
		
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i)<=57)
			{
				nc++;
			}
			else if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <=122))
			{
				if(s.charAt(i) == 'A'||
				   s.charAt(i) == 'E'||
				   s.charAt(i) == 'I'||
				   s.charAt(i) == 'O'||
				   s.charAt(i) == 'U'||
				   s.charAt(i) == 'a'||
				   s.charAt(i) == 'e'||
				   s.charAt(i) == 'i'||
				   s.charAt(i) == 'o'||
				   s.charAt(i) == 'u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
				   
					
			}
			else {
				if(s.charAt(i) == ' ')
				{
				    sp++;
				}
				else {
					sc++;
				}
			}
		}
		System.out.println("The number count is "+nc);
		System.out.println("The vowel count is "+vc);
		System.out.println("The consonant count is "+cc);
		System.out.println("The space count is "+sp);
		System.out.println("The special character count is "+sc);

	}

}
