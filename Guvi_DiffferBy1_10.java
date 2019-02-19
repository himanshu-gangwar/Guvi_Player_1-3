import java.io.*;
import java.util.*;

class Guvi_DiffferBy1_10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String first_string,second_string;
		
		System.out.println("Enter the first string");
		first_string = sc.next();
		
		System.out.println("Enter the second string");
		second_string = sc.next();
		
		int lf,ls,c=0,i;
		
		char ch,ch1;
		
		lf=first_string.length();
		
		ls=second_string.length();

		if(ls!=lf)
		{
			System.out.println("no");
		}
		
		else
		{
			for(i=0;i<ls;i++)
			{
				ch=first_string.charAt(i);
				
				ch1=second_string.charAt(i);
				
				if(ch!=ch1)
				{
					c++;
				}
					
			}
			
			if(c==0)
				System.out.println("no they are identical");
			else if(c==1)
				System.out.println("yes");
			else
				System.out.println("no");

		}
		

	}
}