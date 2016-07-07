package com.bridgelabz.demo;
/*
* Created by: BridgeLabz
* Date: 11/06/2016
* Purpose: An Anagram Detection
*One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams
**/
import com.bridgelabz.utility.Utility;

public class AnagramDetection 
{
    public static void main(String[] args)
    {
		Utility u=new Utility();
		//taking string input
		System.out.println("Enter 1st String: ");  
		String s=u.inputString();
		System.out.println("Enter 2nd String: ");
		String s1=u.inputString();
		//calling function
		AnagramProgram.isAnagram(s, s1);
	}
}
