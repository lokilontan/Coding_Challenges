package core;

import java.util.Scanner;

public class Even_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		int number = sc.nextInt(); sc.close();
		System.out.print("Even numbers are: ");

		// Start coding
		
		for (int i = 0; i<=number; i++) {
			
			if (i%2 == 0) {System.out.print(i + " ");}
			
		}

        // End coding
	}
}