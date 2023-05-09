 /* Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
package Chapters;

import java.util.Scanner;

public class GradeMessage {

	public static void main(String[] args) {
		System.out.println("Enter the Grade (Letter) ");
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		String message;
		switch(grade)
		{
		case 'A':
			message = "Excellent Job !";
			break;
		case 'B':
			message = "Great Job";
			break;
		case 'C':
			message = "GOOD Job";
			break;
		case 'D':
			message = "you need to work harder";
			break;
		case 'E':
			message = "you need to focus more ";
			break;
		case 'F':
			message = "Ohh ";
			break;
		default:
			message = "Invalid Entry";
			break;
		}
		System.out.println(message);
	}

}
