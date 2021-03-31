package core;

import java.util.Scanner;
import java.lang.Math; 

public class EscapeVelocity {
	
	public static void main (String[] args){
		
		final double G = 6.67 * Math.pow(10, -11);	 //Gravitational Constant
		final double M = 2.2 * Math.pow(10, 14);	//mass of Halley’s Comet
		final int R	= 5500; 					   //radius of Halley’s Comet
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("Enter the launch velocity(m/s) of the object: "); double launchVelocity = k.nextDouble(); //Launch Velocity reading
		
		double ve = Math.sqrt((2*G*M)/R); //Counting the Escape Velocity of Halley’s Comet 
		
		System.out.println();
		
		if (launchVelocity < ve) System.out.println("Jumper WILL return to the surface!"); 
		else System.out.println("Jumper WILL NOT return to the surface!");
		
	}

}
