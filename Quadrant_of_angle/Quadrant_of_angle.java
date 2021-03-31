package core;

import java.util.Scanner;

public class Quadrant_of_angle {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Введите величину угла (0 - 360)!");
		short n = (short) s.nextInt();
	    s.close();
	    System.out.println("Угол величиной в "+n+" находится в " + (((n/90) == 4) ? 1 : (n/90)+1) + " квадранте!");
		
		
	}

}
