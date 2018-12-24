import java.io.*;

class Guvi_factorial_2
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	int no;
	long f=1;

	System.out.println("Enter the number");
	no=Integer.parseInt(in.readLine());
	
	while(no!=0)
	{
		f=f*no;
		no--;
	}
	System.out.println(f);
     }
	
}
