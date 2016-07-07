package com.bridgelabz.demo;
/*
* Created by: BridgeLabz
* Date: 10/06/2016
* Purpose: Computes the prime factorization for given number.
**/
import com.bridgelabz.utility.Utility;

public class PrimeFactors 
{
	public static boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
	 	return true;
	 }

	public static void main(String[] args) 
	{ 
        Utility u=new Utility();
		System.out.println("Enter the no. to find PrimeFactors:");
		int n=u.inputInteger();
		System.out.println();
		System.out.println("The prime factors for the "+n+" is:");
		System.out.println();
		   
		for(int i=2;i<=n;i++)
		{  
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
        System.out.println();
	}
}
