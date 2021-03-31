package core;

import java.util.Scanner;

public class Perfect_numbers {
	
	public static boolean flag(int pn) {
		int sum = 0;
		int i;
		for (i=1 ; i<=pn/2; i++) {
			
			if (pn%i == 0) {sum += i;}
			
		}
		
		if (sum == pn) {return true;} else {return false;}
		
		
	}
	
	public static void main (String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.print("Enter the max searched number: ");
	int max = s.nextInt();
    s.close();
	int j;
	System.out.println();
    for (j=1 ; j<max; j++) {
    	
    	if (flag(j)) {System.out.println("Perfect number - " + j);} 
    	
    }	
		
	}

}
