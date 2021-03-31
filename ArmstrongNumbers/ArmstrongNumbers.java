package core;

import java.util.Scanner;

public class ArmstrongNumbers {
	
	static int inPow(int number, int power) {
		int result = 1;
		for (int i = 1; i<=power; i++) {
			result = number * result;
		}
		return result;		
	}
	
	static boolean isArmNum(int number) {
		int oem = number;
		int res = 0;
		while (number > 0) {
			
			res = res + (inPow(number%10,pow(oem)));
			number /= 10;
			
		}
		
		if (oem == res) return true; else return false;
		
	}
	
	static int pow(int number) {
		int power = 0;
		while (number  > 0) {
			
			number /= 10;
			power++;
			
		}
		return power;
	}
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the max searching number: ");
		int n = s.nextInt();
		System.out.print("All Armstrong numbers from 0 to " + n + " are: ");
		for (int i = 0; i<=n; i++) {
			
			if (isArmNum(i)) {System.out.print(i+ " ");}
			
		}
	
	}

}
