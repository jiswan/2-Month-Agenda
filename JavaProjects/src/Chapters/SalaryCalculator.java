
/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

package Chapters;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
      
	  // Information that we know
		int payment = 1000;
		int bonus =250,quota =10;
      
	// Gathering the information
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total sales that you made in this year");
		int sales = sc.nextInt();
		
	//Applying the condition to determine whether salesperson is eligible for bonus
		if(sales>=quota)
			payment = payment + bonus;
		System.out.println("The employee's pay is $"+payment);
		
		

	}

}
