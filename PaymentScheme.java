import java.util.*;
import java.lang.*;
import java.io.*;

class PaymentScheme
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int scheme1 = 100 + 4 * X;
        int scheme2 = 300;
        
        System.out.println(Math.min(scheme1, scheme2));

	}
}
