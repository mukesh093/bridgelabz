package com.bridgelabz.demo;
/*
*Created by:BridgeLabz
*Date 15/06/2016
*Purpose :we will use a dequeue to store the characters of 
the string. We will process the string from left to right and add each character to the rear of the deque.
*A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam.
**/
import com.bridgelabz.utility.Utility;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		DequeUtility<Character> utility=new DequeUtility<Character>();
		System.out.println("Enter a String: ");
		String s=u.inputString();

		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;

		while(utility.size()>1)
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
