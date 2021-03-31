package core;

import java.util.Scanner;

public class Duplicate_Numbers

{  
    public static void main(String args[])
    {
//
    Scanner s = new Scanner (System.in);
        System.out.print("Enter the quantity of elements: ");  int q = s.nextInt();
        System.out.println(); 
        int[] a = new int[q];
        int i;
        for (i = 0; i < q; i++) {
            System.out.print("Enter " + (i+1) + " element: "); a[i] = s.nextInt();
            System.out.println(); }
        s.close();
        
        int j;
        for (i = 0; i < q; i++) {
           for (j = i+1; j < q; j++) {
               if  (a[i] == a[j]) {System.out.println("Duplicate: " + a[i]); break;}
                
            
            }
        
        }
        
 
    }
}