package core;

import java.util.Scanner;

public class Odd_numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int number = input.nextInt(); input.close();
		System.out.print("Odd numbers are: ");

		// Start coding

	    for (int i = 0; i<=number; i++) {
			
			if (i%2 != 0) {System.out.print(i + " ");}
			
		}		
		
        // End coding
	}
}