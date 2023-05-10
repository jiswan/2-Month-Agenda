
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

package Chapters;

import java.util.Scanner;

public class Cashier {

	public static void main(String[] args) 
	{
		// Get the number of items 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre total number of items");
		int items = sc.nextInt();
		double total =0;
		
		//loop to calculate the total
		for(int i=0;i<items;i++)
		{
			System.out.println("Enter the cost of #"+(i+1));
			double price = sc.nextDouble();
			total+=price;
		}
		
		System.out.println("Total price for "+items+" items is "+total);

	}

}
