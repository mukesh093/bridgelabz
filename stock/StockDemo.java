package com.bridgelabz.demo;
/*
* created by: BridgeLabz
* Date: 15/06/2016
* Purpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
**/
import com.bridgelabz.utility.Utility;

public class StockDemo
{
	public static void main(String args[])
	{
		//get stock details read stock details from fie.txt and display reports.s
		System.out.println(new Utility().getStockDetails("file.txt"));
	}
}
