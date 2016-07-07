Logic, Object Oriented and Data Structure Programs

1. User Input and Replace String Template “Hello <<UserName>>, How are you?” 
a. I/P -> Take User Name as Input. Ensure UserName has min 3 char
b. Logic -> Replace <<UserName>> with the proper name
c. O/P -> Print the String with User Name.

2. Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails.

3. Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.

4. Power of 2 
a. Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.

5. Harmonic Number 
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.

6. Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.

7. Gambler
a. Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
b. I/P -> $Stake, $Goal and Number of times
c. Logic -> Play till the gambler is broke or has won
d. O/P -> Print Number of Wins and Percentage of Win and Loss.

8. Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random number and to process distinct coupons.

9.  2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols 
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.

10. Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct trniplets.

11. An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....

12. //Stock Report
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read from the input file. Have functions in the Class to calculate the value of each stock and the value of total stocks.

13. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.

14. Question to find your number
a. Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
b. I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
c. Logic -> Use Binary Search to find the number
d. O/P -> Print the intermediary number and the final answer.

15. Binary Search the Word from Word List
a. Desc -> Read in a list of words as input. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated and then enter the word to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not.

16. Insertion Sort 
a. Desc -> Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List

17. Bubble Sort 
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List 

18. UnOrdered List
a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file
b. I/P -> Read from file the list of Words and take user input to search a Text
c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node Object. Each node object must hold at least two pieces of information. One ref to the data field and  second the ref to the next node object.
d. O/P -> The List of Words to a File.

19. Ordered List
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new number
c. Logic -> Create a Ordered Linked List having Numbers in ascending order. 
d. O/P -> The List of Numbers to a File.

20. Simple Balanced Parentheses
a. Desc -> Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the performance of operations. Ensure parentheses must appear in a balanced fashion.
b. I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the Expression if the Stack is Empty then the Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.

21. Simulate Banking Cash Counter
a. Desc -> Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.
b. I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue 
c. Logic -> Write a Queue Class to enqueue and dequeue people to either deposit or withdraw money and maintain the cash balance
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.

22. Palindrome-Checker
a. Desc -> A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam. We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.
b. I/P -> Take a String as an Input 
c. Logic -> The solution to this problem will use a deque to store the characters of the string. We will process the string from left to right and add each character to the rear of the deque. 
d. O/P -> True or False to Show if the String is Palindrome or not.

23. Utility Class 
a. Desc -> Create Utility Class having following methods
i. binarySearch method for integer
ii. binarySearch method for String
iii. insertionSort method for integer
iv. insertionSort method for String
v. bubbleSort method for integer
vi. bubbleSort method for String
b. I/P -> Write main function to call the utility function
c. Logic -> Check using Stopwatch the Elapsed Time for every method call
d. O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order

24. Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 
d. O/P -> Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change.

25. Hashing Function to search a Number in a slot
a. Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number
b. I/P -> read a set of numbers from a file and take user input to search a number
c. Logic -> Firstly store the numbers in the Slot. Since there are 10 Numbers divide each number by 11 and the reminder put in the appropriate slot. Create a Chain for each Slot to avoid Collision. If a number searched is found then pop it or else push it. Use Map of Slot Numbers and Ordered LinkedList to solve the problem. In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0 slot while 26/11 remainder is 4 hence sits in slot 4
d. O/P -> Save the numbers in a file

26. JSON Inventory Data Management of Rice, Pulses and Wheats
a. Desc -> Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
b. Use Library : Java JSON Library, For IOS JSON Library use NSJSONSerialization for parsing the JSON.
c. I/P -> read in JSON File
d. Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory. 
e. O/P -> Create the JSON from Inventory Object and output the JSON String.

27. Regular Expression Demonstration
a. Desc -> Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
i. Replace <<name>> by first name of the user ( assume you are the user)
ii. replace <<full name>> by user full name.
iii. replace any occurance of mobile number that should be in format 91-xxxxxxxxxx by your contact number.
iv. replace any date in the format XX/XX/XXXX by current date.
d. O/P -> Print the Modified Message.

28. Inventory Management Program
a. Desc -> Extend the above program to Create InventoryManager to manage the Inventory. The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. The InventoryManager will call each Inventory Object in its list to calculate the Inventory Price and then call the Inventory Object to return the JSON String. The main program will be with InventoryManager
b. I/P -> read in JSON File
c. Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory. 
d. O/P -> Create the JSON from Inventory Object and output the JSON String.

Object Oriented Programs
1. Clinique Management Programme. This programme is used to manage a list of Doctors associated with the Clinique. This also manages the list of patients who use the clinique. It manages Doctors by Name, Id, Specialization and Availability (AM,  PM or both). It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name, id, Specialization or Availability. Also the programs allows users to search patient by name, mobile number or id. The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 5 patients. If exceeded the user can take appointment for patient at different date or availability time. Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular.

