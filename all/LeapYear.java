package com.bridgelabz.demo;
/*
* created by: BridgeLabz
* Date 10/06/2016
* Purpose:check whether it is a Leap Year or not.	 
**/
import com.bridgelabz.utility.Utility;

public class LeapYear 
{
	public static boolean leapYearCheaker(int year)
	{
		if(year>1000)
		{
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		   }
		}
		return false;
	}

	public static void main(String[] args)
	{	
		Utility u=new Utility();
		System.out.println("Enter a leap year:");
		int year=u.inputInteger();
		boolean result = leapYearCheaker(year);
	 
		if(result)
		{
			System.out.println("Year:"+ year + " is a leap year");
		}
		else
		{
			System.out.println("Year:"+ year + " is not a leap year");
		}
	}
}
