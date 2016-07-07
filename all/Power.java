package com.bridgelabz.demo;
/*
* created by: BridgeLabz
* Date 11/06/2016
* Purpose: This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
**/
import com.bridgelabz.utility.Utility;

public class Power 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter a number:");
        int num=u.inputInteger();
        System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
        System.out.println();
        System.out.println("Printing all till Power Value "+num);
        
        for(int i=1;i<=num;i++)
        {
         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
        }
	}
}
