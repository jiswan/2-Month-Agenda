
/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’ or 'a'.
 */

package Chapters;

import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) 
	{
		//Gathering the information
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the string");
		String word = sc.next();
		Boolean mark= false;
		
		//searching for A || a
		for(int i=0;i<word.length();i++)
		{
			char currentchar = word.charAt(i);
			if(currentchar=='a' || currentchar=='A')
				{	mark = true;
					break;
				}
		}
		
		if(mark)
			System.out.println("Letter A/a is in the string");
		else
			System.out.println("Letter A/a is not  in the string");
	}

}
