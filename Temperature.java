import java.util.*;
import java.lang.*;
import java.io.*;

class Temperature
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
        for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
        int min = Arrays.stream(A).min().getAsInt();
            int max = Arrays.stream(A).max().getAsInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] != min && A[i] != max) {
                    count++;
                }
            }
            
            System.out.println(count);
	}
	}
}
