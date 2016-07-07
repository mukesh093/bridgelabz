package com.bridgelabz.demo;
/*
* created by:BridgeLabz
* Date 10/06/2016
* Purpose: this program replace "UserName" with proper user name.
**/
import com.bridgelabz.utility.Utility;

public class PrintName 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();    
		System.out.println("Enter your Name:");
		String name=u.inputString();            
		int len=name.length();

		if(len>=3)
		{
			System.out.println("Hello "+name+", How are you?");
		}
		else
		{
			System.out.println("Invalid Name");
		}
	}
}
