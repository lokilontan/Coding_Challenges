package core;
import java.io.*;
import java.util.Scanner;
public class Lowcase_to_upcase {

	
	public static void main(String[] args) throws IOException
	  {
	   
	    String str;
	    String str_res = "";
	    byte ram;
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter a string:"); 
	    str = br.readLine();
	    for (int i = 0; i < str.length(); i++) {
	    	
	    	ram = (byte)str.charAt(i);
	    	if (ram >= 97 && ram <= 122) {ram -= 32;}
	    	str_res += (char) ram;
	    	
	    }
	    System.out.println("Uppercase conversion:");
	    System.out.println(str_res);
	    
	  }
	}


