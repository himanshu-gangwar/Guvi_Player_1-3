import java.io.*;
import java.util.*;

class Guvi_NumberFromRoman_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String roman_numeral;
		int i, r_value, next_r_value, decimal_value=0;
		char r,next_r;
		System.out.println("Enter the Roman Numeral less than 20");
		roman_numeral = sc.next();
		
		for(i=0;i<roman_numeral.length();i++)
		{	
			r = roman_numeral.charAt(i);
			
			r_value = int_value(r);
			
			if(r_value == -1)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			
			if (i+1 < roman_numeral.length()) 
			{ 
				next_r = roman_numeral.charAt(i+1); 
				next_r_value = int_value(next_r);
				
				
				if(next_r_value == -1)
				{
					System.out.println("Invalid Input");
					System.exit(0);
				}
		  
				else if (r_value >= next_r_value) 
				{ 
					decimal_value += r_value; 
				} 
				else
				{ 
					decimal_value += (next_r_value - r_value); 
					i++; 
				} 
			} 
			else
			{ 
				decimal_value += r_value; 
				i++; 
			} 
		}
		
		System.out.println(decimal_value);
	
	}
		
	static int int_value(char r)
	{
			if (r == 'I') 
				return(1); 
			if (r == 'V') 
				return(5); 
			if (r == 'X') 
				return(10);
			else
				return(-1);
			
	}
}