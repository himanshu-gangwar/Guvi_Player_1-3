import java.io.*;

class Guvi_AddFullStop_4
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
	
	StringBuilder so=new StringBuilder(str);
	
	if(str.charAt(str.length()-1)=='.')
		System.out.println("No need of a period its already there");
	
	else
	{
		so.insert(str.length(),'.');
		System.out.println(so);
	}
     }
	
}
