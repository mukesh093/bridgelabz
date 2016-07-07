package com.bridgelabz.demo;

import java.util.Arrays;
import com.bridgelabz.utility.SortingFunction;
import com.bridgelabz.utility.Utility;

public class SearchLogic
{   
	public static long start=0;
	public static long end=0;
	public static long elapsed;
	static int ch=0;
	
	public static void main(String[] args)
	{
		SortingFunction sf=new SortingFunction();
		Utility u=new Utility();
	
		do
		{ 
			System.out.println("--------Menu for Searching and Sorting----------");
			System.out.println("1. BinarySearch  for Integer");
			System.out.println("2. BinarySearch  for String");
			System.out.println("3. InsertionSort  for Integer");
			System.out.println("4. InsertionSort  for String");
			System.out.println("5. BubbleSort for Integer");
			System.out.println("6. BubbleSort for String");
			System.out.println("7. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			int choice=u.inputInteger();
			System.out.println();
	
			switch (choice) 
			{ 
			case 1:
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For Integer");
					System.out.println("Enter size: ");
					int arraySize=u.inputInteger();
					int a[]=sf.input1DArray(arraySize);
					Arrays.sort(a);
					sf.print1DArray(a);
					System.out.println("Enter Key: ");
					int position=sf.binarySearch(a,u.inputInteger());

					if(position==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 2:
					start=System.currentTimeMillis();
					System.out.println("BinarySearch  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize1=u.inputInteger();
					String b[]=sf.input1DStringArray(arraySize1);
					Arrays.sort(b);
					sf.print1DStringArray(b);
					System.out.println("Enter Key: ");
					int position1=sf.binarySearchString(b,u.inputString());

					if(position1==-1)
					{
						System.out.println("Not Found");
					}
					else
					{
						System.out.println("Found at "+position1+" position");
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 3:
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For Integer");
					System.out.println("Enter size: ");
					int arraySize5=u.inputInteger();
					int c[]=sf.input1DArray(arraySize5);
					sf.print1DArray(c);
					System.out.println("Enter Key: ");
					int k[]=sf.insertionSort(c);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k.length;i++)
					{
						System.out.println(k[i]);
					}

					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 4 :
					start=System.currentTimeMillis();
					System.out.println("InsertionSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize4=u.inputInteger();
					String d[]=sf.input1DStringArray(arraySize4);
					sf.print1DStringArray(d);
					System.out.println("Enter Key: ");
					String k1[]=sf.insertionSortString(d);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k1.length;i++)
					{
						System.out.println(k1[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 5:
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For Integer: ");
					System.out.println("Enter size: ");
					int arraySize2=u.inputInteger();
					int e[]=sf.input1DArray(arraySize2);
					sf.print1DArray(e);
					System.out.println("Enter Key: ");
					int k2[]=sf.bubbleSort(e);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k2.length;i++)
					{
						System.out.println(k2[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 6:
					start=System.currentTimeMillis();
					System.out.println("BubbleSort  For String");
					System.out.println("Enter number of words to be sorted: ");
					int arraySize3=u.inputInteger();
					String f[]=sf.input1DStringArray(arraySize3);
					sf.print1DStringArray(f);
					System.out.println("Enter Key: ");
					String k3[]=sf.bubbleSortString(f);
					System.out.println("Sorted Array is: ");

					for(int i=0;i<k3.length;i++)
					{
						System.out.println(k3[i]);
					}
					end=System.currentTimeMillis();
					elapsed=end-start;
					System.out.println("Total Elapsed Time is: "+elapsed);
					break;
			case 7: 
					System.exit(0);
			default:
					System.out.println("Wrong Input");
					break;
			}
		}
		while(ch<8);
	}
}
