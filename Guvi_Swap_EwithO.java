import java.io.*;
import java.util.*;

class Guvi_Swap_EwithO
{
	
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str,res;
		
		System.out.println("Enter the string");
		str = in.readLine();
		
		char arr[]=str.toCharArray();
		
		int l,i;
		
		char temp;
		
		l=str.length();
		
		for(i=0;i<l-1;i=i+2)
		{
			
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		res=new String(arr);
		
		System.out.println(res);
	}
	
}