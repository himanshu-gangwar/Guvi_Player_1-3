import java.io.*;

class Guvi_Reverse_1
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
	
	StringBuffer so=new StringBuffer(str);
	
	so.reverse();
	
	System.out.println(so);
     }
	
}
