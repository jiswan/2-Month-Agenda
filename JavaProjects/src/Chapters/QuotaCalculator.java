
/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */

package Chapters;

import java.util.Scanner;

public class QuotaCalculator {

	public static void main(String[] args) {
		
		//Initializing what we know
		int requiredSales =10;
		
		//Gathering the data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Sales you made this year ");
		int sales = sc.nextInt();
		
		//Calculating the Quota
		
		if (sales>=requiredSales)
		{
			System.out.println("Congratulation! You've met your quota ");
		}
		else
		{
			int salesShort = (requiredSales- sales);
			System.out.println("You did not make your quota. You were " + salesShort + " sales short");
		}
		

	}

}
