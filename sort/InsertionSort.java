package com.bridgelabz.demo;
/*
*Created by :BridgeLabz
*Date 14/06/2016
*Perpose:ask the user what type element you wants,sort the integers,strings and doubles.
* this InsertionSort program is Generic type.
**/
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class InsertionSort 
{
	public static void main(String[] args) 
	{	
		Utility u=new Utility();
		System.out.println("Enter no. of words to be printed: ");
		int n=u.inputInteger();
		 
		//create string array
		String array[]=new String[n];
		System.out.println();	
		System.out.println("Enter the words to be printed: ");

		for(int i=0;i<array.length;i++)
		{
			array[i]=u.inputString();
		}
		System.out.println();
	       
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		for(int i=0;i<array.length;i++)
		{
			Arrays.sort(array);
			System.out.println(array[i]);
		}
	}
}
