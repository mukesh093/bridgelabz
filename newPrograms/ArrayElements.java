package com.bridgelabz.demo;

import java.util.HashSet;
import com.bridgelabz.utility.Utility;

// Java program to find longest consecutive subsequence
class ArrayElements
{
    // Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[],int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
 
        // Hash all the array elements
        for (int i=0; i<n; ++i)
            S.add(arr[i]);
 			System.out.println("S values:"+S);
        // check each possible sequence from the start
        // then update optimal length
        for (int i=0; i<n; ++i)
        {
            // if current element is the starting
            // element of a sequence
            if (!S.contains(arr[i]-1))
            {
                // Then check for next elements in the
                // sequence
                int j = arr[i];
                System.out.println("j: "+j);
                while (S.contains(j))
                    j++;
 					System.out.println("for j++: "+j);
                // update  optimal length if this length
                // is more
                if (ans<j-arr[i])
                    ans = j-arr[i];
            }
        }
        return ans;
    }
 
    // Testing program
    public static void main(String args[])
    {
    	int arr[];
    	Utility u=new Utility();
    	System.out.println("Enter length of Array: ");
    	int n=u.inputInteger();
    	arr=new int[n];
    	System.out.println("Enter values for "+n+" elements:");

    	for(int i=0;i<n;i++)
    	{
    		arr[i]=u.inputInteger();
    	}

        int n1 = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is "+findLongestConseqSubseq(arr,n1));
    }
}
