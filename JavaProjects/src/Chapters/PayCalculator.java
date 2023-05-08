package Chapters;

import java.util.Scanner;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hours;
		double rate,grosspay;
		Scanner sc = new Scanner(System.in);
		
		// 1. Get the Hours Employee worked
		System.out.println("Enter the Number of Hours Employee worked \t");
		hours = sc.nextFloat();
		
		//2. Get the Hourly Rate
		System.out.println("Enter the Employee pay rate(in $ ) \t");
		rate = sc.nextDouble();
		
		//3. Calculating the GrossPay for the Employee
		grosspay = hours*rate;
		System.out.println("The GrossPay for the Employee is \t$"+grosspay);

	}

}
