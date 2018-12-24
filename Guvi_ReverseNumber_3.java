import java.io.*;

class Guvi_ReverseNumber_3
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	int no,rno;

	System.out.println("Enter the number");
	no=Integer.parseInt(in.readLine());
	
	StringBuffer so=new StringBuffer(Integer.toString(no));
	
	so.reverse();
	
	rno=Integer.valueOf(so.toString());
	
	System.out.println(rno);
     }
	
}
