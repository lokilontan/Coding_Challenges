package core;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPr(int n) {
		if (n<=1) {return false;}
		if (n==2) {return true;}
		for (int i = 2; i<(n/2)+1; i++) {
			if (n%i==0) return false;}
			return true;
	}

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number for searching prime numbers in this range: ");
		int number = s.nextInt();
		for (int i=1; i<=number; i++) {
			if (isPr(i)) {System.out.println(i + " is a prime number");}
 		}
	}
	
}
