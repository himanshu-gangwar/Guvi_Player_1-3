import java.io.*;
import java.util.*;

class Guvi_Camel_Case_8
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str,res;
		
		System.out.println("Enter the string");
		str = in.readLine();
		
		char strarr[]=str.toCharArray();
		
		int l,i;
		
		l=str.length();
		
		strarr[0]=Character.toUpperCase(strarr[0]);
		
		for(i=1;i<l;i++)
		{
			
			if(strarr[i-1]==' ')
			{
				strarr[i]=Character.toUpperCase(strarr[i]);
			}
			else
			{
				strarr[i]=Character.toLowerCase(strarr[i]);
			}			
		}
		
		res=new String(strarr);
		
		System.out.println(res);
		
		

	}
}