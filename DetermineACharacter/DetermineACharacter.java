package core;

import java.util.Scanner;

public class DetermineACharacter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		String tempString;
		char c;
		
		do {
		    
		    System.out.print("Enter a character: ");  
		    tempString = input.next();
			c = tempString.charAt(0); // getting char from user
		    
		    if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z' )) System.out.println("You entered a letter."); 
		    else if (Character.isDigit(c)) System.out.println("You entered a digit.");
		    	else System.out.println("You entered neither digit or letter.");
		    
		    System.out.println();
		    System.out.print("Do you wanna try another temperature? (Y/N): ");  
		    tempString = input.next();
		    c = tempString.charAt(0);  //asking to continue
		    System.out.println();
		    
		    } while ( ( c == 'y' || c == 'Y' ));
		
	}

}
