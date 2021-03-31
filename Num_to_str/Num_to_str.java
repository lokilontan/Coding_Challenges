package core;
import java.io.*;
import java.util.Scanner;
public class Num_to_str
{
	
	public static String ones[]={"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};      
        public static String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
public static void main(String a[]) throws Exception
	{
        Scanner sc=new Scanner(System.in);
        int num,rem,t;   
 
      
         System.out.println("Enter the number:");
          num=sc.nextInt();
         System.out.println("Entered number is:");
      /*write down your logic here*/  
      if (num > 0 && num < 20) {System.out.print(ones[num-1]);}
      if (num >= 20 && num <= 90 && num % 10 == 0) {System.out.print(tens[num/10 - 2]);}
      if (num >= 21 && num <= 99 && num % 10 != 0) {System. out.print(tens[num/10 - 2] + " " + ones[num%10-1]);} 
	 
        }//main 


	 
}  
  
  







  











