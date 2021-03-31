package core; 
import java.util.Scanner;
public class HappyNumbers {
	static int inPow(int number, int power) {
		int result = 1;
		for (int i = 1; i<=power; i++) {
			result = number * result;
		}
		return result;		
	}
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = s.nextInt();
	int res=0;
	while (res != 1) {
		System.out.print(n + " =>> ");
		res = 0;
		while (n > 0) {
		res +=  inPow(n%10, 2);
		n /= 10;
		
		}
		n=res;
	}
	System.out.print(n );
	System.out.println();
	
	if (res==1) System.out.print("Your number is Happy!"); else System.out.print("Your number is Unhappy!");
	
}
}
