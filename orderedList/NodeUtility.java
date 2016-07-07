package com.bridgelabz.demo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io. BufferedReader;
import java.io.IOException;

import com.bridgelabz.utility.Node;

public class NodeUtility
{
	String[] stringArray;
    int[] intArray;

	//Reading string from file
	public Node readFile(Node start)
	{
		try
		{
			FileInputStream fis = new FileInputStream("integer.txt");
			char ch;
			String word3="";

			while (fis.available() > 0)
			{
				ch = (char) fis.read();
				word3=word3+ch;
			}
			String[] wordsArray=word3.split(" ");
			int[] inputArray=new int[wordsArray.length-1];

			for(int i=0;i<wordsArray.length-1;i++)
			{
				inputArray[i]=Integer.parseInt(wordsArray[i]); 
			}
			inputArray=sort(inputArray);

			for(int i =0; i < wordsArray.length-1 ; i++)
			{
				start=addWordstoList(start,inputArray[i]);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return start;
	}

	//read integer file
	public int[] integerFileReader()
	{
		try
		{
			String intFile = new String();
			FileReader fr = new FileReader("integer.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s;

		    while((s = br.readLine()) != null) 
			{
		        intFile += s;
		    }

		    intFile = intFile.replaceAll("\\n",",");
		    intFile = intFile.trim();
		    stringArray = intFile.split(","); 
		    intArray = new int[stringArray.length];

		    for(int i=0; i <intArray.length;i++)
		    {
		        try
		        {
		            intArray[i]= Integer.parseInt(stringArray[i]);
		        }
		        catch(NumberFormatException e)
		        {
		            System.out.println(e);
		        }
		    }
		}
		catch(Exception obj)
		{
		    System.out.println("e");
		}
        	return intArray;
    }

	//End of insert method
	public Node addWordstoList(Node node1,int num)
	{
    	Node node2=node1;
    	Node newNode=new Node();
    	newNode.data=num;
    	newNode.nextNode=null;

	    if(node1==null)
	    {
	      	return newNode;
	    }
	    else
		{
	      	while(node1.nextNode!=null)
	      	{
				node1=node1.nextNode;
	      	}
	      		node1.nextNode=newNode;
	    }
    	return node2;
	}//End of insert method

	//Sorting linked list in ascending order
  	public int[] sort(int[] arr )
	{
    	int size=arr.length;
    	for(int i=size;i>0;i--)
		{
      		for(int j=1;j<size;j++)
			{
        		if(arr[j-1]>arr[j])
				{
          			int temp=arr[j-1];
          			arr[j-1]=arr[j];
          			arr[j]=temp;
        		}
      		}
      		size--;
    	}
    	return arr;
  	}//End of sorting method

	////Searching number
  	public Node search(Node tNode1, int num)
	{
    	Node tNode=tNode1;

    	//No elements in an list(List empty)
    	if(tNode==null)
		{
      		Node newNode=new Node();
			newNode.data=num;
			tNode=newNode;
			return tNode; 
    	}

    	//Search number is first in list
    	if(tNode.data==num)
		{
      		tNode=null;
      		return tNode1; //
    	}

    	//Search num
    	while(tNode!=null)
		{
      		if(tNode.nextNode==null)
			{
        		return tNode1;
      		}
      
      		if(tNode.nextNode.data==num)
			{
        		tNode.nextNode=tNode.nextNode.nextNode;
        		return tNode1;
      		}
     	 	tNode=tNode.nextNode;
    	}
    	return tNode1;
  	}

	//method to write in file
  	public void writeFile(Node tNode)
	{
    	try
		{
			String tString="";
		    File file=new File("NewText.txt");
		    file.createNewFile();
		    FileWriter fw=new FileWriter(file);

		    while(tNode!=null)
			{
		      	tString+=String.valueOf(tNode.data);
		      	tString+=" ";
		      	tNode=tNode.nextNode;
		    }
		    //System.out.println("string "+tString );
		    fw.write(tString);
		    fw.close();
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
	} //end of method
}
