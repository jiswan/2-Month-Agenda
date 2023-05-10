
/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

package Chapters;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int totalStudent = 24;
		int totalTest = 3;
		
		for (int i=0;i<totalStudent;i++)
		{
			double total =0;
			for(int j=0;j<totalTest;j++)
			{
				System.out.println("Enter the score for "+(j+1));
				double score = sc.nextDouble();
				total =total+score;
			}
			System.out.println("Average Score for student"+(i+1)+" is "+(total/totalTest));
		}

	}

}
