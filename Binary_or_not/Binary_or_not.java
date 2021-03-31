package core;

import java.util.Scanner;

public class Binary_or_not {

	public static void main(String[] args) {
		
		System.out.print("Enter a number 10 or less digits: ");
	
		Scanner s = new Scanner (System.in);

		
		while (!s.hasNextInt()) {
		
			System.out.println();
			System.out.println("That`s not a number or more than 10 digits!");
			System.out.print("Enter a number 10 or less digits: ");
			s.next();
		}
	
		int n = s.nextInt();
		s.close();
		
		
		boolean flag = true;
		while (n!=0) {
			
			if ((n%10 == 0) || (n%10 == 1)) { n /= 10;} else {flag = false; break;}
				
			}
		
		if (flag) {System.out.println("This number is binary!");} else {System.out.println("This number isn`t binary!");}
		
		
	}
	
   }	

