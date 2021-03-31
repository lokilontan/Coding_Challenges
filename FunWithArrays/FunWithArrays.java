package core;

import java.util.Scanner;
import java.util.Random;

public class FunWithArrays {
	
	//Filling the array with random numbers from the range [-100,100] Method
	public static void fillRandom(int[] tArray, Random tRandom){
		
				for (int i = 0; i < tArray.length; i++) {
					
					tArray[i] = tRandom.nextInt(100)-tRandom.nextInt(100);
					
				}
	}
	
		//Filling the array with a number Method
		public static void fillWith(int[] tArray, int tNum){
			
					for (int i = 0; i < tArray.length; i++) {
						
						tArray[i] = tNum;
						
					}
		}
		
		//Getting the sum Method
		public static void getSum(int[] tArray) {
			int sum = 0;
			for (int i = 0; i < tArray.length; i++) {
				
				sum += tArray[i];
				
			}
			System.out.println("Sum: " + sum);
		}
		
		//Getting the average Method
		public static void getAverage(int[] tArray) {
			int sum = 0;
			for (int i = 0; i < tArray.length; i++) {
				
				sum += tArray[i];
				
			}
			System.out.println("Average: " + sum/tArray.length);
		}		
		
		
	
	//Array displaying Method
	public static void displayArray(int[] tArray){
		
			System.out.print("This is your array: ");
			for (int i = 0; i < tArray.length; i++) {
				
				System.out.print(tArray[i] + " " );
				
			}
			System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		final Random random = new Random();
		Scanner in = new Scanner(System.in);
		int n;
		String pressed; 
		int input;
		
		System.out.print("We are going to create an array! How many elements would you like? \nN = ");
		n = in.nextInt();
		int[] a = new int[n];
    	System.out.println("Your array is created!");
    	System.out.println();
		
		do {
			
			System.out.println("1. Fill that array with a number.");
			System.out.println("2. Fill that array with random numbers.");
			System.out.println("3. Get the sum.");
			System.out.println("4. Get the average.");
			System.out.println("5. Display the array.");
			System.out.println();
			System.out.print("Choose the number of operation: ");
			System.out.println();
			
			input = in.nextInt();
			
			switch(input) {
		  	case 1: 
				System.out.print("Enter the number: ");
				n = in.nextInt();
			    fillWith(a, n);
			    displayArray(a);
				break;
			case 2: 
			    fillRandom(a, random);
			    displayArray(a);
				break;
			case 3: 
			    getSum(a);
				break;
			case 4: 
			    getAverage(a);
				break;
			case 5: 
			    displayArray(a);
				break;
			default: 
			    System.out.println("Enter the correct number of operation or exit the program!");;
			    System.out.println();
			    break;
		}
			
			System.out.println();
			System.out.print("Exit? (Y/N): ");
			pressed = in.next();
			
		}
		while ( !( pressed.equals("Y") || pressed.equals("y") ) );
		
	}

}
