import java.util.*;
import java.lang.*;
import java.io.*;

class MinAndOp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T-- > 0){
		    long N = sc.nextLong();
		    long k = N / 2;
		    long ans = k * (k + 1);
		    System.out.println(ans);
		}
	}
}