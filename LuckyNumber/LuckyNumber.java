package core;
import java.util.Scanner;
public class LuckyNumber {
	
	static int lucky(int number) {
		int sum = 11;
		while (sum > 10) {
			sum = 0;
			while (number > 0){
				
				sum += number%10;
				number /= 10;  
				
			}
			number = sum;
		} 
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
	
		System.out.print("Its lucky number is "+ lucky(s.nextInt()));
	}

}
