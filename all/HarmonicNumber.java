package com.bridgelabz.demo;
/*
* Created by: BridgeLabz
* Date 10/06/2016
* Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
**/
import com.bridgelabz.utility.Utility;

public class HarmonicNumber
{
	public static double harmonicValue(double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
	return val;
	}

	public static void main(String[] args) 
	{
		Utility u=new Utility();
	   	System.out.println("Enter a number: ");
		double n=u.inputDouble();
    	double result=harmonicValue(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
}
