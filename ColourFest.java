import java.util.*;
import java.lang.*;
import java.io.*;

class ColourFest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int N = sc.nextInt();
		    
		    HashSet<Integer> set = new HashSet<>();
		    
		    for(int i = 0; i < N; i++){
		        int c = sc.nextInt();
		        set.add(c);
		    }
		    
		    System.out.println(set.size());
		}
	}
}