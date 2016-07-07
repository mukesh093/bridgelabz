package com.bridgelabz.demo;
/*
* Created by: BridgeLabz
* Date: 19/06/2016
* Purpose:  Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number
**/

public class HashingFunction
{
  	OrderedLinkedList[] order=new OrderedLinkedList[11];
  	NodeUtility nu=new NodeUtility();

  	public  HashingFunction()
  	{
		int[] retArray = nu.integerFileReader();

		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new OrderedLinkedList();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}

    public static void main(String[] args)
    {
      	HashingFunction hs=new HashingFunction();
    }
}
