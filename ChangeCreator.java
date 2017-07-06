package W2D1;

import java.util.*;

public class ChangeCreator{

	/*
	 * Problem: 
you have to give someone change 
what coins do you give that person? 

Requirements: 
takes user input 
displays the change breakdown as output

1. Understand and Define the Problem 
ask user for input, US coins (quarter, dime, nickel, penny),  
max change: 99¢  display coin output ,
 What’s involved?  
interview users. What are their expectations? What data do 
they need to access? write a requirements analysis report


2. Determine Input and Output 
Typed input by user: amount of change requested (an integer between 1 and 99) 
Printed output:  
Number of quarters given  
Number of dimes given  
Number of nickels given  
Number of pennies given
	 */
	public static void main(String [] args){
		int hundred = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		int billCount = 0;
		int coinCount = 0;
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of dollars up to one thousand: ");
		int ammountInDollars = scan.nextInt();
		if(ammountInDollars > 1000)
		{
			System.out.println("Please enter a valid number!");
			ammountInDollars = scan.nextInt();
		}
		System.out.println("Enter the amount of change: ");
		int ammountInChange = scan.nextInt();
		if(ammountInChange > 99)
		{
			System.out.println("Please enter a valid number!");
			ammountInChange = scan.nextInt();
		}
		else
		{
			System.out.println("Thanks!");
			System.out.printf("Total $%3d.%2d", ammountInDollars, ammountInChange);
				}
		while (ammountInDollars > 0){
			if(ammountInDollars >= 100){
				hundred++;
				ammountInDollars = (ammountInDollars- 100);
				billCount ++;
			}
			else if (ammountInDollars >= 20)
			{
				twenty ++;
				ammountInDollars = (ammountInDollars - 20);
				billCount ++;
			}
			else if (ammountInDollars >= 10)
			{
				ten ++;
				ammountInDollars = (ammountInDollars -10);
				billCount ++;
			}
			else if (ammountInDollars >= 5)
			{
				five ++;
				ammountInDollars = (ammountInDollars -5);
				billCount ++;
			}
			else
			{
				one ++;
				ammountInDollars = (ammountInDollars - 1);
				billCount ++;
			}
			}
			while (ammountInChange > 0){
				if(ammountInChange >= 25){
					quarter++;
					ammountInChange = (ammountInChange- 25);
					coinCount++;
				}
				else if (ammountInChange >= 10)
				{
					dime ++;
					ammountInChange = (ammountInChange - 10);
					coinCount++;
				}
				else if (ammountInChange >= 5)
				{
					nickel ++;
					ammountInChange = (ammountInChange -5);
					coinCount++;
				}
				else
				{
					penny ++;
					ammountInChange = (ammountInChange - 1);
					coinCount++;
				}
				
		}
			
		System.out.printf("\nChange needed: \nBills: \n"
				+ "# of hundreds  = %d \n" +
				"# of twenties = %d \n" + 
				"# of tens = %d \n" +
				"# of fives = %d \n" +
				"# of ones = %d"
				+ "\nCoins:\n# of quarters = %d \n" +
				"# of dimes = %d \n" + 
				"# of nickels = %d \n" +
				"# of pennies = %d \n", hundred, twenty, ten, five, one, quarter, dime, nickel, penny);
		System.out.printf("Number of Bills = %d \nNumber of Coins = %d", billCount, coinCount);
		scan.close();
	}
}
