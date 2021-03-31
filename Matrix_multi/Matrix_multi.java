package core;

import java.util.Scanner;

public class Matrix_multi {
	public static void main(String[] args) {
		
		int [][] a = new int[3][3]; 
		int [][] b = new int[3][3];
		int [][] res = new int [3][3];
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Введите элементы массива А!");
		System.out.println();
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3; j++) {
				System.out.println("Введите A["+(i+1)+","+(j+1)+"] - ");
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Введите элементы массива B!");
		System.out.println();
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3; j++) {
				System.out.println("Введите B["+(i+1)+","+(j+1)+"] - ");
				b[i][j]=s.nextInt();
			}
		}
		
		s.close();
		System.out.println();
		
		System.out.println("Элементы массива А:");
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Элементы массива B:");
		
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int sum = 0;
		for (int k = 0; k < 3; k++){
			for(int i = 0 ; i < 3 ; i++){
				for(int j = 0 ; j < 3; j++) {
					sum += (a[i][j]*b[j][k]);
			}
			res[k][i] = sum;
			sum = 0;
							
		}
			
		}
		System.out.println();
		System.out.println("А x B : ");
			
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3; j++) {
				System.out.print(res[j][i] +  " " );
			}
			System.out.println();
		}
	}
}
