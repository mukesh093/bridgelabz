package com.bridgelabz.demo;
/*
*Created by:BridgeLabz
*Date: 16/05/16
*Purpose:read an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)
*Ensure parentheses must appear in a balanced or not.
**/
import com.bridgelabz.utility.Utility;

public class BalancedParentheses
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter max size: ");
		int n=u.inputInteger();
	

		/* Creating Stack */
		StackLogic stack = new StackLogic(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = u.inputString();        
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
 }
