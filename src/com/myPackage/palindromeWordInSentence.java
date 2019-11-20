package com.myPackage;

import java.util.*;
public class palindromeWordInSentence
{
    boolean isPalindrome(String S)
    {
        boolean result = false;
        String check="";
        for(int i = S.length()-1;i>=0;i--)
        {
            check = check+S.charAt(i);
        }
        if(check.equalsIgnoreCase(S))
        {
            result = true;
        }
        return result;
    }
    public static void main(String args[])
    {
        palindromeWordInSentence ob = new palindromeWordInSentence();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(int i=0; i < words.length; i++)
        {
            if(ob.isPalindrome(words[i]))
            {
                System.out.println(words[i]);
            }
        }
    }
}