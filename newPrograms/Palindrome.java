package com.bridgelabz.demo;

import com.bridgelabz.utility.Utility;

public class Palindrome 
{
	public static void main(String[] args) 
	{

		StringBuffer sb=new StringBuffer();
		Utility u=new Utility(); 

		//taking string as input 
		System.out.println("Enter a string palindrome:");		
		String palin=u.inputString();                        
		sb.append(palin);
		String rev=sb.reverse().toString();                  
		System.out.println("Reverse is: "+rev);

		if(palin.equalsIgnoreCase(rev))                    
		{
		    System.out.println("The Entered String is Palindrome");
		}
		else
		{
		    System.out.println("The Entered String is not Palindrome");
		}
	}
}
