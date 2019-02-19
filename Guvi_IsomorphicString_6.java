import java.io.*;
import java.util.*;

class Guvi_IsomorphicString_6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String first_string,second_string;
		
		System.out.println("Enter the first string");
		first_string = sc.next();
		
		System.out.println("Enter the second string");
		second_string = sc.next();
		
		int lf,ls,i,f=0;
		char chf,chs;
		
		lf=first_string.length();
		
		ls=second_string.length();
		
		int memo[]=new int[256];
		
		for(i=0;i<256;i++)
			memo[i]=-1;
			

		if(ls!=lf)
		{
			System.out.println("no");
		}
		
		else
		{
			for(i=0;i<ls;i++)
			{
				chf=(first_string.charAt(i));
				chs=(second_string.charAt(i));
				
				if(memo[chf]==-1)
				{
					memo[chf]=chs;
					memo[chs]=chf;
				}
				
				else if(memo[chf]!=chs)
					f=1;
			}
			
			if(f==0)
				System.out.println("yes");
			
			else
				System.out.println("no");

				
			
		}
		

	}
}