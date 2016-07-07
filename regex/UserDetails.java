package com.bridgelabz.task;

public class UserDetails
{
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String date;

	//constructor
	public UserDetails(){
	}
	//getter and setter methods
	public void setfName(String firstName){
		this.firstName=firstName;
	}

	public void setlName(String lastName){
		this.lastName=lastName;
	}

	public void setmobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}

	public void setdate(String date){
		this.date=date;
	}

	public String getfName(){
		return firstName;
	}

	public String getlName(){
		return lastName;
	}

	public String mobileNo(){
		return mobileNo;
	}

	public String date(){
		return date;
	}
}
