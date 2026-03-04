import java.util.*;
import java.lang.*;
import java.io.*;

class Colour
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(X > Y){
		    System.out.println("Alice");
		}
		else if(Y > X){
		    System.out.println("Bob");
		}
		else{
		    System.out.println("Draw");
		}
	}
}
