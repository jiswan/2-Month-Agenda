/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
package Chapters;

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {
		
    // Initialize What we Know
		double requiredSalary=30000;
		int requiredYears = 2;
		
	//Gather the data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();
		System.out.println("Enter the number the number of years with current employee");
		int year = sc.nextInt();
	
	//make decision
		if (salary>=requiredSalary)
				{
					if(year>=requiredYears)
						System.out.println("Congrats! You qualify for the loan");
					else
						System.out.println("Sorry, you must have worked at your current job "
				                + requiredYears + " years.");
				}
		else
				{
					System.out.println("Sorry, you must earn at least $"
                    +requiredSalary + " to qualify for the loan");
				}
	
		
	}

}
