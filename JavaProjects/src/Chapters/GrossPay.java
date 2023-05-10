
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

package Chapters;

import java.util.Scanner;

public class GrossPay {

	public static void main(String[] args) 
	{
		//initializing the Information
		double rate = 17.5;
		int maxiHours = 40;
		
		//Gather the infromation from the user
		Scanner sc = new Scanner (System.in);
		System.out.println("How many hours did you work this week? ");
		int hours = sc.nextInt();
		
		//validating the hours
		while(hours>maxiHours || hours<1)
		{
			System.out.println("Enter the hours between 1 and 40 ");
			hours = sc.nextInt();
		}
		
		//Calculating the grosspay
		double grosspay = rate * hours;
		System.out.println("The Grosspay for this week is $"+grosspay);
		

	}

}
