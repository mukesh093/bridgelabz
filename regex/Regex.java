package com.bridgelabz.demo;

import java.util.Date;
import com.bridgelabz.task.UserDetails;
import com.bridgelabz.utility.Utility;

public class Regex
{
	public static void main(String args[])
	{
		Utility u=new Utility();

		UserDetails user=new UserDetails();
		System.out.println();
	
		//asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(u.inputString());
		System.out.println();
	
		System.out.println("Enter LastName:");
		user.setlName(u.inputString());
		System.out.println();
	
		System.out.println("Enter Mobile Number:");
		user.setmobileNo(u.inputString());
		System.out.println();	
		
		//Setting current date
		user.setdate(u.getFormatedDate(new Date()));
		System.out.println(u.convertString(user,u.getFileText("newfile.txt")));	
	}
}
