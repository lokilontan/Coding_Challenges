package core;

import java.util.Scanner; 
import java.io.*;  

  
public class PalindromeString  
{  
	public static void main(String a[]) throws Exception  
	{  
           String strn;  
           int flag=0;  
           System.out.println("Enter the string:");  
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
           strn=br.readLine();  
           System.out.println("Result string is:");  
           //write your logic here  
           
           String rev = "";
           for (int i=strn.length()-1; i>=0; i--){
        	   
        	   rev = rev + strn.charAt(i);
        	   
           }
  
  
           if (strn.equalsIgnoreCase(rev)) {flag = 1;}
  
  
  
           //end  
           if(flag==1)  
               System.out.print("palindrome");  
           else   
               System.out.print("not a palindrome2");  
  
        }  
}  
