
/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

package Chapters;

import java.util.Scanner;

public class AdditionNumber {

	public static void main(String[] args)
	{
	 
		Scanner sc = new Scanner(System.in);
		Boolean again;
		do
		{
			System.out.println("Enter the First Number");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter the Second Number");
			double num2 = sc.nextDouble();
			
			double result = num1+num2;
			System.out.println("Adding "+num1+" and "+num2+" = "+result);
			
			System.out.println("\nWould you like to start over? True or False");
			again = sc.nextBoolean();
			
		}while(again);

	}

}
